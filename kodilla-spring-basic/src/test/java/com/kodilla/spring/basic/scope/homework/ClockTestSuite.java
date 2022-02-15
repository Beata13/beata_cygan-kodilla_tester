package com.kodilla.spring.basic.scope.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class ClockTestSuite {

    @Test
    public void shouldCreateDifferentTasks() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.scope.homework");
        Clock firstBean = context.getBean(Clock.class);
        Clock secondBean = context.getBean(Clock.class);
        Clock thirdBean = context.getBean(Clock.class);
        Assertions.assertNotEquals(firstBean.time, secondBean.time);
        Assertions.assertNotEquals(secondBean.time, thirdBean.time);
        Assertions.assertNotEquals(firstBean.time, thirdBean.time);
    }

}