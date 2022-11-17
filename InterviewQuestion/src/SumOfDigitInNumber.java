import java.util.Scanner;

public class SumOfDigitInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		
		int sum = 0;
		
		while(num>0) {
			sum =sum+num%10;  //we get last digit sum
			num = num/10;  
			
		}
		System.out.println("Sum of digits in a number " +sum);

	}

}
