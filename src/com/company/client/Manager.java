package com.company.client;

public class Manager {
    protected String department = "Unknown";
    protected void depmen() {
    	department = "u";
    }
    protected void printDepartment() {
        System.out.println("Отдел: " + department);
    }
}
