import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSoures2 {
    static Stream<Arguments> providePersonData2() {
        return Stream.of(
                Arguments.of(100, 150),
                Arguments.of(100, 200)

        );
    }
}
