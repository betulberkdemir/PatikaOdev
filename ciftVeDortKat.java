package patika;
import java.util.Scanner;

public class ciftVeDortKat {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int say�;
		int toplam = 0;
		
		do {
			System.out.println("Bir say� giriniz :");
			say� = input.nextInt();
			
			if(say� % 4 == 0 || say� % 2 == 0) {
				
				toplam += say�;
				
			}
			
		}while(say�%2 == 0);
		
		System.out.print(toplam);


		

	}

}
