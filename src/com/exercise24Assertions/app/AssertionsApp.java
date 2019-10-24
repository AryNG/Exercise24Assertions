package com.exercise24Assertions.app;

import java.util.Scanner;

public class AssertionsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad=0;
		System.out.println("Pleas write your age:");
		Scanner input = new Scanner(System.in);
		edad=input.nextInt();
		System.out.println(isMayorEdad(edad));
		
	}
	public static String isMayorEdad(int edad) {
		String cad="";
			assert edad>0: "AGE NOT VALID.";
			if (edad<18) {
				cad="Minor.";
			}
			if(edad>=18) {
				cad="At legal age.";
			}
			return cad;
	}
}
