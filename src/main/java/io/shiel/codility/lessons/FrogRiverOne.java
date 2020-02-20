package io.shiel.codility.lessons;

import java.util.HashMap;
import java.util.Map;

public class FrogRiverOne {

    public int solution(int X, int[] A) {
        Map<Integer, Integer> positionTimeMap = new HashMap<>();
        for (int time = 0; time < A.length; time++) {
            int position = A[time];
            if (!positionTimeMap.containsKey(position)) {
                positionTimeMap.put(position, time);
            }
        }

        int earliestTimeTaken = 0;
        for (int pos = X; pos >= 1; pos--) {
            if (positionTimeMap.containsKey(pos)) {
                if(positionTimeMap.get(pos) > earliestTimeTaken) {
                    earliestTimeTaken = positionTimeMap.get(pos);
                }
            } else {
                return -1;
            }
        }
        return earliestTimeTaken;
    }
}
