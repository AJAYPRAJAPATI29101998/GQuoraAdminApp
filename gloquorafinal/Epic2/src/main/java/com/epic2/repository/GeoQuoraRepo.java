package com.epic2.repository;

import com.epic2.model.GloQuora_Post;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface GeoQuoraRepo extends MongoRepository<GloQuora_Post,Integer> {

}
