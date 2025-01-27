package com.RevanthFirstSBProject.OfficeManagementApp.repository;

import com.RevanthFirstSBProject.OfficeManagementApp.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeRepository {

    //    using hashmap as my Database
    Map<Integer, Employee> empDb = new HashMap<>();

    public void addEmployee(Employee employee){
    empDb.put(employee.getEmpId(), employee);
    }

    public Employee getEmployee(int empId){
        return empDb.get(empId);
    }

    public void deleteEmployee(int empId) {
        empDb.remove(empId);
    }

    public Employee updateSalary(int empId, int newSalary) {
        Employee needtoupdateSalaryemployee = empDb.get(empId);
        needtoupdateSalaryemployee.setSalary(newSalary);
        return needtoupdateSalaryemployee;
    }

    public Employee getMaxSalariedEmp(){
        int maxSalary = 0;
        Employee highestPaidEmp = null;
        for(int empId : empDb.keySet()){
            Employee currEmp =  empDb.get(empId);
            if(currEmp.getSalary()  > maxSalary){
                maxSalary = currEmp.getSalary();
                highestPaidEmp =currEmp ;
            }
        }
        return  highestPaidEmp;
    }
}
