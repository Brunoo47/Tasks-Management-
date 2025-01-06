package com.example.demo.repository;

import com.example.demo.domain.model.EntityTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksRepository extends JpaRepository<EntityTask, Long> {
}
