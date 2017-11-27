package com.company;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	String x = reader.nextLine();
    char[] x_tab = x.toCharArray();

    boolean palindrom = true;
    for(int i=0; i<x_tab.length; i++){
        if(x_tab[i] != x_tab[x_tab.length-i-1]) palindrom=false;
    }

    if(palindrom)
        System.out.println("Slowo jest palindromem!");
    else
        System.out.println("Slowko nie jest palindromem!");

    }
}
