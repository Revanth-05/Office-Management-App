package com.RevanthFirstSBProject.OfficeManagementApp.service;


import com.RevanthFirstSBProject.OfficeManagementApp.model.Employee;
import com.RevanthFirstSBProject.OfficeManagementApp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public void addEmployee(Employee employee){
        employeeRepository.addEmployee(employee);
    }

    public Employee getEmployee(int empId){
        return employeeRepository.getEmployee(empId);
    }

    public void deleteEmployee(int empId) {
        employeeRepository.deleteEmployee(empId);
    }

    public Employee updateSalary(int empId, int salary) {
       return employeeRepository.updateSalary(empId, salary);
    }

    public Employee getMaxSalariedEmp() {
        return employeeRepository.getMaxSalariedEmp();
    }
}
