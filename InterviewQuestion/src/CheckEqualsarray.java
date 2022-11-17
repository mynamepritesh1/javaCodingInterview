import java.util.Arrays;

public class CheckEqualsarray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,0,5};
		
		int b[] = {1,2,3,4,5};
		
		boolean status =Arrays.equals(a, b);
		
		if(status ==true) {
			System.out.println("Arrays are equals");
		}else {
			System.out.println("Araays are not equals");
		}

	}

}
