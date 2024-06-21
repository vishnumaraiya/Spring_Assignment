package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "rolename")
	private String roleName;

	@ManyToMany(mappedBy = "roles")
	private Set<User> users = new HashSet<>();

	public Role() {

	}

	public Role( String roleName) {

		this.roleName = roleName;
		this.users = users;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public void addUser(User user) {
		users.add(user);
		user.getRoles().add(this);
	}

	public void removeUser(User user) {
		users.remove(user);
		user.getRoles().remove(this);
	}

}
