package com.webappcraft.examples.valleys;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void shouldReturn_1_ForPath_DDUUUUDD() {
        String input = "DDUUUUDD";
        Integer expected = 1;

        Integer result = Main.valleyCounting(input);

        assertEquals(expected, result);
    }

    @Test
    void shouldReturn_1_ForPath_DDUDUDUDUU() {
        String input = "DDUDUDUDUU";
        Integer expected = 1;

        Integer result = Main.valleyCounting(input);

        assertEquals(expected, result);
    }

    @Test
    void shouldReturn_3_ForPath_DUDUDU() {
        String input = "DUDUDU";
        Integer expected = 3;

        Integer result = Main.valleyCounting(input);

        assertEquals(expected, result);
    }

    @Test
    void shouldReturn_2_ForPath_DDDUUDUUUUUDDDDU() {
        String input = "DDDUUDUUUUUDDDDU";
        Integer expected = 2;

        Integer result = Main.valleyCounting(input);

        assertEquals(expected, result);
    }

    @Test
    void shouldReturn_0_ForNullText() {
        String input = null;
        Integer expected = 0;

        Integer result = Main.valleyCounting(input);

        assertEquals(expected, result);
    }

    @Test
    void shouldReturn_0_ForEmptyText() {
        String input = "";
        Integer expected = 0;

        Integer result = Main.valleyCounting(input);

        assertEquals(expected, result);
    }

    @Test
    void shouldThrowException_WhenInvalidText() {
        String input = "DUXYZUD";

        assertThrows(RuntimeException.class, () -> Main.valleyCounting(input));
//        try {
//            Integer result = ;
//            fail("Should throw exception");
//        } catch(RuntimeException e) {
//              // success
//        }
    }

    @Test
    void shouldReturn_0_WhenTextContainsOnlyD() {
        String input = "DDDDDD";
        Integer expected = 0;

        Integer result = Main.valleyCounting(input);
        assertEquals(expected, result);
    }

    @Test
    void shouldReturn_0_WhenTextContainsOnlyU() {
        String input = "UUUU";
        Integer expected = 0;

        Integer result = Main.valleyCounting(input);
        assertEquals(expected, result);
    }

    @Test
    void shouldReturn_0_WhenText_DDUDDUDD() {
        String input = "DDUDDUDD";
        Integer expected = 0;

        Integer result = Main.valleyCounting(input);
        assertEquals(expected, result);
    }

    @Test
    void shouldReturn_0_WhenText_UDUD() {
        String input = "UDUD";
        Integer expected = 0;

        Integer result = Main.valleyCounting(input);
        assertEquals(expected, result);
    }

}
