package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Kepregeny {

    public static ArrayList<Szuperhos> lista = new ArrayList<Szuperhos>();

    public static void szereplok(String fajlnev) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(fajlnev));
        String sor = br.readLine();
        while (sor != null){
            String [] szavak = sor.split(" ");
        }
    }
}
