package api.springTest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.springTest.model.User;
import api.springTest.repository.UserRepository;
import api.springTest.service.UserService;
import api.springTest.service.exceptions.ObjectNotFoundException;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repsository;

    @Override
    public User findById(Integer id) {
    
        Optional<User> obj=repsository.findById(id);

        return obj.orElseThrow(()-> new ObjectNotFoundException("Object not found"));
    }

}
