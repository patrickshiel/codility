package io.shiel.codility.lesson3;

public class PermMissingElem {

    public int solution(int[] A) {
        int[] B = new int[A.length + 1];

        for (int i = 0; i < A.length; i++) {
            B[A[i] - 1] = A[i];
        }

        for (int i = 0; i < B.length; i++) {
            if (B[i] < 1) {
                return i + 1;
            }
        }

        return 0;
    }

}
