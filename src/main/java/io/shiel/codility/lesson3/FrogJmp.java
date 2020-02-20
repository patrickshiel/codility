package io.shiel.codility.lesson3;

public class FrogJmp {

    public int solution(int X, int Y, int D) {
        return ((Double) (Math.ceil((Double.valueOf(Y) - Double.valueOf(X)) / Double.valueOf(D)))).intValue();
    }

}
