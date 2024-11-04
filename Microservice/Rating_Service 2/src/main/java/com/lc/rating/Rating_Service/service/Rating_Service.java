package com.lc.rating.Rating_Service.service;

import java.util.List;

import com.lc.rating.Rating_Service.entity.Rating;

public interface Rating_Service {
    

    //create
    Rating create(Rating rate);
    
    //Get all user
    List<Rating> getRating();

    //Gat Single User
    List<Rating> getRatingUser(String id);

    //get all hotel
    List<Rating> getRattingByHotelId(String hotelId);
}
