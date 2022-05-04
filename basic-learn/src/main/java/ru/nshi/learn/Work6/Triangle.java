package ru.nshi.learn.Work6;

public class Triangle extends Object {
    private final double[] sides = new double[3];

    public Triangle(double[] side){
        double halfMeter = 0;
        boolean isMoreZero = true;
        for (int i = 0; i < 3; i++) {
            if (side[i] <= 0) {
                isMoreZero = false;
            }
        }
        if((isMoreZero) && (((side[0]+side[1])>side[2]) && ((side[0] + side[2])>side[1]) && ((side[1] + side[2])>side[0]))) {
            for(int i = 0; i < 3; i++) {
                this.sides[i] = side[i];
                halfMeter += this.sides[i];
            }
            halfMeter = halfMeter/2;
            this.areaObject = Math.sqrt(halfMeter * (halfMeter - this.sides[0]) * (halfMeter - this.sides[1]) * (halfMeter - this.sides[2]));
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    public double[] getSides(){
        return sides;
    }

    @Override
    public String info(){
        String str = super.info();
        return str + "Стороны: \n\ta = " + this.sides[0] +
                              "\n\tb = " + this.sides[1] +
                              "\n\tc = " + this.sides[2] +
                              "\n";
    }
}