package com.kodilla.spring.basic.scope.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class ClockTestSuite {

    @Test
    public void shouldCreateDifferentTasks() throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstBean = context.getBean(Clock.class);
        Thread.sleep(1000);
        Clock secondBean = context.getBean(Clock.class);
        Thread.sleep(1000);
        Clock thirdBean = context.getBean(Clock.class);
        Assertions.assertNotEquals(firstBean.getTime(), secondBean.getTime());
        Assertions.assertNotEquals(secondBean.getTime(), thirdBean.getTime());
        Assertions.assertNotEquals(firstBean.getTime(), thirdBean.getTime());
    }
}