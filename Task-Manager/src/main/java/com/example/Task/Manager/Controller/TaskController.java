package com.example.Task.Manager.Controller;

import com.example.Task.Manager.Entity.Task;
import com.example.Task.Manager.Services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class TaskController {

    @Autowired
    public TaskService task;

    @GetMapping("/")
    public String home(){
        return "<h1>Task Manger </h1>";
    }

    @GetMapping("/tasks")
    public List<Task> getTasks(){
        return this.task.getTasks();
    }

    @GetMapping("/tasks/{taskId}")
    public Task getTaskId(@PathVariable long taskId){
        return this.task.getTaskId(taskId);
    }

    @PostMapping("/tasks")
    public Task updateTask(@RequestBody Task task){
        return this.task.updateTask(task);
    }

    @PostMapping("/tasks")
    public Task addTask(@RequestBody Task task){
        return this.task.addTask(task);
    }
    @PostMapping("/tasks/{taskId}")
    public String removeTask(@PathVariable long taskId){
        return this.task.removeTask(taskId);
    }
}
