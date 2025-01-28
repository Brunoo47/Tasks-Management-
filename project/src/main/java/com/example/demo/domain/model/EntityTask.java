package com.example.demo.domain.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Date;

@Entity
public class EntityTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @Temporal(TemporalType.DATE)
    private Date dueDate;


    @Enumerated(EnumType.STRING)
    private TasksCategory tasksCategory;

    private enum TasksCategory {
        TRABALHO, PESSOAL, HOME
    }

}
