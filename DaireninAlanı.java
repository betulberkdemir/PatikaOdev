package test;

import java.util.Scanner;

public class DaireninAlaný {

	public static void main(String[]args) {
		
		int r , aci;
		double pi = 3.14, alan, cevre;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dairenin yarýçapýný giriniz: ");
		
		r = input.nextInt();
		
		System.out.print("Daire diliminin merkez açýsýný giriniz: ");
		
		aci = input.nextInt();
		
		cevre = 2* pi *r;
		
		alan  = (pi * (r*r) * aci) / 360;
		
		System.out.println("Merkez açýsý " + aci + " olan dairenin alaný: " + alan);
		System.out.println("çevresi: " + cevre);
		
		
		
	}
	
	
	
}
