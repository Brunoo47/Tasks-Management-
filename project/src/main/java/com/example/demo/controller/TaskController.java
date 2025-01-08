package com.example.demo.controller;

import com.example.demo.domain.model.EntityTask;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/EntityTasks")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping
    public List<EntityTask> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}");
    public EntityTask getTaskById(@PathVariable Long id) {
        Optional<EntityTask> entityTask = taskService.getTaskById(id);
        return Task.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND));
    }
    @PostMapping
    public EntityTask createTask(@RequestBody EntityTask task) {
        Task newTask = taskService.createTask(task);
        return ResponseEntity.status(HttpStatus.CREATED).body();
    }
    @PutMapping("/{id}")
    public EntityTask updateTask(@PathVariable Long id, @RequestBody EntityTask task) {
        Task updateTask = TaskService.updateTask(id, task);
        return ResponseEntity.ok(updateTask);
    }
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
