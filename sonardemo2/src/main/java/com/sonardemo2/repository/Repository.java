package com.sonardemo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sonardemo2.model.User;

public interface Repository extends JpaRepository<User, Integer>{

}
