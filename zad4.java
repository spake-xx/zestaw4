package com.company;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	String x = reader.nextLine();
    char[] x_tab = x.toCharArray();

    int suma = 0;
    for(int i=0; i<x_tab.length; i++){
        if(x_tab[i]>=48 && x_tab[i]<=57){
            suma+=(int)Character.getNumericValue(x_tab[i]);
        }
    }

    System.out.println(suma);

    }
}