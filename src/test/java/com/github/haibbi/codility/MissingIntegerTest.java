package com.github.haibbi.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingIntegerTest {

    @Test
    void test() {
        MissingInteger missingInteger = new MissingInteger();
        assertEquals(5, missingInteger.solution(new int[]{1, 3, 6, 4, 1, 2}));
        assertEquals(6, missingInteger.solution(new int[]{1, 2, 3, 4, 5}));
    }
}