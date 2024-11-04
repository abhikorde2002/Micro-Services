package com.lc.rating.Rating_Service.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lc.rating.Rating_Service.entity.Rating;
import com.lc.rating.Rating_Service.service.Rating_Service;
import java.util.*;

@RestController
@RequestMapping("/ratings")
public class Rating_Controler {
    @Autowired
    private Rating_Service rea;

    @PostMapping
    public ResponseEntity<Rating> create(@RequestBody Rating reate){
        return ResponseEntity.status(HttpStatus.CREATED).body(rea.create(reate));
    }

    @GetMapping
    public ResponseEntity<List<Rating>> getRatings(){
        return ResponseEntity.ok(rea.getRating());
    } 

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable String userId){
        return ResponseEntity.ok(rea.getRatingUser(userId));
    } 

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingsByHotelId(@PathVariable String hotelId){
        return ResponseEntity.ok(rea.getRattingByHotelId(hotelId));
    } 
}
