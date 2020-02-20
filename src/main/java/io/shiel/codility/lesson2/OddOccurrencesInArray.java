package io.shiel.codility.lesson2;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {

    public int solution(int[] A) {
        Set<Integer> unmapped = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if(unmapped.contains(A[i])) {
                unmapped.remove(A[i]);
            }
            else {
                unmapped.add(A[i]);
            }
        }
        return (int) unmapped.toArray()[0];
    }

}
