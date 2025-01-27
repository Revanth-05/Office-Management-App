package com.RevanthFirstSBProject.OfficeManagementApp.repository;

import com.RevanthFirstSBProject.OfficeManagementApp.model.Employee;
import com.RevanthFirstSBProject.OfficeManagementApp.model.Manager;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ManagerRepository {

    //    creating Manager class similar to employee
    //   -------- Manager --------
    Map< Integer , Manager> ManagerDb = new HashMap<>();

    public void addManager(Manager manager) {
        ManagerDb.put(manager.getManagerId(), manager);
    }

    public Manager getManager(int managerid){
        return ManagerDb.get(managerid);
    }

    public void deleteManager(int managerId){
        ManagerDb.remove(managerId);
    }
}
