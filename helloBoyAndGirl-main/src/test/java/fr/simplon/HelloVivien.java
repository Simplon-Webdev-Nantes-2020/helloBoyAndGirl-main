package fr.simplon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class HelloVivien {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals("Hello Vivien", App.helloBoyAndGirl("Vivien"));
    }
}
