package com.company;

public class Pet extends Animal {
    private Color color;

    public Pet(String vid, Color color) {
        super(vid);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void Gnaw(String mebel, int colichestvo) {

        System.out.println(mebel + "сломана" + colichestvo + " количество");
    }

    public final void Gnaw(int colichestvo) {
        System.out.println("количество"+colichestvo);
    }

    public void print(){
        System.out.println("vid"+getVid()+"color"+color);
    }

}