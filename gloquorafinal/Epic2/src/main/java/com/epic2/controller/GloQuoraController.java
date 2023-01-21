package com.epic2.controller;


import com.epic2.model.GloQuora_Post;
import com.epic2.service.GloQuoraServiceImplementaion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GloQuoraController {

    @Autowired
    private GloQuoraServiceImplementaion gloQuoraServiceImplementaion;
    @PostMapping("/add")
    public ResponseEntity<?> addUser(@RequestBody GloQuora_Post gloQuora){



        return new ResponseEntity<>(gloQuoraServiceImplementaion.Add_GloQuora_Post(gloQuora), HttpStatus.CREATED);
    }

//    @GetMapping("/findId{id}")
//    public ResponseEntity<?> getUserById(@PathVariable int id){
//
//        return new ResponseEntity<>(gloQuoraServiceImplementaion., HttpStatus.OK);
//    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllUsers(){

        return new ResponseEntity<>(gloQuoraServiceImplementaion.GetAllGloQuora_Post(), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateUser(@RequestBody GloQuora_Post gloQuoraUpdated){

        return new ResponseEntity<>(gloQuoraServiceImplementaion.Update_GloQuora_Post(gloQuoraUpdated), HttpStatus.OK);
    }

    @DeleteMapping("/delete{id}")
    public ResponseEntity<?> deleteUser(@PathVariable int id){
        return new ResponseEntity<>(gloQuoraServiceImplementaion.Delete_GloQuora_Post(id), HttpStatus.OK);

    }

}
