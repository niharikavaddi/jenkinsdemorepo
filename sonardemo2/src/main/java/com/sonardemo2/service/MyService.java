package com.sonardemo2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sonardemo2.model.User;
import com.sonardemo2.repository.Repository;

@Service("myService")
public class MyService {

	@Autowired
	private Repository repository;

	public User create(User user) {
		return repository.save(user);
	}

	public List<User> findAll()
	{
		return repository.findAll();
	}
	public User read(int id) {
		Optional<User> user = repository.findById(id);
		if (user.isEmpty()) {
			return null;
		} else {
			return user.get();
		}
	}

	public User update(User user) {
		return null;
	}

	public void delete(int id) {
		repository.deleteById(id);
	}
}
