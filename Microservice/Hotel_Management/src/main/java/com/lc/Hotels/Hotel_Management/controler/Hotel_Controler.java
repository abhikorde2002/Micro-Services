package com.lc.Hotels.Hotel_Management.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lc.Hotels.Hotel_Management.Service.HotelService;
import com.lc.Hotels.Hotel_Management.entity.Hotel;


@RestController
@RequestMapping("/hotel")
public class Hotel_Controler {
    @Autowired
    private HotelService h;
    
    @PostMapping
     public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        Hotel hot= h.create(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(hot);
     }


     @GetMapping("/{userId}")
      public ResponseEntity<Hotel> getSingleHotel(@PathVariable String userId){
        return ResponseEntity.ok().body(h.single(userId));
      }
      
      @GetMapping
      public ResponseEntity<List<Hotel>> getAll(){
        return ResponseEntity.ok(h.getAll());
      }
}
