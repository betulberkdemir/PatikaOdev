package test;

import java.util.Scanner;

public class VucudKitle {

	public static void main(String[] args) {
		
		double boy, kilo, ind;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
		boy = input.nextDouble();
		
		System.out.print("Lütfen kilonuzu giriniz : ");
		kilo = input.nextDouble();
		
		ind = (kilo / (boy * boy));
		
		System.out.print("Vücut Kitle Ýndeksiniz : " + ind);
		
		
	}
	
}
