import com.kodilla.parametrized_tests.homework.GamblingMachine;
import com.kodilla.parametrized_tests.homework.InvalidNumbersException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {
    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/validNumbbers.csv")

    public void shouldCalculateHowManyWinners(String numbers) throws InvalidNumbersException {
        System.out.println(numbers);
        String[] allNumbers = numbers.split(",");
        Set<Integer> collect = Arrays.stream(allNumbers).map(u -> Integer.parseInt(u)).collect(Collectors.toSet());
        assertTrue(0 <= gamblingMachine.howManyWins(collect) && gamblingMachine.howManyWins(collect) <= 6);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/validNumbers2.csv")

    public void shouldThrowException(String numbers) throws InvalidNumbersException {
             String[] allNumbers = numbers.split(",");
        Set<Integer> collect = Arrays.stream(allNumbers).map(u -> Integer.parseInt(u)).collect(Collectors.toSet());

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(collect));

    }
    @ParameterizedTest
    @CsvFileSource(resources = "/validNumbers3.csv")
    public void shouldThrowExceptionIfIsWrongNumber(String numbers) throws InvalidNumbersException {

        String[] allNumbers = numbers.split(",");
        Set<Integer> collect = Arrays.stream(allNumbers).map(u -> Integer.parseInt(u)).collect(Collectors.toSet());
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(collect));
    }
}