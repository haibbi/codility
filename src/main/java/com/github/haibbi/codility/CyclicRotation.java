package com.github.haibbi.codility;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        int[] result = new int[A.length];
        int delta = A.length - K;
        System.arraycopy(A, K + 1, result, 0, delta);
        System.arraycopy(A, 0, result, delta, delta + 1);
        return result;
    }

    public int[] solutionMemoryEfficient(int[] A, int K) {
        for (int i = 0; i < A.length - K; i++) {
            int position = (i + K) % A.length;
            int temp = A[position];
            A[position] = A[i];
            A[i] = temp;
        }
        return A;
    }

}
