package io.algorithm;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SlicePizzaTest {





    @DisplayName("1. 피자 나눠 먹기")
    @Test
    void test_1() {
        SlicePizza slicePizza = new SlicePizza();
        // given when then
        // when
        assertNotNull(assertThrows(IllegalArgumentException.class, () -> { slicePizza.slice(0,5); }));
        assertNotNull(assertThrows(IllegalArgumentException.class, () -> { slicePizza.slice(1,11); }));
        assertNotNull(assertThrows(IllegalArgumentException.class, () -> { slicePizza.slice(1,1); }));
        assertNotNull(assertThrows(IllegalArgumentException.class, () -> { slicePizza.slice(1,0); }));
        assertNotNull(assertThrows(IllegalArgumentException.class, () -> { slicePizza.slice(1,101); }));
        // then
        assertEquals(2, slicePizza.slice(7,10));
        assertEquals(3, slicePizza.slice(4,12));
    }

}
