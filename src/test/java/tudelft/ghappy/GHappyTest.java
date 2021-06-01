package tudelft.ghappy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GHappyTest {

  @ParameterizedTest
  @CsvSource({"gg, true"})
  public void shortHappy(String string, boolean expected) {
    final GHappy gHappy = new GHappy();
    assertEquals(expected, gHappy.gHappy(string));
  }
}
