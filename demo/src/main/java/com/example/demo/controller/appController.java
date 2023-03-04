package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Retry.Topic;
import org.springframework.stereotype.Controller;

import com.example.demo.model.Topics;

@RestController
@RequestMapping(path="/")
public class appController {
    

    @GetMapping(path="/topic")
    public List<Topics> showAllTopics(){
        return Arrays.asList(
            new Topics("1", "Math", "Study Math"),
            new Topics("2", "EL", "Study EL"),
        );
    }
    
    

    
}
