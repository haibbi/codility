package com.github.haibbi.codility;

import java.util.Arrays;

public class MaxCounters {

    public int[] solution(int N, int[] A) {
        int max = 0;
        int[] counters = new int[N];

        for (int i : A) {
            if (i > N) {
                Arrays.fill(counters, max);
            } else {
                max = ++counters[i-1];
            }
        }
        return counters;
    }

}
