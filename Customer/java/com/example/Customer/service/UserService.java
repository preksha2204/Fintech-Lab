package com.example.Customer.service;

import com.example.Customer.entity.User;
import com.example.Customer.repository.UserRepository;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Page<User> getPaginatedUsers(int page, int pageSize) {
        return userRepository.findAll(PageRequest.of(page, pageSize));
    }

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public void saveUser(@Valid User user) {
		 userRepository.save(user);
		
	}
}