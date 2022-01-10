package com.kodilla.parametrized_tests;

import com.kodilla.com.kodilla.parametrized_tests.StringValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringValidatorTestSuite {
    private StringValidator validator = new StringValidator();

    @ParameterizedTest
@NullAndEmptySource
public void shouldReturnTrueIfStringIsEmpty(String text){
        System.out.println("|" + text + "|");
        assertTrue(validator.isBlank(text));
    }
}