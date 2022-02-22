import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class Burçlar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ay, gun;
		String burc ="";
		boolean isError = false;
		
		System.out.println("Kaçıncı ayda doğdunuz?");
		ay = input.nextInt();
		System.out.println("Hangi gün doğdunuz?");
		gun = input.nextInt();
		
		if(ay == 1) {
			
			if(gun>=1 && gun<=31) {
				
				if(gun<21)
					burc = "oğlak";
				else
					burc = "kova";
			}
			else
				isError = true;
		}
		
		if(ay == 2) {
			if(gun>=1 && gun<=28) {
				
				if(gun<20)
					burc = "kova";
				else
					burc = "balık";
			}
		}
		
		
		if(ay == 3) {
			if(gun>=1 && gun<=31) {
				
				if(gun<21)
					burc = "balık";
				else
					burc = "koç";
			}
			else
				isError = true;
		}
		
		if(ay == 4) {
			if(gun>=1 && gun<=30) {
				
				if(gun<21)
					burc = "koç";
				else
					burc = "boğa";
			}
			else
				isError = true;
		}
		
		if(ay == 5) {
			if(gun>=1 && gun<=31) {
				
				if(gun<22)
					burc = "boğa";
				else
					burc = "ikizler";
			}
			else
				isError = true;
		}
		
		if(ay == 6) {
			if(gun>=1 && gun<=30) {
				
				if(gun<23)
					burc = "ikizler";
				else
					burc = "yengeç";
			}
			else
				isError = true;
		}
		


		if(ay == 7) {
			if(gun>=1 && gun<=31) {
				
				if(gun<23)
					burc = "yengeç";
				else
					burc = "aslan";
			}
			else
				isError = true;
		}
		
		
		
		if(ay == 8) {
			if(gun>=1 && gun<=31) {
				
				if(gun<23)
					burc = "aslan";
				else
					burc = "basak";
			}
			else
				isError = true;
		}
		
		if(ay == 9) {
			if(gun>=1 && gun<=30) {
				
				if(gun<22)
					burc = "basak";
				else
					burc = "terazi";
			}
			else
				isError = true;
		}
		
		if(ay == 10) {
			if(gun>=1 && gun<=31) {
				
				if(gun<23)
					burc = "terazi";
				else
					burc = "akrep";
			}
			else
				isError = true;
		}
		
		if(ay == 11) {
			if(gun>=1 && gun<=30) {
				
				if(gun<22)
					burc = "akrep";
				else
					burc = "yay";
			}
			else
				isError = true;
		}
		
		if(ay == 12) {
			if(gun>=1 && gun<=31) {
				
				if(gun<22)
					burc = "yay";
				else
					burc = "oğlak";
			}
			else
				isError = true;
		}
		
		
		if(isError)
			System.out.println("Hatalı giriş yaptınız");
			
		else
			System.out.println("Burcunuz: " + burc);
		
		
		
		

	}

}
