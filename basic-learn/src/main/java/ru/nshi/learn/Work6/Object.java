package ru.nshi.learn.Work6;

public class Object {
    protected Colour colour = new Colour();
    protected double areaObject;

    public Object(){
        this.areaObject = -1;
    }

    public double getArea(){
        return this.areaObject;
    }

    public Colour getColour() {
        return colour;
    }

    public String info(){
        return  "Объект: " + this.getClass().getSimpleName() +
                "\nЦвет: " + this.colour.getColors() +
                "\nПлощадь: " + (double)(Math.round(this.areaObject * 100)/100.0) + "\n";
    }
}
