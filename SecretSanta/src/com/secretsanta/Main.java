package com.secretsanta;

import com.secretsanta.model.Employee;
import com.secretsanta.service.CsvParser;
import com.secretsanta.service.SecretSantaService;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        CsvParser parser = new CsvParser();
        SecretSantaService santaService = new SecretSantaService();
        
        try {
            List<Employee> employees = parser.parseEmployeeFile("data/employees.csv");
            Map<String, String> previousAssignments = parser.parsePreviousAssignments("data/previous_year.csv");

            List<Employee> assignments = santaService.assignSecretSantas(employees, previousAssignments);
            writeAssignmentsToFile(assignments, "data/output.csv");

            System.out.println("Secret Santa assignments completed successfully!");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void writeAssignmentsToFile(List<Employee> assignments, String outputPath) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));
        writer.write("Employee_Name,Employee_EmailID,Secret_Child_Name,Secret_Child_EmailID\n");

        for (int i = 0; i < assignments.size(); i++) {
            Employee giver = assignments.get(i);
            Employee receiver = assignments.get((i + 1) % assignments.size()); // Circular Assignment

            writer.write(giver.getName() + "," + giver.getEmail() + ","
                    + receiver.getName() + "," + receiver.getEmail() + "\n");
        }
        writer.close();
    }
}
