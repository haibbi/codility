package com.github.haibbi.codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CyclicRotationTest {

    private CyclicRotation cyclicRotation;

    @BeforeEach
    void setUp() {
        this.cyclicRotation = new CyclicRotation();
    }

    @Test
    void test() {
        int[] array = {3, 8, 9, 7, 6};
        check(new int[]{3, 8, 9, 7, 6}, array, 0);
        check(new int[]{6, 3, 8, 9, 7}, array, 1);
        check(new int[]{7, 6, 3, 8, 9}, array, 2);
        check(new int[]{9, 7, 6, 3, 8}, array, 3);
        check(new int[]{8, 9, 7, 6, 3}, array, 4);
        check(new int[]{3, 8, 9, 7, 6}, array, 5);
        check(new int[]{6, 3, 8, 9, 7}, array, 6);
        check(new int[]{7, 6, 3, 8, 9}, array, 7);
    }

    @Test
    void test2() {
        check(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}, 4);
    }

    private void check(int[] expected, int[] array, int k) {
        assertArrayEquals(expected, cyclicRotation.solution(array, k));
    }
}