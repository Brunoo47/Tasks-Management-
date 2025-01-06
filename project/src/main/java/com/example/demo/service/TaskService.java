package com.example.demo.service;

import com.example.demo.domain.model.EntityTask;
import com.example.demo.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    TasksRepository tasksRepository;

    public List <EntityTask> getAllTasks() {
        return tasksRepository.findAll();
    }
}
