package me.bactoria.project.day04.user;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    private ARepository aRepository;

    public UserService(UserRepository userRepository, ARepository aRepository) {
        this.userRepository = userRepository;
        this.aRepository = aRepository;
    }

    public UserService() {

    }


    public UserRepository getUserRepository() {
        return userRepository;
    }

    public ARepository getARepository() {
        return aRepository;
    }
}
