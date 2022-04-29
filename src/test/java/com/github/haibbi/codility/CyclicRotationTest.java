package com.github.haibbi.codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CyclicRotationTest {

    @Test
    void test() {
        CyclicRotation cyclicRotation = new CyclicRotation();
        assertArrayEquals(
                new int[]{6, 3, 8, 9, 7},
                cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 3)
        );
    }
}