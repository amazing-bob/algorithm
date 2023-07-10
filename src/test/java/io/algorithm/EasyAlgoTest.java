package io.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class EasyAlgoTest {
    EasyAlgo easyAlgo;

    @BeforeEach
    public void setup() {
        easyAlgo = new EasyAlgo();
    }

    @Test
    void strMultipleTest() {
        assertEquals("abababab", easyAlgo.strMultiple("ab", 4));
    }

    @Test
    void strOverrideTest() {
        assertEquals("HelloWorld", easyAlgo.strOverride("He11oWor1d", "lloWorl", 2));
        assertEquals("ProgrammerS123", easyAlgo.strOverride("Program29b8UYP", "merS123", 7));
    }



    @Test
    void inverseCaseTest() {
        assertEquals("aBcDeFg", easyAlgo.inverseCase("AbCdEfG"));
        assertEquals("aBcDeFg1", easyAlgo.inverseCase("AbCdEfG1"));
    }


    @Test
    void commonMultipleTest() {
        assertEquals(1, easyAlgo.commonMutiple(60, 2, 3));
        assertEquals(0, easyAlgo.commonMutiple(55, 10, 5));
    }


    @Test
    void countUpTest() {
        assertArrayEquals(new int[]{3, 4, 5, 6, 7, 8, 9, 10},  easyAlgo.countUp(3, 10));
    }


    @Test
    void printNCharTest() {
        assertEquals("ProgrammerS", easyAlgo.printNChar("ProgrammerS123", 11));
        assertEquals("He110", easyAlgo.printNChar("He110W0r1d", 5));
    }

    @Test
    void toLowerCase() {
        assertEquals("abcdefg", easyAlgo.toLowerCase("aBcDeFg"));
        assertEquals("aaa", easyAlgo.toLowerCase("aaa"));
        assertEquals("bbb", easyAlgo.toLowerCase("BBB"));
    }

    @Test
    void anergramTest() {
        assertEquals("aabbcc", easyAlgo.anergram("abcabc"));
    }




}