package com.lc.Hotels.Hotel_Management.Service;

import java.util.List;

import com.lc.Hotels.Hotel_Management.entity.Hotel;

public interface HotelService {
    
    Hotel create(Hotel hotel);
    List<Hotel> getAll();

    Hotel single(String id);

}
