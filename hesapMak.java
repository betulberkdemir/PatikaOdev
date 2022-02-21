package test;

import java.util.Scanner;
public class hesapMak {
	
	public static void main(String[]args) {
		
		
		int n1, n2, seç;
		
		Scanner gir = new Scanner(System.in);
		
		System.out.print("Birinci sayýyý giriniz: ");
		
		n1 = gir.nextInt();
		
		System.out.print("Ýkinci sayýyý giriniz: ");
		
		n2 = gir.nextInt();
		
		System.out.println("1.Toplama\t2.Çýkarma\t3.Çarpma\t4.Bölme");
		
		System.out.println("Kaçýncý iþlemi yapmak istiyorsunuz?");
		
		seç = gir.nextInt();
		
		switch (seç){
		
		case 1:
			System.out.println(n1+n2);
			break;
		case 2:
			System.out.println(n1-n2);
			break;
		case 3:
			System.out.println(n1*n2);
			break;
		case 4:
			if(n2 != 0) {
				System.out.println(n1/n2);
			}else
				System.out.println("Bir sayý sýfýra bölünemez.");
			break;
			
			
			
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
