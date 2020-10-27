package fr.simplon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class HelloFranck {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals("Hello Franck", App.helloBoyAndGirl("Franck"));
    }
}
