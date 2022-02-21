package test;

import java.util.Scanner;

public class manav {
	
	public static void main(String[] args) {
		
		double arm = 2.14, elma= 3.67, dom= 1.11, muz =0.95, pat =5.0, toplam=0;
		t = arm+ elma+ dom+ muz + pat;
		Scanner input = new Scanner(System.in);
		
		int kilo;
		
		
		
		System.out.print("Armut Kaç Kilo ? :");
		kilo = input.nextInt();
		toplam += (kilo*arm);
		
		System.out.print("Elma Kaç Kilo ? :");
		kilo = input.nextInt();
		toplam += (kilo*elma);
		
		System.out.println("Domates Kaç Kilo ? :");
		kilo = input.nextInt();
		toplam += (kilo*dom);
		
		System.out.println("Muz Kaç Kilo ? :");
		kilo = input.nextInt();
		toplam += (kilo*muz);
		
		System.out.println("Patates Kaç Kilo ? :");
		kilo = input.nextInt();
		toplam += (kilo*pat);
		
		System.out.println("Toplam Tutar :" + toplam);
		
		
		
	}

}
