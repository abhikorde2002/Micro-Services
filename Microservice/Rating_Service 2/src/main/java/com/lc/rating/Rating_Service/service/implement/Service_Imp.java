package com.lc.rating.Rating_Service.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;

import com.lc.rating.Rating_Service.entity.Rating;
import com.lc.rating.Rating_Service.repo.Repositry;
import com.lc.rating.Rating_Service.service.Rating_Service;

@Service
public class Service_Imp implements Rating_Service {
     
    @Autowired
    private Repositry repo;
    
    @Override
    public Rating create(Rating rate) {
        return repo.save(rate);
    }

    @Override
    public List<Rating> getRating() {
       return repo.findAll();
    }

    @Override
    public List<Rating> getRatingUser(String id) {
       return repo.findByUserId(id);
    }

    @Override
    public List<Rating> getRattingByHotelId(String hotelId) {
       return repo.findByHotelId(hotelId);
    }
    
}
