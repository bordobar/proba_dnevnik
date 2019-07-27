package com.iktpreobuka.proba.repositories;

import org.springframework.data.repository.CrudRepository;

import com.iktpreobuka.proba.entities.StudentEntity;

public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {

}
