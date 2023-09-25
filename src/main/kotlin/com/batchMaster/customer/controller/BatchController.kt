package com.batchMaster.customer.controller

import org.springframework.batch.core.Job
import org.springframework.batch.core.launch.JobLauncher
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/batch")
class BatchController(private val jobLauncher: JobLauncher,
                      private val job:Job) {




}