package com.company;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	String x = reader.nextLine();
    char[] x_tab = x.toCharArray();
    char[] reverse_tab = new char[x_tab.length];

    for(int i=x_tab.length-1; i>=0; i--){
        reverse_tab[(reverse_tab.length-i-1)] = x_tab[i];
    }

    System.out.println("String na odwrot: "+String.valueOf(reverse_tab));
    }
}
