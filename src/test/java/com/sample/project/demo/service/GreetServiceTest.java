package com.sample.project.demo.service;

import com.sample.project.demo.model.GreetMessage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.sample.project.demo.constants.Constants.GREET_MESSAGE;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class GreetServiceTest {

    @InjectMocks
    private GreetService greetService;

    @BeforeAll
    public static void beforeAll() {
        MockitoAnnotations.openMocks(GreetServiceTest.class);
    }

    @Test
    void getGreetMessage() {
        GreetMessage greetMessage = greetService.getGreetMessage();
        assertEquals(GREET_MESSAGE, greetMessage.getMessage());
    }
}