package com.epic2.service;


import com.epic2.model.GloQuora_Post;

import java.util.List;

public interface GloQuoraService {
   List<GloQuora_Post> GetAllGloQuora_Post();
           GloQuora_Post Add_GloQuora_Post(GloQuora_Post gloQuoraPost);
   String Delete_GloQuora_Post(int id);
           GloQuora_Post Update_GloQuora_Post(GloQuora_Post gloQuoraPost);





}
