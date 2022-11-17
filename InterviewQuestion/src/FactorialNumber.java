import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		
		int num = sc.nextInt();
		
     System.out.println("Enter factorial number");
		
		long fact = sc.nextInt();
		
		for(int i =1; i<=num;i++) {
			fact =fact*i;
			
		}
		System.out.println("Factorial number is " +fact);
		
		
		
		

	}

}
