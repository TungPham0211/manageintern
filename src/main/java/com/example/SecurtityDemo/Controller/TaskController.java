package com.example.SecurtityDemo.Controller;


import com.example.SecurtityDemo.Entity.Task;
import com.example.SecurtityDemo.Service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v3/task")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getTask(){
        return taskService.getTask();
    }

    @PostMapping
    public void addTask(@RequestBody Task task){
        taskService.addTask(task);
    }

    @DeleteMapping("{task_id}")
    public void deleteTask(@PathVariable int task_id){
        taskService.deleteTask(task_id);
    }

    @PutMapping("{task_id}")
    public void updateTask(@PathVariable("task_id") int task_id,
                           @RequestParam(required = false) String task_name ,
                           @RequestParam (required = false) String intern_executed ,
                           @RequestParam (required = false) String process){
        taskService.UpdateTask(task_id , task_name , intern_executed , process);
    }
}
