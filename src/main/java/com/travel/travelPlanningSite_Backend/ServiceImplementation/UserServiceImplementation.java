package com.travel.travelPlanningSite_Backend.ServiceImplementation;

import com.travel.travelPlanningSite_Backend.Model.User;
import com.travel.travelPlanningSite_Backend.Repository.UserRepository;
import com.travel.travelPlanningSite_Backend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user){
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers(){
        return (List<User>) userRepository.findAll();
    }



    @Override
    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);

    }

    @Override
    public User updateUser(User user,Long id){
        User existUser = userRepository.findById(id).orElseThrow(()->new RuntimeException("User Not Found"));
        existUser.setFullname(user.getFullname());
        existUser.setEmail(user.getEmail());
        existUser.setPassword(user.getPassword());
        existUser.setPhonenumber(user.getPhonenumber());
        return userRepository.save(existUser);
    }
}
