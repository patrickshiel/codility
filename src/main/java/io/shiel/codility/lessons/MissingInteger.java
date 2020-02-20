package io.shiel.codility.lessons;

import java.util.HashSet;

public class MissingInteger {

    public int solution(int[] A) {
        int maxVal = 1;
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i < A.length; i++) {
            int arrayElement = A[i];
            if (arrayElement > 0) {
                hashSet.add(arrayElement);
                if (arrayElement > maxVal) {
                    maxVal = arrayElement;
                }
            }
        }

        for (int j = 1; j <= maxVal + 1; j++) {
            if (!hashSet.contains(j)) {
                return j;
            }
        }

        return 1;
    }

}
