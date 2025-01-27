package com.RevanthFirstSBProject.OfficeManagementApp.controller;

import com.RevanthFirstSBProject.OfficeManagementApp.model.Manager;
import com.RevanthFirstSBProject.OfficeManagementApp.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ManagerController {


    @Autowired
    ManagerService managerService;

  //    adding an Manager
    @PostMapping("/add-Manager")
  public String addManager(@RequestBody Manager manager){
        managerService.addManager(manager);
        return "Manager Successfully Regisetered";
    }

    @GetMapping("/get Manager")
    public Manager getManager(@RequestParam("id") int managerid){
        return managerService.getManager(managerid);
    }

    @DeleteMapping("/delete-Manager/{id}")
    public String deleteManager(@PathVariable("id") int managerId){
         managerService.deleteManager(managerId);
        return "Manager Deleted Successfully";
    }


}
