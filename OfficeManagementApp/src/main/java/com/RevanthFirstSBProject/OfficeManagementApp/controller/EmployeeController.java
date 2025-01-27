package com.RevanthFirstSBProject.OfficeManagementApp.controller;

import com.RevanthFirstSBProject.OfficeManagementApp.model.Employee;
import com.RevanthFirstSBProject.OfficeManagementApp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


//whenever we make API constructors we need to make rest api annotation
@RestController
@RequestMapping("/Employee")
public class EmployeeController {


    @Autowired
    EmployeeService employeeService;

//    adding an Employee
    @PostMapping("/add-employee")
    public String addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return "Employee registered Successfully.";
    }

//    getting Employee details
    @GetMapping("/get-Employee")
    public Employee getEmployee(@RequestParam("id") int empId){
      return employeeService.getEmployee(empId);
    }

//    delete an Employee
    @DeleteMapping("/delete-Employee/{id}")
    public String deleteEmployee( @PathVariable("id") int empId){
        employeeService.deleteEmployee(empId);
        return "Employee Successfully Deleted";
    }

//    updating the salary of an employee
    @PutMapping("/update-salary")
    public Employee updateSalary(@RequestParam("id") int empId,@RequestParam("new-salary") int salary){
         return employeeService.updateSalary(empId, salary);
    }

    @GetMapping("/get-highest-salary")
    public Employee getMaxSalariedEmp(){
        return employeeService.getMaxSalariedEmp();
    }
}
