import java.util.Scanner;

public class kucuktenBuyuge {
	
	public static void main(String[] args) {
		
		int s1, s2, s3;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. sayý: ");
		s1 = input.nextInt();
		
		System.out.println("2. sayý: ");
		s2 = input.nextInt();
		
		System.out.println("3. sayý: ");
		s3 = input.nextInt();
		
		
		if((s1<s2) && (s1<s3)) {
			if (s2<s3) {
				System.out.println(s1 + "<" + s2 + "<" + s3);
			}
			else {
				System.out.println(s1 + "<" + s3 + "<" + s2);
			}
		}
		
		if((s2<s1) && (s2<s3)){
			if (s1<s3) {
				System.out.println(s2 + "<" +  s1 + "<" + s3);
			}
			else {
				System.out.println(s2 + "<" +  s3 + "<" + s1);
			}
		}
		
		if((s3<s1) && (s3<s2)){
			
			if (s1<s2) {
				System.out.println(s3 + "<" +  s1 + "<" + s2);
			}
			else {
				System.out.println(s3 + "<" +  s2 + "<" + s1);
			}
		}
		
		
		
	}

}
