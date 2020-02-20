package io.shiel.codility.lesson1;

public class BinaryGap {

    public int solution(int N) {
        boolean readingGap = false;
        int currentGap = 0;
        int maxGap = 0;

        char[] binaryCharArray = Integer.toBinaryString(N).toCharArray();

        for (int i = 0; i < binaryCharArray.length; i++) {
            if (readingGap) {
                if (binaryCharArray[i] == '0') {
                    currentGap++;
                } else if (binaryCharArray[i] == '1') {
                    if (currentGap > maxGap) {
                        maxGap = currentGap;
                    }
                    currentGap = 0;
                }
            } else {
                if (binaryCharArray[i] == '1') {
                    readingGap = true;
                }
            }
        }

        return maxGap;
    }

}
