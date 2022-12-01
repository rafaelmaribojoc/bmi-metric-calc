import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Declarations
        int num1, num2, answer, total;
        
        //Instantiate
        Random randomNum = new Random();
        try(Scanner userInput = new Scanner(System.in)) {

        //Assignments
        num1 = randomNum.nextInt(11);
        num2 = randomNum.nextInt(11);
        total = num1 + num2;
        
        //Input & Questions
        System.out.println("Learn Addition\n");
        System.out.println("What is " + num1 + " + " + num2 + "?");
        System.out.print("Answer: ");
        answer = userInput.nextInt();
        };

        if (answer == total) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! The correct answer is " + total + ".");
        }
        
    }
}
