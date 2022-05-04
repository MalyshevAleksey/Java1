package ru.nshi.learn.Work6;

public class Circle extends Object {
    private final double r;

    public Circle(double r){
        if(r > 0) {
            this.r = r;
            this.areaObject = Math.PI * Math.pow(r, 2);
        }
        else{
            this.r = -1;
            throw new IllegalArgumentException();
        }
    }

    public double getRadius() {
        return r;
    }

    @Override
    public String info(){
        String str = super.info();
        return str + "Радиус = " + this.r + "\n";
    }
}
