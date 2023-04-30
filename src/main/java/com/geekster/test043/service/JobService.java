package com.geekster.test043.service;

import com.geekster.test043.dao.JobRepository;
import com.geekster.test043.model.Job;
import com.geekster.test043.model.JobType;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {
    @Autowired
    JobRepository jobRepository;

    public void createJob(Job job) {
        jobRepository.save(job);
    }

    public Job getJob(Long id) {
       return  jobRepository.findById(id).get();
    }

    public String deleteJob(Long id) {
         jobRepository.deleteById(id);
        return "Job has been deleted";
    }
  @Transactional
    public String updateJob(Long id, JobType jobType) {
        String jobTypeString=jobType.name();
        jobRepository.updateJobType(id,jobTypeString);
        return  "updated successfully";
    }
}
