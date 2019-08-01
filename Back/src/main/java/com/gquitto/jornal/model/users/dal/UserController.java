package com.gquitto.jornal.model.users.dal;


import com.gquitto.jornal.model.users.dto.UserDto;
import com.gquitto.jornal.model.users.tables.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/user/")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("getAll")
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @CrossOrigin
    @GetMapping("auth")
    public UserDto authUser(@RequestParam String email, @RequestParam String password) {
        if (email == null || password == null) {
           return null;
        }

        if (userRepository.countAllByEmail(email) > 1) {
            return new UserDto(userRepository.getUserByEmailAndPassword(email, password));
        }

        return null;
    }

    @PostMapping("newUser")
    public String createUser(@RequestBody User newUser) {
        if (!isCreatable(newUser)){
            return "User cannot have empty fields";
        }else if (userRepository.countAllByEmail(newUser.getEmail()) > 0){
            return "User is already registered";
        }

        userRepository.save(newUser);
        return "User saved!";
    }

    @PutMapping("updateUser")
    public UserDto updateUser(@RequestBody User user) {
        if (isNull(user)){
            return null;
        }

        return new UserDto(userRepository.save(user));
    }

    @DeleteMapping("deleteUser")
    public String deleteUser(@RequestBody Long id) {
        if (id == null){
            return "Id cannot be null";
        }

        userRepository.deleteById(id);

        return "User deleted successfully";
    }

    //Private methods
    private Boolean isCreatable(User user) {
        if ((user.getEmail() != null) && (user.getPassword() != null)){
            return true;
        }
        return false;
    }

    private Boolean isNull(User user) {
        if (user == null || user.getEmail() == null || user.getName() == null || user.getRole() == null){
            return true;
        }

        return false;
    }

}
