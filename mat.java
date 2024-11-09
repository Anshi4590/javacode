package methods;

public class Mathoperations {
	//any class  containing static void methods  can access the methods and call the methods 
	public void showevennumber ( int starting , int ending ) {
		System.out.println( " --- show even number ----");
	int i;
		for (  i = starting ;  i<= ending ;i++)
		{ 
			
			if ( i%2==0  ) {
			
				System.out.print( i+" ");
			}
		}
	}

}
