package com.sonardemo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.sonardemo2.model.User;
import com.sonardemo2.service.MyService;

@RestController
public class Controller {

	@Autowired
	private MyService myService;

	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String hello() {
		return "hello";
	}

	@PostMapping(value = "create")
	public User create(@RequestBody User user) {
		// return new ResponseEntity<>(myService.create(user), HttpStatus.CREATED);
		return myService.create(user);
	}

	@GetMapping(value = "read/{id}")
	public User read(@PathVariable("id") int id) {
		// return new ResponseEntity<>(myService.read(id), HttpStatus.OK);
		return myService.read(id);
	}

	public void update(User user) {

	}

	@DeleteMapping(value = "delete/{id}")
	public void delete(@PathVariable("id") int id) {
		myService.delete(id);
		// return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping(value = "fetchall")
	public List<User> fetchAll() {
		return myService.findAll();
	}
}
