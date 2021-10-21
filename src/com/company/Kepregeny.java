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
            if(szavak[0].equals("Vasember")){
                Vasember v = new Vasember();
                for(int i=0; i<Integer.parseInt(szavak[1]); i++){
                    v.kutyutKeszit();
                }
                lista.add(v);
            }
            else if (szavak[0].equals("Batman")){
                Batman v = new Batman();
                for(int i=0; i<Integer.parseInt(szavak[1]); i++){
                    v.kutyutKeszit();
                }
                lista.add(v);
            }
            else{
                System.out.println("Hibás a sor!");
            }
            sor = br.readLine();
        }
        br.close();
    }

    public static void szuperhosok(){
        for(int i = 0; i<lista.size(); i++){
            System.out.println(lista.get(i).toString());
        }
    }


    public static void main(String[] args) {
        try {
            szereplok("szuperhos.txt");
            szuperhosok();
        }catch (Exception ex){
            System.out.println("Error!");
        }
    }

}
