package com.github.haibbi.codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxCountersTest {

    @Test
    void test() {
        MaxCounters maxCounters = new MaxCounters();
        int[] solution = maxCounters.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4,});
        Assertions.assertArrayEquals(new int[]{3, 2, 2, 4, 2}, solution);
    }

}