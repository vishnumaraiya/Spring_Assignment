package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.service.IUserRoleService;

public class UserRoleController {
	@Autowired
	private IUserRoleService userRoleService;

	@GetMapping("/users/{roleName}")
	public List<User> getUsersByRole(@PathVariable String roleName) {
		return userRoleService.getUsersByRole(roleName);
	}

	@GetMapping("/roles/{userId}")
	public List<Role> getRolesByUser(@PathVariable Long userId) {
		return userRoleService.getRolesByUser(userId);
	}
}