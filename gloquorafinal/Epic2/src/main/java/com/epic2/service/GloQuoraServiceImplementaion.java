package com.epic2.service;

import com.epic2.model.GloQuora_Post;

import com.epic2.repository.GeoQuoraRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GloQuoraServiceImplementaion implements GloQuoraService {

@Autowired(required = true)
public GeoQuoraRepo geoQuoraRepo;
    @Override
    public List<GloQuora_Post> GetAllGloQuora_Post() {
        return geoQuoraRepo.findAll();
    }

    @Override
    public GloQuora_Post Add_GloQuora_Post(GloQuora_Post gloQuoraPost) {
        return geoQuoraRepo.save(gloQuoraPost);
    }

    @Override
    public String Delete_GloQuora_Post(int id) {
         geoQuoraRepo.deleteById(id);
        return "deleted";
    }

    @Override
    public GloQuora_Post Update_GloQuora_Post(GloQuora_Post gloQuoraPost) {
        return geoQuoraRepo.save(gloQuoraPost);
    }
}
