import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments> providePersonData() {
        return Stream.of(
                Arguments.of(1.5, 30.00),
                Arguments.of(1.5, 35.00)

        );
    }
}
