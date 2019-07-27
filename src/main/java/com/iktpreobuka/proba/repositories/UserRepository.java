package com.iktpreobuka.proba.repositories;

import org.springframework.data.repository.CrudRepository;

import com.iktpreobuka.proba.entities.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer>{

}
