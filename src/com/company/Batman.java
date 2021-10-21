package com.company;

public class Batman implements Szuperhos, Milliardos{

    private double lelemenyesseg;

    public Batman(){
        this.lelemenyesseg = 100;
    }
    @Override
    public void kutyutKeszit() {
        this.lelemenyesseg+=50;
    }

    @Override
    public boolean legyoziE(Szuperhos d) {
        if (d.mekkoraAzEreje() < this.lelemenyesseg){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public double mekkoraAzEreje() {
        return this.lelemenyesseg*2;
    }

    @Override
    public String toString() {
        return "Batman leleményessége: " + lelemenyesseg;
    }
}
