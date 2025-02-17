package com.secretsanta.service;

import com.secretsanta.model.Employee;
import java.io.*;
import java.util.*;

public class CsvParser {
    
    public List<Employee> parseEmployeeFile(String filePath) throws IOException {
        List<Employee> employees = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        br.readLine(); // Skip header
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            employees.add(new Employee(data[0].trim(), data[1].trim()));
        }
        br.close();
        return employees;
    }

    public Map<String, String> parsePreviousAssignments(String filePath) throws IOException {
        Map<String, String> previousAssignments = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        br.readLine(); // Skip header
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            previousAssignments.put(data[0].trim(), data[2].trim()); // Employee_Name -> Secret_Child_Name
        }
        br.close();
        return previousAssignments;
    }
}
