package com.example.User_Management.sevices.implement;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.User_Management.entites.Rating;
import com.example.User_Management.entites.User;
import com.example.User_Management.exception.Resouce_Not_Found;
import com.example.User_Management.repo.User_Repo;
import com.example.User_Management.sevices.UserService;

@Service
public class User_Imp  implements UserService{
     
    @Autowired
    private User_Repo repo;

    @Autowired
    private RestTemplate restTemplate;

    private Logger l = LoggerFactory.getLogger(User_Imp.class);
    @Override
    public User savUser(User user) {
      String randomUserId = UUID.randomUUID().toString();  
      user.setUserId(randomUserId);
      return repo.save(user);
    }

    @Override
    public List<User> getAllUser() {
      return repo.findAll();

    }

    @Override
    public User getUser(String userId) {
       User user= repo.findById(userId).orElseThrow(() -> new Resouce_Not_Found("User Not found with given id"+userId));
       ArrayList<Rating> list=restTemplate.getForObject("http://192.168.0.100:8083/ratings/users/"+user.getUserId(), ArrayList.class);
       l.info("{} ",list);
       user.setRatings(list);
       return user;
    }
    
}
