package patika;
import java.util.Scanner;

public class ciftVeDortKat {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int sayý;
		int toplam = 0;
		
		do {
			System.out.println("Bir sayý giriniz :");
			sayý = input.nextInt();
			
			if(sayý % 4 == 0 || sayý % 2 == 0) {
				
				toplam += sayý;
				
			}
			
		}while(sayý%2 == 0);
		
		System.out.print(toplam);


		

	}

}
