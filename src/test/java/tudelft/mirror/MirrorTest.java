package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MirrorTest {

  @ParameterizedTest
  @CsvSource({ "aba, aba", "ab, abXYZba", "abcba, abcba", "a, a" })
  public void oddNumOfCharacters(String expectedResult, String string) {
    final Mirror mirror = new Mirror();
    Assertions.assertEquals(expectedResult, mirror.mirrorEnds(string));
  }


  @ParameterizedTest
  @CsvSource({ "a, abca", "ab, abSTba" })
  public void evenNumOfCharacters(String expectedResult, String string) {
    final Mirror mirror = new Mirror();
    Assertions.assertEquals(expectedResult, mirror.mirrorEnds(string));
  }


  @ParameterizedTest
  @CsvSource({ "aa, aa", "abba, abba" })
  public void evenPalindromes(String expectedResult, String string) {
    final Mirror mirror = new Mirror();
    Assertions.assertEquals(expectedResult, mirror.mirrorEnds(string));
  }
}
