package com.RevanthFirstSBProject.OfficeManagementApp.model;

public class Employee {
   private int empId;
   private String name;
   private int age;
   private String department;
   private String Gender;
   private int salary;

//   default Constructor
    public Employee() {
    }

//    all argument constructor
    public Employee(int empId, String name, int age, String department, String gender, int salary) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.department = department;
        Gender = gender;
        this.salary = salary;
    }

//    getters and setters
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
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

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
