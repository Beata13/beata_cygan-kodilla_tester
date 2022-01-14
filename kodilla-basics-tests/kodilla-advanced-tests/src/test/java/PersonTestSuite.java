import com.kodilla.parametrized_tests.homework.Person;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {
   Person person = new Person();
    @ParameterizedTest
    @MethodSource(value = "PersonSources#providePersonData")
    public void shouldCalculateBMICorrectly(double input, double expected) {
        assertEquals("Obese Class VI (Hyper Obese)", person.getBMI(input));
    }

    @ParameterizedTest
    @MethodSource(value = "PersonSoures2#providePersonData2")
    public void shouldCalculateBMICorrectly2(double input, double expected) {
        assertEquals("Obese Class VI (Hyper Obese)", person.getBMI(input));
    }
}

