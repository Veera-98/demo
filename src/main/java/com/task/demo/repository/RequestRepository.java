package com.task.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.demo.model.Request;

public interface RequestRepository extends JpaRepository<Request, Long>{

}
