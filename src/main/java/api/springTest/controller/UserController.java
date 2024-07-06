package api.springTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.springTest.model.User;
import api.springTest.service.UserService;

@RestController
@RequestMapping(value = "/user")
// @CrossOrigin(origins = "http://localhost:8080")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping(value="/{id}")
    public ResponseEntity<User> fidById(@PathVariable Integer id){
        return ResponseEntity.ok().body(service.findById(id));
    }
    

    // pst
    
}
