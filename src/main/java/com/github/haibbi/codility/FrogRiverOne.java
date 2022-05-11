package com.github.haibbi.codility;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrogRiverOne {

    public int solution(int X, int[] A) {
        Set<Integer> positions = IntStream.rangeClosed(1, X).boxed().collect(Collectors.toSet());
        for (int i = 0, aLength = A.length; i < aLength; i++) {
            int position = A[i];
            positions.remove(position);
            if (positions.isEmpty()) return i;
        }
        return -1;
    }

}
