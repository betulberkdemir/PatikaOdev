package test;

import java.util.Scanner;

public class notOrtalama {

	public static void main(String[] args) {
		
		int mat, fiz, kim, turk, trh, mzk;
		
		double ort;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Matematik notunuzu giriniz:");
		mat = input.nextInt();
		
		System.out.print(" Fizik notunuzu giriniz:");
		fiz = input.nextInt();
		
		System.out.print("Kimya notunuzu giriniz:");
		kim = input.nextInt();
		
		System.out.print("Türkçe notunuzu giriniz:");
		turk = input.nextInt();
		
		System.out.print("Tarih notunuzu giriniz:");
		trh = input.nextInt();
		
		System.out.print("Müzik notunuzu giriniz:");
		mzk = input.nextInt();
		
		ort = (mat + fiz + kim + turk + trh + mzk) / 6;
		
		System.out.println("Ortalamanýz: " + ort);
		boolean sonuc = ort >= 60;
		
		String str = sonuc ? "Geçtiniz" : "Kaldýnýz";
		
	    System.out.println(str);
		
		
	
		
		
		
		
		
		
	}
}
