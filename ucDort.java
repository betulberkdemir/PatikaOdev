package patika;

import java.util.Scanner;

public class ucDort {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Girilen say�ya kadar 3 ve 4'e tam b�l�nen say�lar bulunacak");
		
		System.out.print("Bir say� giriniz: ");
		
		int say� = input.nextInt();
				
		int i = 0;
		while(i <= say�) {
			
			if(i % 3 == 0  && i % 4 == 0)
				System.out.print(i + " ");
			i++;
			
		}

	}

}
