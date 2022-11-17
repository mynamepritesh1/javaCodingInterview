package Interview;

public class Main {

	public static void main(String[] args) {
		
		EqualsAndHashCodeCotract e1 = new EqualsAndHashCodeCotract();
		
		e1.setId(1);
		e1.setName("Ramesh");
		
      
		EqualsAndHashCodeCotract e2 = new EqualsAndHashCodeCotract();
       
		
		e2.setId(1);
		e2.setName("Ramesh");
		
		
		System.out.println("Shallow Compare " + (e1==e2));
		
		System.out.println("Deep Compare " + (e1.equals(e2))  );
		
		
		

		
	}

}
