import java.util.Scanner;

public class NumberOfEvenAndOddDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entter a Number");
		
		int num = sc.nextInt();


		int even = 0;
		int odd = 0;
		
		while(num>0) {
			
		int rem=num%10;
		
		if(rem%2==0) {
			even++;
		}
		else {
			odd++;
		}
		num =num/10;
		
		}
		
		System.out.println("Number of Even numbers is "+even);
		System.out.println("Number of Odd numbers is "+odd);

	}

}
