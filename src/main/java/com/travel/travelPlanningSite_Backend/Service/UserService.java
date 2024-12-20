package com.travel.travelPlanningSite_Backend.Service;

import com.travel.travelPlanningSite_Backend.Model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    void deleteUserById(Long id);

    User updateUser(User user, Long id);
    Optional<User> getUserById(Long id);
}