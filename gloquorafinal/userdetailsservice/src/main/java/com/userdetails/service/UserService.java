package com.userdetails.service;

import com.userdetails.model.UserDetails;

import java.util.List;
import java.util.Optional;

public interface UserService {
   UserDetails addUser(UserDetails userDetails);
   Optional<UserDetails> getSpecificUserDetails(int id);

  String DeleteUser(int id);
          UserDetails UpdateUser(UserDetails userDetails);

    List<UserDetails>  getAllUserDetails();

}
