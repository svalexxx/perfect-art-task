import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.example.Main.findMostFrequent;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FrequencyTest {

  @ParameterizedTest
  @MethodSource("testData")
  @DisplayName("Check findFrequencyElement() methode")
  void frequencyTest(String s, String expected) {
    var result = findMostFrequent(s);
    assertThat(result).isEqualTo(expected);
  }

  @Test
  @DisplayName("Check that empty string return IllegalArgumentException")
  void emptyStringTest() {
    assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
        () -> findMostFrequent("")
    ).withMessageContaining("String is blank or empty.");;
  }


  private static Stream<Arguments> testData() {
    return Stream.of(
        Arguments.of("In our first strings task, we start off small.", "s - 6"),
        Arguments.of("You already have half of a famous quote inside a variable called", "a - 10"),
        Arguments.of("You'll find that you get an error at this point. Can you fix the problem with quoteStart, so that the full quote displays correctly?", "t - 16"),
        Arguments.of("ttt rrr pp d mmm", "r - 3")
    );
  }

}
