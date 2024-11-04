package com.example.User_Management.sevices;

import java.util.List;


import com.example.User_Management.entites.User;


public interface UserService {
    
    User savUser(User user);

    List<User> getAllUser();

    
    User getUser(String userId);

    //Update 
    //Delete
}
