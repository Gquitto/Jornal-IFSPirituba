package com.gquitto.jornal.model.users.dal;


import com.gquitto.jornal.model.users.tables.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/user/")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "getall")
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @PostMapping(value = "newuser")
    public String createUser(@RequestParam User newUser) {
        if (!isSuitable(newUser)){
            return "User cant have empty fields";
        }else if (userRepository.countAllByEmail(newUser.getEmail()) > 0){
            return "User is already registered";
        }

        userRepository.save(newUser);
        return "User saved!";
    }

    //Private methods

    private Boolean isSuitable(User user) {
        if ((user.getEmail() != null) && (user.getPassword() != null)){
            return true;
        }
        return false;
    }

}
