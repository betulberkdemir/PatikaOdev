import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class Bur�lar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ay, gun;
		String burc ="";
		boolean isError = false;
		
		System.out.println("Ka��nc� ayda do�dunuz?");
		ay = input.nextInt();
		System.out.println("Hangi g�n do�dunuz?");
		gun = input.nextInt();
		
		if(ay == 1) {
			
			if(gun>=1 && gun<=31) {
				
				if(gun<21)
					burc = "o�lak";
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
					burc = "bal�k";
			}
		}
		
		
		if(ay == 3) {
			if(gun>=1 && gun<=31) {
				
				if(gun<21)
					burc = "bal�k";
				else
					burc = "ko�";
			}
			else
				isError = true;
		}
		
		if(ay == 4) {
			if(gun>=1 && gun<=30) {
				
				if(gun<21)
					burc = "ko�";
				else
					burc = "bo�a";
			}
			else
				isError = true;
		}
		
		if(ay == 5) {
			if(gun>=1 && gun<=31) {
				
				if(gun<22)
					burc = "bo�a";
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
					burc = "yenge�";
			}
			else
				isError = true;
		}
		


		if(ay == 7) {
			if(gun>=1 && gun<=31) {
				
				if(gun<23)
					burc = "yenge�";
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
					burc = "o�lak";
			}
			else
				isError = true;
		}
		
		
		if(isError)
			System.out.println("Hatal� giri� yapt�n�z");
			
		else
			System.out.println("Burcunuz: " + burc);
		
		
		
		

	}

}
