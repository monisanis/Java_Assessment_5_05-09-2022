package com.javainuse.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javainuse.entity.Assessment_2_entity;

@Repository
public interface Assessment_2_Repository extends JpaRepository<Assessment_2_entity, Integer> {

}