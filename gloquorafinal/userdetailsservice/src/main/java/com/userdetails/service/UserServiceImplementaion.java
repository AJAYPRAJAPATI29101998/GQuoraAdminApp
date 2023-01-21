package com.userdetails.service;

import com.userdetails.model.UserDetails;
import com.userdetails.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplementaion implements UserService{

@Autowired
private UserRepository userRepository;
    @Override
    public UserDetails addUser(UserDetails userDetails) {
        return userRepository.save(userDetails);
    }

    @Override
    public Optional<UserDetails> getSpecificUserDetails(int id) {
        return userRepository.findById(id);
    }

    @Override
    public String DeleteUser(int id) {
         userRepository.deleteById(id);
         return "delete Successfully";
    }

    @Override
    public UserDetails UpdateUser(UserDetails userDetails) {
        return userRepository.save(userDetails);
    }

    @Override
    public List<UserDetails> getAllUserDetails() {
        return userRepository.findAll();
    }
}
