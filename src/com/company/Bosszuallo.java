package com.company;

public abstract class Bosszuallo implements Szuperhos{

    private double szuperero;

    private boolean vanEGyengesege;

    public Bosszuallo (double szuperero , boolean vanEGyengesege ) {
        this.szuperero = szuperero ;
        this.vanEGyengesege = vanEGyengesege ;
    }

    public abstract boolean megmentiAVilagot();


    @Override
    public boolean legyoziE(Szuperhos d) {
        return false;
    }

    @Override
    public double mekkoraAzEreje() {
        return this.szuperero;
    }

    public double getSzuprerero(){
        return szuperero;
    }

    public void setSzuprerero(double szuperero){
        this.szuperero = szuperero;
    }

    public boolean getVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public String toString() {
        return "Bosszúálló szuperereje: "+ szuperero +
                ", Van gyengesége:  " + vanEGyengesege;
    }
}
