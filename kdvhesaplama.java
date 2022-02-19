package test;
import java.util.Scanner;

public class kdvhesaplama {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double fyt, kfyt, ktutar, kdv;
		
		kdv = 0.18;
		
		System.out.print("Ürün fiyatýný giriniz = ");
		
		fyt = input.nextDouble();
		
		ktutar = fyt * kdv;
		kfyt = fyt + ktutar;
			
		
		System.out.println("KDV'siz fiyat = " + fyt);
		System.out.println("KDV'li fiyat = " + kfyt);
		System.out.println("KDV tutarý = " + ktutar);
		
		
		
	}

}
