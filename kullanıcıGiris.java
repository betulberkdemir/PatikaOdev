package test;

import java.util.Scanner;
public class kullan�c�Giris {
	
	public static void main(String[] args) {
		
		
		String userName, password ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kullan�c� Ad�n�z: ");
		
		userName = input.nextLine();
		
		System.out.println("�ifreniz: ");
		
		password = input.nextLine();
		
		if(userName.equals("patika") && password.equals("ptk123")) {
			System.out.println("Giri� yapt�n�z..");
		}
		else {
			
			System.out.println("Hatal� giri� yapt�n�z.");
			System.out.println("�ifreyi s�f�rlamak ister misin?(e/h)");
			Scanner inp = new Scanner(System.in);
			String ynt = inp.nextLine();
			
			
		}
		
		
		
		
	}

}
