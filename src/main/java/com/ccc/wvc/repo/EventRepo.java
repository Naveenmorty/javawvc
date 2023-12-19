package com.ccc.wvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ccc.wvc.entity.EventClinet;

public interface EventRepo extends JpaRepository<EventClinet, Integer> {

}
