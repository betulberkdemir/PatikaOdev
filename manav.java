package test;

import java.util.Scanner;

public class manav {
	
	public static void main(String[] args) {
		
		double arm = 2.14, elma= 3.67, dom= 1.11, muz =0.95, pat =5.0, toplam=0;
		t = arm+ elma+ dom+ muz + pat;
		Scanner input = new Scanner(System.in);
		
		int kilo;
		
		
		
		System.out.print("Armut Ka� Kilo ? :");
		kilo = input.nextInt();
		toplam += (kilo*arm);
		
		System.out.print("Elma Ka� Kilo ? :");
		kilo = input.nextInt();
		toplam += (kilo*elma);
		
		System.out.println("Domates Ka� Kilo ? :");
		kilo = input.nextInt();
		toplam += (kilo*dom);
		
		System.out.println("Muz Ka� Kilo ? :");
		kilo = input.nextInt();
		toplam += (kilo*muz);
		
		System.out.println("Patates Ka� Kilo ? :");
		kilo = input.nextInt();
		toplam += (kilo*pat);
		
		System.out.println("Toplam Tutar :" + toplam);
		
		
		
	}

}
