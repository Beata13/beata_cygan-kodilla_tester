import com.kodilla.parametrized_tests.homework.UserValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"..", "em"})
    public void shouldReturnFalseIfEmailIsNotCorrect(String text) {
        assertFalse(userValidator.validateUsername(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"email", "email123"})
    public void shouldReturnTrueIfEmailIsCorrect(String text) {
        Assertions.assertTrue(userValidator.validateUsername(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"email@gmail.com"})
    public void shouldReturnTrueIfEmailIsValidateCorrect(String text) {
        Assertions.assertTrue(userValidator.validateEmail(text));
    }
    @ParameterizedTest
    @ValueSource(strings = {"email123"})
    public void shouldReturnFalseIfEmailIsValidateCorrect(String text) {
        Assertions.assertFalse(userValidator.validateEmail(text));
    }
}