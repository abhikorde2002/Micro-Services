package com.example.User_Management.controler;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.User_Management.entites.User;
import com.example.User_Management.sevices.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/users")
public class User_Controler {
    
    @Autowired
    private UserService us;

    // @PostMapping
    // public ResponseEntity<User> createUser(@RequestBody User user){
    //     User user1= us.savUser(user);
    //     return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    // }

    // @GetMapping("/{userId}")
    // public ResponseEntity<User> getSingleUser(@PathVariable String userId){
    //   User user = us.getUser(userId);
    //   return ResponseEntity.ok(user);
    // }

    // @GetMapping
    // public ResponseEntity<List<User>> getAllUser(){
    //    List<User> allUser= us.getAllUser();
    //    return ResponseEntity.ok(allUser);
    // }
    @PostMapping(produces = "application/json")
public ResponseEntity<User> createUser(@RequestBody User user){
    User user1 = us.savUser(user);
    return ResponseEntity.status(HttpStatus.CREATED).body(user1);
}

@GetMapping(value = "/{userId}", produces = "application/json")
public ResponseEntity<User> getSingleUser(@PathVariable String userId){
    User user = us.getUser(userId);
    return ResponseEntity.ok(user);
}

@GetMapping(produces = "application/json")
public ResponseEntity<List<User>> getAllUser(){
    List<User> allUser = us.getAllUser();
    return ResponseEntity.ok(allUser);
}
    
}
