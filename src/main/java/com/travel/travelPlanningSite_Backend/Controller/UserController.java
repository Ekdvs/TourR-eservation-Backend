package com.travel.travelPlanningSite_Backend.Controller;

import com.travel.travelPlanningSite_Backend.Model.User;
import com.travel.travelPlanningSite_Backend.Service.UserService;
import com.travel.travelPlanningSite_Backend.ServiceImplementation.UserServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImplementation userService;

    @PostMapping("/adduser")
    public User adduser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/getUserById/{id}")
    public Optional<User> getUserById(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/getAllUser")
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }

    @PutMapping("/updateUser/{id}")
    public User updateUser(@PathVariable("id") Long id,@RequestBody User user){
        return userService.updateUser(user,id);
    }

    @DeleteMapping("/deleteUserByid/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUserById(id);
    }
}
