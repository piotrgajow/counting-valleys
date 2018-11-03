package com.webappcraft.examples.valleys;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @ParameterizedTest(name = "{1} for {0} [{index}]")
    @DisplayName("Should return valley count for given path")
    @CsvSource({
            "DDUUUUDD, 1",
            "DDUDUDUDUU, 1",
            "DUDUDU, 3",
            "DDDUUDUUUUUDDDDU, 2",
            ", 0",
            "'', 0",
            "DDDDDD, 0",
            "UUUU, 0",
            "DDUDDUDD, 0",
            "UDUD, 0",
    })
    void positiveScenario(String path, Integer expectedValleyCount) {
        Integer result = Main.valleyCounting(path);
        assertEquals(expectedValleyCount, result);
    }

    @ParameterizedTest(name = "{0} [{index}]")
    @DisplayName("Should throw exception when path contains invalid characters")
    @CsvSource({
            "DUXYZUD",
    })
    void shouldThrowException_WhenInvalidText(String path) {
        assertThrows(RuntimeException.class, () -> Main.valleyCounting(path));
    }

}
