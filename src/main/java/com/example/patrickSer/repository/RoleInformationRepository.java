package com.example.patrickSer.repository;

import com.example.patrickSer.model.RoleInformation;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface RoleInformationRepository extends MongoRepository<RoleInformation,ObjectId> {
}
