import static org.assertj.core.api.Assertions.assertThat;
import static org.example.Main.findFrequencyElement;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FrequencyTest {

  @ParameterizedTest
  @MethodSource("testData")
  void frequencyTest(String s, String expected) {
    var result = findFrequencyElement(s);
    assertThat(result).isEqualTo(expected);
  }


  private static Stream<Arguments> testData() {
    return Stream.of(
//        Arguments.of("In our first strings task, we start off small.", "s - 6"),
//        Arguments.of("You already have half of a famous quote inside a variable called", "a - 10"),
//        Arguments.of("You'll find that you get an error at this point. Can you fix the problem with quoteStart, so that the full quote displays correctly?", "t - 16"),
        Arguments.of("ttt rrr pp d mmm", "")
    );
  }

}
