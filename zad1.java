package com.company;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	String x = reader.nextLine();
    char[] x_tab = x.toCharArray();
    char last_char = x_tab[x_tab.length-1];

    int ilosc = 0;
    for(int i=0; i<x_tab.length; i++){
        if(x_tab[i]==last_char) ilosc++;
    }

    System.out.println("Ilosc wystapien ostatniej litery:"+ilosc);
    }
}
