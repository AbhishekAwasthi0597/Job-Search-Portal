package com.geekster.test043.controller;

import com.geekster.test043.model.Job;
import com.geekster.test043.model.JobType;
import com.geekster.test043.service.JobService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    JobService jobService;
    @PostMapping("/job")
    public String createJob(@Valid @RequestBody Job job){
        jobService.createJob(job);
        return "Job has been added";
    }
    @GetMapping("/job/{id}")
    public Job getJob(@PathVariable Long id){
       return  jobService.getJob(id);
    }
    @DeleteMapping("/job/{id}")
    public String deleteJob(@PathVariable Long id){
        return jobService.deleteJob(id);
    }

   @PutMapping("/job/{id}/{jobType}")
   public  String updateJob(@PathVariable Long id , @PathVariable JobType jobType){
       return  jobService.updateJob(id,jobType);
   }

}
