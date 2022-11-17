
public class EvenAndOddFromArray {

	public static void main(String[] args) {
		int a[] = {2,6,8,3,9,10,12};
		
		//extracting even number
		System.out.println("Even numbers in Array");
		for(int i =0; i<a.length; i++) {
			if(a[i]%2==0)
				System.out.println(a[i]);
			
		}
        
		System.out.println("odd numbers in Array");
		for(int i =0; i<a.length; i++) {
			if(a[i]%2!= 0)
				System.out.println(a[i]);
			
		}
	}

}
