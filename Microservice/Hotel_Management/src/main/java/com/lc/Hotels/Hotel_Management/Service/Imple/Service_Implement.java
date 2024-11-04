package com.lc.Hotels.Hotel_Management.Service.Imple;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lc.Hotels.Hotel_Management.Service.HotelService;
import com.lc.Hotels.Hotel_Management.entity.Hotel;
import com.lc.Hotels.Hotel_Management.exception.Resouce_Not_Founds;
import com.lc.Hotels.Hotel_Management.repositry.Hotel_Repo;

@Service
public class Service_Implement implements HotelService {
    
    @Autowired 
    Hotel_Repo repo;

    @Override
    public Hotel create(Hotel hotel) {
      String randomUserId = UUID.randomUUID().toString();  
      hotel.setId(randomUserId);
       return repo.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
      return repo.findAll();
    }

    @Override
    public Hotel single(String id) {
        return repo.findById(id).orElseThrow(() -> new Resouce_Not_Founds("Hotel Not found with given id"+id));
    }
    
}
