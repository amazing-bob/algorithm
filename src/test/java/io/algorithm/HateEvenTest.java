package io.algorithm;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HateEvenTest {
    HateEven hateEven = new HateEven();

    @Test
    void solution() {
        assertArrayEquals(List.of(1, 3, 5, 7, 9).toArray(),List.of(1, 3, 5, 7, 9).toArray());
        assertArrayEquals(List.of(1, 3, 5, 7, 9).stream().mapToInt(i->i).toArray(), hateEven.solution(10));
        assertArrayEquals(List.of(1, 3, 5, 7, 9, 11, 13, 15).stream().mapToInt(i->i).toArray(), hateEven.solution(15));
    }
}