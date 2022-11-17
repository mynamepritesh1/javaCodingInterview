import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		int num = sc.nextInt();
		
		//reverse a number using algorithm
		
//		int rev = 0;
//		while(num!= 0){
//			rev = rev*10 + num%10;
//			num = num/10;
//			
//		}
		
		//using StringBUffer class
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		StringBuffer rev= sb.reverse();
		
		
		//using stringBUilder
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append(num);
		StringBuilder rev = sb1.reverse();
		
		
		
		
		System.out.println("Rever Number is " +rev);
		
	}

}
