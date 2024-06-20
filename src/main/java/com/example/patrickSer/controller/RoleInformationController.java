package com.example.patrickSer.controller;

import com.example.patrickSer.DTO.RoleRequest;
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
    public String createRoleInformation(@RequestBody RoleInformation roleInformation) {
        roleInformationService.createRoleInformation(roleInformation);
        return "创建"+roleInformation.getRoleName()+"成功";
    }

    @GetMapping
    public List<RoleInformation> getAllRoleInformation() {
        return roleInformationService.getAllRoleInformation();
    }

    @DeleteMapping()
    public String deleteRoleInformation(@RequestBody RoleRequest roleRequest) {
        System.out.println("Received ID: " + roleRequest.get_id());
        roleInformationService.deleteRoleInformation(roleRequest.get_id());
        return "删除" + roleRequest.get_id()+ "成功";
    }
}
