package api.springtest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import api.springTest.model.User;
import api.springTest.repository.UserRepository;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {
    
    @Autowired
    private UserRepository repositoy;

    @Bean
    public void startDB(){

        User u1=new User(null, "jose", "jose@gmail.com", "1234");

        User u2=new User(null, "josel", "jose05@gmail.com", "1234");

        repositoy.saveAll(List.of(u1, u2));
    }
}
