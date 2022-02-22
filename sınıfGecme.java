import java.util.Scanner;

public class sınıfGecme {
	
	public static void main(String[] args) {
		
		int mat, fzk, kmy, biy, tur, notlar=0;
		
		double sayac = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik notunuz: ");
		
		mat = input.nextInt();
		
		if(mat>=0 && mat<=100) {
			notlar += mat;	
			sayac += 1;
			}
		else {
			System.out.println("Geçersiz not girdiniz.");
		}
		
		
		System.out.print("Fizik notunuz: ");
		
		fzk = input.nextInt();
		
		if(fzk>=0 && fzk<=100) {
			notlar += fzk;	
			sayac += 1;
			}
		else {
			System.out.println("Geçersiz not girdiniz.");
		}
		
		
		System.out.print("Kimya notunuz: ");
		
		kmy = input.nextInt();
		
		if(kmy>=0 && kmy<=100) {
			notlar += kmy;	
			sayac += 1;
			}
		else {
			System.out.println("Geçersiz not girdiniz.");
		}
		
		System.out.print("Biyoloji notunuz: ");
		
		biy = input.nextInt();
		
		if(biy>=0 && biy<=100) {
			notlar += biy;	
			sayac += 1;
			}
		else {
			System.out.println("Geçersiz not girdiniz.");
		}
		
		System.out.print("Türkçe notunuz: ");
		
		tur = input.nextInt();
		
		if(tur>=0 && tur<=100) {
			notlar += tur;	
			sayac += 1;
			}
		else {
			System.out.println("Geçersiz not girdiniz.");
		}
		
		
		double ort = notlar/ sayac;
		
		System.out.println("Ortalamanız: " + ort);
		
		if(ort<55)
			System.out.println("Sınıfta kaldınız.");
		else
			System.out.println("Geçtiniz.");
			
		
		
		
		
		
		
		
		
		
	}

}
