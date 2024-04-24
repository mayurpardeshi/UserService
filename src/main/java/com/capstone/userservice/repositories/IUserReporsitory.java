package com.capstone.userservice.repositories;

import com.capstone.userservice.modals.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserReporsitory extends JpaRepository<User> {
}
