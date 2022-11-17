import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

     
		//using + (String concatenation) operator
		
     Scanner sc = new Scanner(System.in);
		
		System.out.println("Entter a String");
		
		String str = sc.next();
		
		
		String rev = "";
		
		int len = str.length();
		
		for(int i=len-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		
		 
		//using character Array
		
//		char a[] = str.toCharArray();
//		
//       int len = str.length();
//		
//		for(int i=len-1; i>=0; i--) {
//			rev = rev+a[i];
//		}
		
		
		System.out.println("Reverse String is "+rev);

	}

}
