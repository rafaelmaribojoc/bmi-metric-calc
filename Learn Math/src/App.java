import java.util.Scanner; 
import java.util.Random; 

public class Main {
	public static void main(String[] args) {
		//Instantiate 
		Scanner input = new Scanner (System.in);
		
		//Declarations 
		int userInput, returnedVal; 
		
		//Input  
		    do {
		      System.out.print(
		      "Choose Number\n" 
		      + "1. Addition\n"
		      + "2. Multiplication\n"
		      + "3. Division\n"
		      + "4. Subtraction\n"
		      + "5. Remainder\n"
		      + "6. Stop\n"
		      + "Type Number Here:  "
		      );
		      userInput = input.nextInt();
		      System.out.println("---------------------------------------\n");
		      returnedVal = calculator(userInput);
		      System.out.println("---------------------------------------\n");
		} while (returnedVal != 6);
				
	}
	
	public static int calculator(int userInput) {
	    
	    //Instantiate 
	    Random randomNum = new Random();
	    
	    //Declaration 
	    int num1, num2, total; 
	     
	     //Conditional
	    
	    if (userInput == 1) {
	       num1 = randomNum.nextInt(11);
	       num2 = randomNum.nextInt(11);
	       total = num1 + num2;
	       System.out.println("Addition:\n" + num1 + " + "  + num2 + " equals " + total + "\n");
	       return 1;
	    } else if (userInput == 2) {
	       num1 = randomNum.nextInt(11);
	       num2 = randomNum.nextInt(11);
	       total = num1 * num2;
	       System.out.println("Multiplication:\n" + num1 + " * "  + num2 + " equals " + total + "\n");
	        return 2;
	    } else if (userInput == 3) {
	       num1 = randomNum.nextInt(11);
	       num2 = randomNum.nextInt(11);
	       total = num1 / num2;
	       System.out.println("Division:\n" + num1 + " / "  + num2 + " equals " + total + "\n");
	       return 3;
	    } else if (userInput == 4) {
	       num1 = randomNum.nextInt(11);
	       num2 = randomNum.nextInt(11);
	       total = num1 - num2;
	       System.out.println("Subtraction:\n" + num1 + " - "  + num2 + " equals " + total + "\n");
	       return 4;
	    } else if (userInput == 5) {
	       num1 = randomNum.nextInt(11);
	       num2 = randomNum.nextInt(11);
	       total = num1 % num2;
	       System.out.println("Remainder:\n" + num1 + " % "  + num2 + " has a remainder of " + total + "\n");
	       return 5;
	    } else if (userInput == 6) {
	       return 6;
	    } else {
	        System.out.println("Invalid Input!\n"); 
	       return 6;
	    }
	}
}
