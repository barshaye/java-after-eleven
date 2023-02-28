package ea.barshai;

import org.junit.jupiter.api.Test;

class NPETest {

  @Test
  void npe() {
    var p = new PersonClass(null, (byte)20, Mood.HAPPY);
    System.out.println(p.getName().isBlank());
  }
}