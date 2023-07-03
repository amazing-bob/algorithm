package io.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusDivTest {
    PlusDiv plusDiv = new PlusDiv();

    @Test
    void solution() {

        assertArrayEquals(new int[]{5, 4}, plusDiv.solution(1, 2, 3, 4));
        assertArrayEquals(new int[]{29, 6}, plusDiv.solution(9, 2, 1, 3));
    }


    @Test
    void isDivPossible() {
        assertTrue(plusDiv.isDivPossible(2,4));
        assertTrue(plusDiv.isDivPossible(4,2));
        assertTrue(plusDiv.isDivPossible(6,3));
        assertTrue(plusDiv.isDivPossible(3,9));
        assertFalse(plusDiv.isDivPossible(4,9));
        assertFalse(plusDiv.isDivPossible(4,3));
    }
}