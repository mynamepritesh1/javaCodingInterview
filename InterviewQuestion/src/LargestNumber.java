import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a frist number");
		int a = sc.nextInt();

		
		System.out.println("Enter a frist number");
		int b = sc.nextInt();

		
		System.out.println("Enter a frist number");
		int c = sc.nextInt();
		
		
		//type 1
//		if(a>b && a>c) {
//			System.out.println(a+ " is largest number");
//			
//		}else if(b>a && b>c) {
//			System.out.println(b+ " is largest number");
//		}else {
//			System.out.println(c+ " is largest number");
//		}
		
		//using ternary operator
		
//		int d = a>b?a:b;
//		
//		int ansr = c>d?c:d;
		
		int Largest = c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println(Largest+ " is largest number");

	}

}
