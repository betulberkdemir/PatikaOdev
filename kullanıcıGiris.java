package test;

import java.util.Scanner;
public class kullanýcýGiris {
	
	public static void main(String[] args) {
		
		
		String userName, password ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kullanýcý Adýnýz: ");
		
		userName = input.nextLine();
		
		System.out.println("Þifreniz: ");
		
		password = input.nextLine();
		
		if(userName.equals("patika") && password.equals("ptk123")) {
			System.out.println("Giriþ yaptýnýz..");
		}
		else {
			
			System.out.println("Hatalý giriþ yaptýnýz.");
			System.out.println("Þifreyi sýfýrlamak ister misin?(e/h)");
			Scanner inp = new Scanner(System.in);
			String ynt = inp.nextLine();
			
			
		}
		
		
		
		
	}

}
