package com.company;

public class Vasember extends Bosszuallo implements Milliardos{

    public Vasember(){
        super(150, true);
    }
    public void kutyutKeszit(){
        this.getSzuprerero();
        this.setSzuprerero(Math.random()*10);
    }

    @Override
    public boolean megmentiAVilagot() {
        return this.getSzuprerero() > 1000 ? true : false;
    }

    @Override
    public String toString() {
        return "Vasember: " + super.toString();
    }
}
