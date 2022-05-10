package com.github.haibbi.codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PermMissingElemTest {

    @Test
    void test() {
        PermMissingElem pme = new PermMissingElem();
        Assertions.assertEquals(4, pme.solution(new int[]{1, 2, 3, 5}));
    }

}