package fr.simplon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class HelloPromo {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals("Hello la promo on est des winners", App.helloBoyAndGirl("la promo on est des winners"));
    }
}
