package patika;
import java.util.Scanner;

public class kombinasyon {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		int n, r, nr;
	
		int fakt1 = 1;
		int fakt2 = 1; 
		int fakt3 =1;
		
		
		System.out.print("n deðerini giriniz: ");
		n = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			fakt1 *= i;	
		}
		
		System.out.print("r deðerini giriniz: ");
		r = input.nextInt();
		
		for(int i = 1; i <= r; i++) {
			fakt2 *= i;
		}
		
		nr = n - r;
		
		for(int i = 1; i <= nr; i++) {
			fakt3 *= i;
		}
		
		//C(n,r) = n! / (r! * (n-r)!)
		System.out.println("C(n,r) = n! / (r! * (n-r)!)");
		System.out.println("C(n,r) = " + fakt1 / (fakt2 * fakt3));
		
		
		
		
		

	}

}
