package ru.nshi.learn.Work6;

public class Rectangle extends Object {
    protected final double[] sides = new double[4];

    public Rectangle(double[] side){
        boolean isMoreZero = true;
        for (int i = 0; i < 4; i++) {
            if (side[i] <= 0) {
                isMoreZero = false;
            }
        }
        if(isMoreZero && (side[0] == side[2] && side[1] == side[3])) {
            for (int i = 0; i < 4; i++) {
                this.sides[i] = side[i];
            }
            for(int i = 1; i < side.length; i++){
                if(this.sides[0] != this.sides[i] || i == 3){
                    this.areaObject = this.sides[0] * this.sides[i];
                }
            }
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
                              "\n\td = " + this.sides[3] +
                              "\n";
    }
}
