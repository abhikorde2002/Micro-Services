package com.example.User_Management.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.User_Management.entites.User;

public interface User_Repo extends JpaRepository<User,String>{
    
}
