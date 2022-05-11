package com.github.haibbi.codility;

import java.util.Arrays;

public class PermCheck {

    public int solution(int[] A) {
        long size = A.length;
        long expectedTotal = (size * (size + 1)) / 2;
        long total = Arrays.stream(A).asLongStream().sum();
        return expectedTotal == total ? 1 : 0;
    }

}
