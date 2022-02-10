package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ShippingCenterTest {
@Test
    public void shouldSendPackageCorrect(){
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
    ShippingCenter bean = context.getBean(ShippingCenter.class);
    String sendPackage = bean.sendPackage("London", 15);
    Assertions.assertEquals("Package delivered to: London", sendPackage);
}
}