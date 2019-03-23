package com.webappcraft.examples.valleys;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void shouldReturn_1_ForPath_DDUUUUDD() {
        String input = "DDUUUUDD";
        Integer expected = 1;

        Integer result = Main.exec(input);

        assertEquals(result, expected);
    }

    @Test
    void shouldReturn_1_ForPath_DDUDUDUDUU() {
        String input = "DDUDUDUDUU";
        Integer expected = 1;

        Integer result = Main.exec(input);

        assertEquals(result, expected);
    }

    @Test
    void shouldReturn_1_ForPath_DUDUDU() {
        String input = "DUDUDU";
        Integer expected = 3;

        Integer result = Main.exec(input);

        assertEquals(result, expected);
    }

    @Test
    void shouldReturn_1_ForPath_DDDUUDUUUUUDDDDU() {
        String input = "DDDUUDUUUUUDDDDU";
        Integer expected = 2;

        Integer result = Main.exec(input);

        assertEquals(result, expected);
    }

}
