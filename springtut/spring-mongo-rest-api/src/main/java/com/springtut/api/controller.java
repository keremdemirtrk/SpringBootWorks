package com.springtut.api;

import com.springtut.entity.User;
import com.springtut.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/user")
public  class controller {

    @Autowired
    private  userRepository userrepository;

    @PostConstruct
    public void init(){
        User user = new User();
        user.setName("Kerem");
        user.setSurname("Demirtürk");
        userrepository.save(user);
    }

    @PostMapping
    public  ResponseEntity<User> add(@RequestBody User user){
        return ResponseEntity.ok(userrepository.save(user));
    }
    @GetMapping
    public  ResponseEntity<List<User>> listall(){
        return ResponseEntity.ok(userrepository.findAll());
    }
}
