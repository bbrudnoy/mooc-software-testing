package tudelft.caesarshift;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests {@link CaesarShiftCipherTest}.
 * <p>
 * Used <a href="https://www.dcode.fr/caesar-cipher">https://www.dcode.fr/caesar-cipher</a> as reference.
 * </p>
 */
public class CaesarShiftCipherTest {

  @Disabled
  @ParameterizedTest
  @ValueSource(ints = { -26, 0, 26 })
  public void noShift(int neutralShift) {
    final CaesarShiftCipher cipher = new CaesarShiftCipher();
    assertEquals("good day", cipher.CaesarShiftCipher("good day", neutralShift));
  }


  @Test
  public void positiveShiftWithoutSpaces() {
    final CaesarShiftCipher cipher = new CaesarShiftCipher();
    assertEquals("khoor", cipher.CaesarShiftCipher("hello", 3));
  }


  @Test
  public void positiveShiftWithSpaces() {
    final CaesarShiftCipher cipher = new CaesarShiftCipher();
    assertEquals("jrrg gdb", cipher.CaesarShiftCipher("good day", 3));
  }


  @Test
  public void negativeShiftWithoutSpaces() {
    final CaesarShiftCipher cipher = new CaesarShiftCipher();
    assertEquals("ebiil", cipher.CaesarShiftCipher("hello", -3));
  }


  @Test
  public void negativeShiftWithSpaces() {
    final CaesarShiftCipher cipher = new CaesarShiftCipher();
    assertEquals("dlla axv", cipher.CaesarShiftCipher("good day", -3));
  }
}
