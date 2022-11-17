
public class SumOfElementInArray {

	public static void main(String[] args) {
		int a[] = {2,4,7,8,19};
		
		int sum =0;
		
		for(int i = 0; i<=a.length-1; i++) {
			sum = sum+a[i];
		}
		
		System.out.println("Sum of Array is " +sum);
		

	}

}
