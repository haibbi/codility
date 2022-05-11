package com.github.haibbi.codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FrogRiverOneTest {

    @Test
    void test() {
        FrogRiverOne frogRiverOne = new FrogRiverOne();
        Assertions.assertEquals(6, frogRiverOne.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
        Assertions.assertEquals(9, frogRiverOne.solution(5, new int[]{1, 3, 1, 4, 2, 3, 4, 4, 3, 5, 2, 1, 5}));
    }
}