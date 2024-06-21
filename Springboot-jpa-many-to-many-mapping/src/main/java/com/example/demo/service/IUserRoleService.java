package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;

public interface IUserRoleService {

	List<User> getUsersByRole(String roleName);

    List<Role> getRolesByUser(Long userId);
	
}
