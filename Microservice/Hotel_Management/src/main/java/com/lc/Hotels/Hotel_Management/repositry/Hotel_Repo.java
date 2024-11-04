package com.lc.Hotels.Hotel_Management.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lc.Hotels.Hotel_Management.entity.Hotel;

public interface Hotel_Repo extends JpaRepository<Hotel,String> {
    
}
