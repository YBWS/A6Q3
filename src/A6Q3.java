import java.util.Scanner;

/**
 * 
 */

/**
 * @author b.yang
 *
 */
public class A6Q3 { 
	 
/** 
 * tells the user whether that number is prime. 
 * @param isPrime 
 * @return tells the user whether that number is prime. 
 */ 
	 
	public static boolean number (int isPrime) { 
    	 
   	boolean prime = true; 
     	 
   	if(isPrime < 2) return false ; 
     	 
   	for(int i = 2; prime && i <= Math.sqrt(isPrime); i++) 
          
     		if(isPrime % i == 0) return false; 
     			 
     	     	return true; 
 } 
 

 	/** 
 	 * @param args 
 	 */ 
 	public static void main(String[] args) { 
 		// TODO Auto-generated method stub 
 

 		Scanner userInput = new Scanner (System.in); 
 		int userChoice = userInput.nextInt();; 
 		 
 		System.out.println("Please enter a mark to begin."); 
 		if(number(userChoice)) 
 			System.out.println(userChoice+ "it's a prime number. "); 
 		else 
 			System.out.println(userChoice+"it's not a prime number. "); 
 		 
 		userInput.close(); 
 	}
 	 
}

	 
   
   	 
 
	
