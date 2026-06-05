package io.github.shudharshan07.assignment;


import java.time.LocalTime;

public class Task {
    String title;
    String task;
    LocalTime created_time;
    LocalTime updated_time;

    public Task(String title, String task, LocalTime created_time) {
        this.title = title;
        this.task = task;
        this.created_time = created_time;
    }

    public Task(String title, String task, LocalTime created_time, LocalTime updated_time) {
        this.title = title;
        this.task = task;
        this.created_time = created_time;
        this.updated_time = updated_time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public LocalTime getCreated_time() {
        return created_time;
    }

    public void setCreated_time(LocalTime created_time) {
        this.created_time = created_time;
    }

    public LocalTime getUpdated_time() {
        return updated_time;
    }

    public void setUpdated_time(LocalTime updated_time) {
        this.updated_time = updated_time;
    }
}
