package ru.nshi.learn.Work6;

public class Colour {
    private int RH, GS, BB;

    public void setColourRGB(int red, int green, int blue){
        if((red >= 0 && red <= 255) & (green >= 0 && green <= 255) & (blue >= 0 && blue <= 255)) {
            this.RH = red;
            this.GS = green;
            this.BB = blue;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    public void setColourHSB(int hue, int saturation, int brightness){
        if((hue >= 0 && hue <= 360) & (saturation >= 0 && saturation <= 100) & (brightness >= 0 && brightness <= 100)) {
            this.RH = hue;
            this.GS = saturation;
            this.BB = brightness;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    public int getRH() {
        return this.RH;
    }

    public int getGS() {
        return this.GS;
    }

    public int getBB() {
        return this.BB;
    }

    public String getColors(){
        return "hue = " + this.RH + "\n\t  saturation = " + this.GS + "\n\t  brightness = " + this.BB;
    }
}
