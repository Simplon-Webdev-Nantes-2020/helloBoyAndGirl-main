package fr.simplon;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
class HelloGino {

  /**
   * Rigorous Test.
   */
  @Test
  void testApp() {
    assertEquals("Hello Gino", App.helloBoyAndGirl("Gino"));
  }
}
