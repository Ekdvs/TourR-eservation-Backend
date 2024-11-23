package com.travel.travelPlanningSite_Backend.Repository;

import com.travel.travelPlanningSite_Backend.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
