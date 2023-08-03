package fastcampus.algorithm.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnergramTest {
    Anergram anergram;

    @BeforeEach
    void setUp() {
        anergram = new Anergram();
    }

    @DisplayName("2. ")
    @Test
    void test_2() {
        assertEquals(8, anergram.getCountOfRemoveChar("aabbcc", "ccddee"));
        assertEquals(10, anergram.getCountOfRemoveChar("aabbcc", "ccddeffe"));

    }




}