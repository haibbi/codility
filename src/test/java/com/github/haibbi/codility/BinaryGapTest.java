package com.github.haibbi.codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryGapTest {

    @Test
    void test() {
        BinaryGap binaryGap = new BinaryGap();
        Assertions.assertEquals(5, binaryGap.solution(1041));
    }

}