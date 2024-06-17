package com.example.patrickSer.controller;

import com.example.patrickSer.Service.RoleInformationService;
import com.example.patrickSer.model.RoleInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roleinfo")
@CrossOrigin(origins = "http://localhost:3000")
public class RoleInformationController {

    @Autowired
    private RoleInformationService roleInformationService;

    @PostMapping
    public void createRoleInformation(@RequestBody RoleInformation roleInformation) {
        roleInformationService.createRoleInformation(roleInformation);
    }

    @GetMapping
    public List<RoleInformation> getAllRoleInformation() {
        return roleInformationService.getAllRoleInformation();
    }
}
