package com.example.patrickSer.Service;

import com.example.patrickSer.model.RoleInformation;
import com.example.patrickSer.repository.RoleInformationRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleInformationService {

    @Autowired
    private RoleInformationRepository roleInformationRepository;

    public List<RoleInformation> getAllRoleInformation() {
        return roleInformationRepository.findAll();
    }

    public void createRoleInformation(RoleInformation roleInformation) {
        roleInformationRepository.save(roleInformation);
    }

    public void deleteRoleInformation(String id) {
        try {
            ObjectId objectId = new ObjectId(id);
            roleInformationRepository.deleteById(objectId);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid ObjectId: " + id);
        }
    }
}
