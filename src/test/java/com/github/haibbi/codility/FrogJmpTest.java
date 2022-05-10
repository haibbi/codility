package com.github.haibbi.codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FrogJmpTest {

    @Test
    void name() {
        FrogJmp frogJmp = new FrogJmp();
        Assertions.assertEquals(3, frogJmp.solution(10, 85, 30));
        Assertions.assertEquals(3, frogJmp.solution(10, 85, 37));
        Assertions.assertEquals(2, frogJmp.solution(10, 85, 38));
        Assertions.assertEquals(2, frogJmp.solution(10, 85, 74));
        Assertions.assertEquals(1, frogJmp.solution(10, 85, 75));
        Assertions.assertEquals(0, frogJmp.solution(10, 10, 5));
    }

}