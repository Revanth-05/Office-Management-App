package com.RevanthFirstSBProject.OfficeManagementApp.model;

public class Manager {

    private int managerId;
    private String name;
    private int age;
    private String department;
    private int salary;
    private String gender;

    private int numberOfReportees;

    public Manager() {
    }

    public Manager(int managerId, String name, int age, int salary, String department, int numberOfReportees, String gender) {
        this.managerId = managerId;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.numberOfReportees = numberOfReportees;
        this.gender = gender;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNumberOfReportees() {
        return numberOfReportees;
    }

    public void setNumberOfReportees(int numberOfReportees) {
        this.numberOfReportees = numberOfReportees;
    }
}
