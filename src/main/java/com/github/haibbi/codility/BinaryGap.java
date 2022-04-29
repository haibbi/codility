package com.github.haibbi.codility;

public class BinaryGap {

    public int solution(int n) {
        int i = 0, max = Integer.MIN_VALUE;
        while (n > 0) {
            if ((n & 1) == 1) {
                if (max < i) {
                    max = i;
                }
                i = 0;
            } else {
                i++;
            }
            n = n >> 1;
        }
        return max;
    }

}
