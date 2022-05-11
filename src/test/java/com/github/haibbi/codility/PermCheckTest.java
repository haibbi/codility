package com.github.haibbi.codility;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermCheckTest {

    @Test
    void test() {
        PermCheck permCheck = new PermCheck();
        assertEquals(1, permCheck.solution(new int[]{1}));
        assertEquals(1, permCheck.solution(new int[]{1, 2}));
        assertEquals(1, permCheck.solution(new int[]{1, 2, 3}));
        assertEquals(1, permCheck.solution(new int[]{1, 2, 3, 4}));
        assertEquals(0, permCheck.solution(new int[]{1, 2, 3, 5}));
        assertEquals(0, permCheck.solution(new int[]{5, 1, 2, 3}));
        assertEquals(1, permCheck.solution(new int[]{2, 3, 4, 1, 5}));
    }

    @Test
    void intOverflow() {
        PermCheck permCheck = new PermCheck();
        int[] array = IntStream.range(1, 10_000_000).toArray();
        assertEquals(1, permCheck.solution(array));
    }
}