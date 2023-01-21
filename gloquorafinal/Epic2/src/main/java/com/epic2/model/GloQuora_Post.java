package com.epic2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "epic2glo")
public class GloQuora_Post {


    private int userId;
    private int Post_id;
    private String Title;

    private String Body;

}
