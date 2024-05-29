package com.sample.project.demo.service;

import com.sample.project.demo.constants.Constants;
import com.sample.project.demo.model.GreetMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GreetService {

    public GreetMessage getGreetMessage() {
        log.info("Get Message service");
        return GreetMessage.builder().message(Constants.GREET_MESSAGE).build();
    }
}
