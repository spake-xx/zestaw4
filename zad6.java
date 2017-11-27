package com.company;

import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj lancuch znakow do zaszyfrowania:");
        String x = reader.nextLine();
        System.out.println("Podaj przesuniecie szyfru:");
        int przesuniecie = reader.nextInt();
        char[] x_tab = x.toCharArray();

        if(przesuniecie>26) przesuniecie=przesuniecie%26;
        if(przesuniecie<-26) przesuniecie=przesuniecie%-26;

        for(int i=0; i<x_tab.length; i++){
            x_tab[i] = (char)(x_tab[i]+przesuniecie);
        }

        System.out.println(String.valueOf(x_tab));

    }
}