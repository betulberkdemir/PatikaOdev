package test;

import java.util.Scanner;

public class VucudKitle {

	public static void main(String[] args) {
		
		double boy, kilo, ind;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("L�tfen boyunuzu (metre cinsinde) giriniz : ");
		boy = input.nextDouble();
		
		System.out.print("L�tfen kilonuzu giriniz : ");
		kilo = input.nextDouble();
		
		ind = (kilo / (boy * boy));
		
		System.out.print("V�cut Kitle �ndeksiniz : " + ind);
		
		
	}
	
}
