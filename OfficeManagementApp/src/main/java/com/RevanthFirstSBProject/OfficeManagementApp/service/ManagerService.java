package com.RevanthFirstSBProject.OfficeManagementApp.service;

import com.RevanthFirstSBProject.OfficeManagementApp.model.Manager;
import com.RevanthFirstSBProject.OfficeManagementApp.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {

    @Autowired
    ManagerRepository managerRepository;
    public void addManager(Manager manager) {
        managerRepository.addManager(manager);
    }

    public Manager getManager(int managerid) {
       return managerRepository.getManager(managerid);
    }

    public void deleteManager(int managerId){
         managerRepository.deleteManager(managerId);
    }
}
