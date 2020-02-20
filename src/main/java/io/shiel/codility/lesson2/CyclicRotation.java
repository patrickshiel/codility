package io.shiel.codility.lesson2;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        int[] rotated = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            rotated[((i + K) % (A.length))] = A[i];
        }
        return rotated;
    }

}
