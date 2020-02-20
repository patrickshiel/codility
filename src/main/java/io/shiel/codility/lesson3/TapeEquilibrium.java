package io.shiel.codility.lesson3;

import static java.lang.Math.abs;

public class TapeEquilibrium {

    public int solution(int[] A) {
        int n = A.length;
        int leftSum = 0;
        int rightSum = 0;

        for (int p = 0; p < n; p++) {
            rightSum += A[p];
        }

        int minimumDifference = rightSum;
        for (int p = 1; p < n; p++) {
            leftSum += A[(p-1)];
            rightSum -= A[(p-1)];
            int difference = abs(leftSum - rightSum);
            if(difference < minimumDifference) {
                minimumDifference = difference;
            }
        }
        return minimumDifference;
    }

}
