import java.util.*;
public class BMIcalc {
    public static void main(String [] args) {
        ScanBMI();
    }
    public static void ScanBMI() {
        System.out.println("This program reads data for two people and");
        System.out.println("computers their body mass index (BMI).");
        System.out.println();
        System.out.println("Enter next person's information:");

        System.out.print("height (in inches)? ");
        Scanner b = new Scanner(System.in);
        double HEIGHT1 = b.nextInt();

        System.out.print("weight (in pounds)? "); 
        Scanner a = new Scanner(System.in);
        double WEIGHT1 = a.nextInt();

        System.out.println();
        System.out.println("Enter next person's information:");
        
        System.out.print("height (in inches)? ");
        Scanner d = new Scanner(System.in);
        double HEIGHT2 = d.nextInt();

        System.out.print("weight (in pounds)? ");
        Scanner c = new Scanner(System.in);
        double WEIGHT2 = c.nextInt();

       
        double BMI1 = (WEIGHT1/(HEIGHT1*HEIGHT1))*703;
        double BMI2 = (WEIGHT2/(HEIGHT2*HEIGHT2))*703;

        System.out.println();
        System.out.printf("Person 1 BMI = %.3f%n", BMI1);
        if (BMI1 < 18.5) {
            System.out.print("underweight");
        }

        else if (BMI1 > 18.5 && BMI1 < 24.9) {
            System.out.println("normal");
        }

        else if (BMI1 > 25 && BMI1 < 29.9) {
            System.out.println("overweight");
        }

        else if (BMI1 >= 30) {
            System.out.println("obese");
        }

        System.out.printf("Person 2 BMI = %.3f%n", BMI2);

        if (BMI2 < 18.5) {
            System.out.print("underweight");
        }

        if (BMI2 > 18.5 && BMI1 < 24.9) {
            System.out.println("normal");
        }
        
        if (BMI2 > 25 && BMI1 < 29.9) {
            System.out.println("overweight");
        }

        if (BMI2 >= 30) {
            System.out.println("obese");
        }

        System.out.printf("Difference = %.3f%n", Math.abs(BMI1-BMI2));
    }
}