import com.kodilla.parametrized_tests.homework.Person;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "PersonSources#providePersonData")

    public void shouldCalculateBMICorrectly(double weight, double height, String expected) {
        Person person = new Person(height, weight);
        assertEquals(expected, person.getBMI());

    }

    }
