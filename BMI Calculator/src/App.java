import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //Declaration
        double height, weight, bmi;
        String output;

        //Instantiate
        try(Scanner input = new Scanner(System.in)) {

        //Input
        System.out.print("Height (m): ");
        height = input.nextDouble();
        System.out.print("Weight (kg): ");
        weight = input.nextDouble();
        bmi = (weight / (height * height)); //if cm formula "w / h * h * 10_000"
        };

        // System.out.println(bmi);
        // System.out.println(Math.floor(bmi));

        //Conditional Process
        if (bmi <= 5.5) { //used to be bmi == 0 but ineffective so replaced.
            output = "Invalid height! Put your height in meters.\n"
            + "Example: 175 (cm) to 1.75 (m)\n";
        } else if (bmi >= 30.0) {
            output = "Obese";
        } else if (bmi >= 25.5 && bmi < 30.0) {
            output = "Overweight";
        } else if (bmi >= 18.5 && bmi < 25.5) {
            output = "Normal";
        } else if (bmi < 18.5) {
            output = "Underweight";
        } else {
            output = "No input!";
        }

        System.out.println("\n" + output);
    }
}
