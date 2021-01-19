package com.sonardemo2.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.sonardemo2.model.User;
import com.sonardemo2.service.MyService;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = { TestBeanConfig.class })
public class Test {

	@Autowired
	MyService myService;
	User user;
	User user1;

	@Before
	public void setUp() {
		user = new User(3, "Nihaa", "Password");
		user1 = new User(4, "Mouni", "Password");
	}

	@org.junit.Test
	public void createTest() {
		myService.create(user);
		myService.create(user1);
	}

	@org.junit.Test
	public void fetchData() {
		assertEquals(2, myService.findAll().size());
	}
}
