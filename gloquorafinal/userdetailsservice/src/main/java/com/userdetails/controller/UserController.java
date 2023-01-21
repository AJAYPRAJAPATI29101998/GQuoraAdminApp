package com.userdetails.controller;

import com.userdetails.model.Address;
import com.userdetails.model.Geo;
import com.userdetails.model.UserDetails;
import com.userdetails.repository.AddressRepo;
import com.userdetails.repository.GeoRepo;
import com.userdetails.service.UserServiceImplementaion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserServiceImplementaion userServiceImplementaion;
    @Autowired
    private GeoRepo geoRepo;
    @Autowired
    private AddressRepo repo;
    @PostMapping("/add")
    public ResponseEntity<?> addUser(@RequestBody UserDetails userDetails){



        return new ResponseEntity<>(userServiceImplementaion.addUser(userDetails), HttpStatus.CREATED);
    }

    @GetMapping("/findId{id}")
    public ResponseEntity<?> getUserById(@PathVariable int id){

        return new ResponseEntity<>(userServiceImplementaion.getSpecificUserDetails(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllUsers(){

        return new ResponseEntity<>(userServiceImplementaion.getAllUserDetails(), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateUser(@RequestBody UserDetails userDetails){

        return new ResponseEntity<>(userServiceImplementaion.UpdateUser(userDetails), HttpStatus.OK);
    }

    @DeleteMapping("/delete{id}")
    public ResponseEntity<?> deleteUser(@PathVariable int id){
        return new ResponseEntity<>(userServiceImplementaion.DeleteUser(id), HttpStatus.OK);

    }

}
