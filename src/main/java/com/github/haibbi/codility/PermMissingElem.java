package com.github.haibbi.codility;

import java.util.Arrays;

public class PermMissingElem {

    public int solution(int[] A) {
        int size = A.length + 1;
        int expectedSum = (size * (size + 1)) / 2;
        int sum = Arrays.stream(A).sum();
        return expectedSum - sum;
    }

}
