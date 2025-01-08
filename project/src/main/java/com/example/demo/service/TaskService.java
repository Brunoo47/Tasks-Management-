package com.example.demo.service;

import com.example.demo.domain.model.EntityTask;
import com.example.demo.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    TasksRepository tasksRepository;

    public List <EntityTask> getAllTasks() {
        return tasksRepository.findAll();
    }
    public Optional<EntityTask> getTaskById(Long id) {
        return tasksRepository.findById(id);
    }
    public Task updateTask(Long id, Task newTask) {
        getTaskById(id);
        return tasksRepository.save(Task);
    }
    public void deleteTask(Long id) {
        tasksRepository.deleteById(id);
    }
}
