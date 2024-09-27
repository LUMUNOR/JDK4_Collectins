package org.example;

import Directory.EmployDirectory;

public class Main {
    public static void main(String[] args) {
        EmployDirectory employDirectory = new EmployDirectory();
        employDirectory.addEmploy("Иван",4567,892045686,3);
        employDirectory.addEmploy("Мария",4568,892045656,2);
        employDirectory.addEmploy("Максим",4569,892047686,1);

        System.out.println(employDirectory.searchByExperience(2));
        System.out.println(employDirectory.searchPhoneByName("Максим"));
        System.out.println(employDirectory.searchByTab(4567));
        }
    }