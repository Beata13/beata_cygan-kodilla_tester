package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.spring_dependency_injection.SkypeMessageService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CalculatorTest {
    @Test
    public void shouldAddValues() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        Double value = bean.add(4, 2);
        Double expected = Double.valueOf(6);
        Assertions.assertEquals(expected, value);

    }

    @Test
    public void shouldSubstractValues() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        Double value = bean.subtract(5, 2);
        Double expected = Double.valueOf(3);
        Assertions.assertEquals(expected, value);

    }

    @Test
    public void shouldMultiplyValues() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        Double value = bean.multiply(5, 2);
        Double expected = Double.valueOf(10);
        Assertions.assertEquals(expected, value);

    }

    @Test
    public void shouldDivideValues() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        Double value = bean.divide(10, 2);
        Double expected = Double.valueOf(5);
        Assertions.assertEquals(expected, value);

    }
}