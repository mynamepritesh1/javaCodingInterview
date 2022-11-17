import java.util.Random;

public class GenerateRandomNumbersAndString {

	public static void main(String[] args) {
		
		//using random  
		
		Random random = new Random();
		
		int random_int = random.nextInt(1000);
		
		System.out.println(random_int);
		
		
		//printing random decimal number
	    double random_double = random.nextDouble();
	
	    System.out.println(random_double);
	    
	     //for print random decimal number using Math
	    System.out.println(Math.random());
	    
	    
	    //using Apache commons-langs API for int and string
	    
	    //String randNum = RandomStringUtils.randomNumber(5);
	    
	    //System.out.println(randNum);
	    
	    
	    //for string
	    
	    //String str = RandomStringUtils.randomAlphabetic(5);
	    
	    //system.out.println(str);
		

	}

}
