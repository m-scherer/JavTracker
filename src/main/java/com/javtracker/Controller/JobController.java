package com.javtracker.Controller;

import com.javtracker.Entity.Job;
import com.javtracker.Repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private JobRepository jobRepository;

    @Autowired
    public JobController(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Job> findAllJobs() {
        return jobRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Job findJobById(@PathVariable("id") Long id) {
        return jobRepository.findOne(id);
    }


}
