package com.github.haibbi.codility;

import java.util.HashSet;

public class OddOccurrencesInArray {

    public int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : A) {
            if (!set.add(i)) {
                set.remove(i);
            }
        }
        return set.iterator().next();
    }

}
