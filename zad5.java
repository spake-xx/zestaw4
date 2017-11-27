package com.company;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String x = reader.nextLine();
        char[] x_tab = x.toCharArray();

        int nawiasy_otwierajace = 0;
        int nawiasy_zamykajace = 0;

        for(int i=0; i<x_tab.length; i++){
            if(x_tab[i]=='(') nawiasy_otwierajace++;
            if(x_tab[i]==')') nawiasy_zamykajace++;
        }

        System.out.println((nawiasy_otwierajace==nawiasy_zamykajace)?"Wyrażenie poprawne!":"Wyrażenie niepoprawne!");

    }
}