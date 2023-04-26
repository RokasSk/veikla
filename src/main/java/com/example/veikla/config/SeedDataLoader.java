package com.example.veikla.config;

import com.example.veikla.models.Task;
import com.example.veikla.models.TaskStatus;
import com.example.veikla.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedDataLoader implements CommandLineRunner {

    @Autowired
    TaskService taskService;

    @Override
    public void run(String...args) throws Exception {
//        loadSeedData();

    }

    private void loadSeedData() {
        taskService.deleteAll();

        Task task1 = new Task();
        task1.setDescription("Sukurti uzduoti 1");
        task1.setStatus(TaskStatus.BACKLOG);

        Task task2 = new Task();
        task2.setDescription("Antra uzduotis");
        task2.setStatus(TaskStatus.DOING);

        taskService.save(task1);
        taskService.save(task2);


    }
}
