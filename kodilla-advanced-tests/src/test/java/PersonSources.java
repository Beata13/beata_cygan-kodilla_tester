import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments> providePersonData() {
        return Stream.of(
             Arguments.of(31.5, 1.5, "Very severely underweight"),
                Arguments.of(33.75, 1.5, "Severely underweight"),
                Arguments.of(38.25, 1.5, "Underweight"),
                Arguments.of(45, 1.5, "Normal (healthy weight)"),
                Arguments.of(65.25, 1.5, "Overweight"),
                Arguments.of(72, 1.5, "Obese Class I (Moderately obese)"),
                Arguments.of(85.5, 1.5,"Obese Class II (Severely obese)"),
                Arguments.of(96.75, 1.5,"Obese Class III (Very severely obese)"),
                Arguments.of(108, 1.5, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(132.75, 1.5, "Obese Class V (Super Obese)"),
                Arguments.of(250, 1.5, "Obese Class VI (Hyper Obese)")
        );




    }
}
