package Lab07;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.Locale;
import java.util.Scanner;


public class FitnessApp {

    public static void main(String[] args) {

      
        Scanner in = new Scanner (System.in);
        System.out.print("Enter birthdate (YYYY-MM-DD): ");
        String date = in.nextLine();
        System.out.print("Enter gender (f)emale or (m)ale: ");
        String gender = in.nextLine();
        System.out.print("Enter height(m): ");
        double height = in.nextDouble();
        System.out.print("Enter weight(kg): ");
        double weight = in.nextDouble();
        System.out.print("Enter waist measurements(cm): ");
        double waist =in.nextDouble();
        System.out.print("Enter hip measurements(cm): ");
        double hip =in.nextDouble();
        System.out.print("Enter resting heart rate: ");
        double heartRate = in.nextDouble();
        System.out.println();
        System.out.println("------------MENU------------");
        System.out.println("1 - Calculate target heart rate");
        System.out.println("2 - Calculate waist/Hip ratio");
        System.out.println("3 - Body mass index");
        System.out.println("4 - Display fitness level ");
        System.out.println("5 - Quit");
        System.out.print("Enter choice: ");
        int choice =in.nextInt();
      
        FitnessAssesment person = new FitnessAssesment(date,gender, height, weight, hip, waist, heartRate);
   
        if ( choice == 1){
           System.out.println("Target heart rate: " + person.calculateTargetHeartRate(heartRate));
        }

        if ( choice == 2){
            System.out.println("Waist/hip ratio: " + person.calculateWaistHipRatio(hip, waist));
        }

        if ( choice == 3 ) {
            System.out.printf("%s%.1f%s%s%n","Your BMI is ",(weight / (height * height))," ",person.findBMICategory(weight,height));
        }

        if ( choice == 4) {
            System.out.println("Your fitness level is: " + person.determineFitnessLevel(height,weight, heartRate, heartRate));
        }

       if ( choice == 5) {
        System.out.println("Quitting...");
    }
   
    }
    
    }



