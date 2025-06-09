package com.example.taskmanagement.service;

import com.example.taskmanagement.model.Task;
import com.example.taskmanagement.model.Priority;
import com.example.taskmanagement.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
public class TaskService {

    private final TaskRepository repo;

    public TaskService(TaskRepository repo) {
        this.repo = repo;
    }

    public Task create(Task task) {
        return repo.save(task);
    }

    public List<Task> getAll(LocalDate dueBefore, Priority priority, Boolean completed) {
        // Simplified: Add filtering logic if needed
        return repo.findAll();
    }

    public Task getById(UUID id) {
        return repo.findById(id).orElseThrow();
    }

    public Task update(UUID id, Task updatedTask) {
        updatedTask.setId(id);
        return repo.save(updatedTask);
    }

    public void delete(UUID id) {
        repo.deleteById(id);
    }
}
