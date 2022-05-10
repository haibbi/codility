package com.github.haibbi.codility;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        int shift = K % A.length;
        if (shift == 0) return A;

        int[] result = new int[A.length];
        System.arraycopy(A, A.length - shift, result, 0, shift);
        System.arraycopy(A, 0, result, shift, A.length - shift);
        return result;
    }

}
