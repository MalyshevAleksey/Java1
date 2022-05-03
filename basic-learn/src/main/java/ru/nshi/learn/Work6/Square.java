package ru.nshi.learn.Work6;

public class Square extends Rectangle {

    public Square(double[] sides){
        super(sides);
        boolean isSquare = true;
        for(int i = 0; i < 4; i++) {
            if (sides[0]!=sides[i] || sides[0] <= 0) {
                isSquare = false;
            }
        }
        if(!(isSquare)) {
            throw new IllegalArgumentException();
        }
        else {
            this.areaObject = Math.pow(this.sides[0], 2);
        }
    }
}