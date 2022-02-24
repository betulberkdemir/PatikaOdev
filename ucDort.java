package patika;

import java.util.Scanner;

public class ucDort {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Girilen sayýya kadar 3 ve 4'e tam bölünen sayýlar bulunacak");
		
		System.out.print("Bir sayý giriniz: ");
		
		int sayý = input.nextInt();
				
		int i = 0;
		while(i <= sayý) {
			
			if(i % 3 == 0  && i % 4 == 0)
				System.out.print(i + " ");
			i++;
			
		}

	}

}
