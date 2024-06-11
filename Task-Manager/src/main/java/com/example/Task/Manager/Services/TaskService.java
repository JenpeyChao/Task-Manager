package com.example.Task.Manager.Services;

import com.example.Task.Manager.Entity.Task;

import java.util.List;

public interface TaskService {

    List<Task> getTasks();
    Task getTaskId(long taskId);
    Task updateTask(Task task);
    Task addTask(Task task);
    String removeTask(String taskId);

}
