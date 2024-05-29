package com.sample.project.demo.controller;

import com.sample.project.demo.model.GreetMessage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GreatingControllerITTest {

    @Autowired
    private TestRestTemplate template;

    @Test
    void getMessage() throws Exception {
        ResponseEntity<GreetMessage> response = template.getForEntity("/api/message", GreetMessage.class);
        GreetMessage greetMessage = response.getBody();
        assert greetMessage != null;
        assertThat(greetMessage.getMessage()).isEqualTo("Hello Greeting!");
    }

}
