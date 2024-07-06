package api.springTest.service;

import org.springframework.stereotype.Service;

import api.springTest.model.User;


@Service
public interface UserService {

    User findById(Integer id);
}
