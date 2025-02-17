package com.secretsanta.service;

import com.secretsanta.model.Employee;
import java.util.*;

public class SecretSantaService {

    public List<Employee> assignSecretSantas(List<Employee> employees, Map<String, String> previousAssignments) {
        List<Employee> receivers = new ArrayList<>(employees);
        Collections.shuffle(receivers);

        Map<Employee, Employee> assignments = new HashMap<>();

        for (Employee giver : employees) {
            for (Employee receiver : receivers) {
                if (!giver.getName().equals(receiver.getName()) && 
                    !previousAssignments.getOrDefault(giver.getName(), "").equals(receiver.getName())) {

                    assignments.put(giver, receiver);
                    receivers.remove(receiver);
                    break;
                }
            }
        }

        if (assignments.size() != employees.size()) {
            System.out.println("Reassigning due to conflicts...");
            return assignSecretSantas(employees, previousAssignments); // Retry if failed
        }

        return new ArrayList<>(assignments.values());
    }
}
