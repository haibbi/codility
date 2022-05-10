package com.github.haibbi.codility;

public class FrogJmp {

    public int solution(int X, int Y, int D) {
        double distance = Y - X;
        return (int) Math.ceil(distance / D);
    }

}
