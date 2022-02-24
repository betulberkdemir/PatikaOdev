package patika;
import java.util.Scanner;

public class DortVe5kuvvet {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.print("Sayý = ");
		int g = input.nextInt();
		
		for(int i=1; i<g; i *=4) {
			
			System.out.print(i + " ");
			
		}
		
		for(int i=1; i<g; i *= 5) {
			
			System.out.print(i + " ");
			
		}
		
		

} 
	}
