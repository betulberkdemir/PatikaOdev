package test;

import java.util.Scanner;
public class hesapMak {
	
	public static void main(String[]args) {
		
		
		int n1, n2, se�;
		
		Scanner gir = new Scanner(System.in);
		
		System.out.print("Birinci say�y� giriniz: ");
		
		n1 = gir.nextInt();
		
		System.out.print("�kinci say�y� giriniz: ");
		
		n2 = gir.nextInt();
		
		System.out.println("1.Toplama\t2.��karma\t3.�arpma\t4.B�lme");
		
		System.out.println("Ka��nc� i�lemi yapmak istiyorsunuz?");
		
		se� = gir.nextInt();
		
		switch (se�){
		
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
				System.out.println("Bir say� s�f�ra b�l�nemez.");
			break;
			
			
			
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
