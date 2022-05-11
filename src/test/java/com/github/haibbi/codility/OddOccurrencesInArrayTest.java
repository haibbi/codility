package com.github.haibbi.codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OddOccurrencesInArrayTest {

    @Test
    void test() {
        OddOccurrencesInArray ooia = new OddOccurrencesInArray();
        Assertions.assertEquals(7, ooia.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }

}