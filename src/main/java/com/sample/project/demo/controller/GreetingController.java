package com.sample.project.demo.controller;

import com.sample.project.demo.model.GreetMessage;
import com.sample.project.demo.service.GreetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api")
public class GreetingController {

    @Autowired
    private GreetService greetService;

    @GetMapping("/message")
    public ResponseEntity<GreetMessage> getGreetMessage() {
        log.info("GreetMessage Controller");
        return ResponseEntity.ok().body(greetService.getGreetMessage());
    }

}
