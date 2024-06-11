package com.example.Task.Manager.Services;

import com.example.Task.Manager.Entity.Task;
import com.example.Task.Manager.Respository.TaskDAO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TaskServiceImpl implements TaskService{
    @Autowired
    public TaskDAO task;

    @Override
    public List<Task> getTasks() {
        return this.task.findAll();
    }

    @Override
    public Task getTaskId(long taskId) {
        return this.task.getReferenceById(taskId);
    }

    @Override
    public Task updateTask(Task task) {
        return this.task.save(task);
    }

    @Override
    public Task addTask(Task task) {
        return return this.task.save(task);;
    }

    @Override
    public String removeTask(long taskId) {
        this.task.deleteById(taskId);
        return "Successfully deleted the task";
    }
}
