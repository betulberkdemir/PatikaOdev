package test;

import java.util.Scanner;

public class DaireninAlan� {

	public static void main(String[]args) {
		
		int r , aci;
		double pi = 3.14, alan, cevre;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dairenin yar��ap�n� giriniz: ");
		
		r = input.nextInt();
		
		System.out.print("Daire diliminin merkez a��s�n� giriniz: ");
		
		aci = input.nextInt();
		
		cevre = 2* pi *r;
		
		alan  = (pi * (r*r) * aci) / 360;
		
		System.out.println("Merkez a��s� " + aci + " olan dairenin alan�: " + alan);
		System.out.println("�evresi: " + cevre);
		
		
		
	}
	
	
	
}
