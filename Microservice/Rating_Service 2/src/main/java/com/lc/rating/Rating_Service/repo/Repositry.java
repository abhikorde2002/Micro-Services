package com.lc.rating.Rating_Service.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.*;
import com.lc.rating.Rating_Service.entity.Rating;

public interface Repositry extends MongoRepository<Rating,String>{
    //custom finder  method
    List<Rating> findByUserId(String userId);

    List<Rating> findByHotelId(String hotelId);
}
