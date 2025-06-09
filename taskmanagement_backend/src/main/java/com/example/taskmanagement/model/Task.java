package com.example.taskmanagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue
    private UUID id;

    @NotBlank
    @Size(max = 100)
    private String title;

    private String description;

    @FutureOrPresent
    private LocalDate dueDate;

    @Enumerated(EnumType.STRING)
    @NotNull
    private Priority priority;

    private boolean completed = false;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public @NotBlank @Size(max = 100) String getTitle() {
        return title;
    }

    public void setTitle(@NotBlank @Size(max = 100) String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public @FutureOrPresent LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(@FutureOrPresent LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public @NotNull Priority getPriority() {
        return priority;
    }

    public void setPriority(@NotNull Priority priority) {
        this.priority = priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
