package test;

import java.util.Scanner;


public class ucgenAlan {
	
	public static void main(String[] args) {
		
		double a, b, c;
		
		double u, alan;
		
		Scanner gir = new Scanner(System.in);
		
		System.out.println("üçgenin 3 kenarýný giriniz: ");
		
		a = gir.nextInt();
		b = gir.nextInt();
		c = gir.nextInt();
		
		u = (a+b+c)/2;
		
		alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		
		System.out.println("Üçgenin alaný: " + alan);
		
		
		
	}

}
