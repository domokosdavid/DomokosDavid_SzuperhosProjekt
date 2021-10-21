package com.company;

public abstract class Bosszuallo implements Szuperhos{

    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo (double szuperero , boolean vanEGyengesege ) {
        this . szuperero = szuperero ;
        this . vanEGyengesege = vanEGyengesege ;
        }


    @Override
    public boolean legyoziE(Szuperhos d) {
        return false;
    }

    @Override
    public double mekkoraAzEreje() {
        return 0;
    }
}
