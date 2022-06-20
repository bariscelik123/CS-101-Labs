package Lab03;

import java.util.Scanner;
public class Lab03_Q2_Çelik {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in);
        System.out.print( "Enter your weight: ");
        double weight = in.nextDouble();
        
        if ( weight > 0) {
            System.out.println( "Choose the planet:");
            System.out.println ( "1-Venus");
            System.out.println ( "2-Mars");
            System.out.println ( "3-Jupiter");
            System.out.println ( "4-Saturn");
            System.out.println ( "5-Uranus");
            System.out.println ( "6-Neptune");
            System.out.print( "Enter your choice: ");
            int choice = in.nextInt();

            if ( choice <= 6 && choice >= 1) {

                double venus = 0.78;
                double mars = 0.39;
                double jupiter = 2.65;
                double saturn = 1.17;
                double uranus = 1.05;
                double neptune = 1.23;
            
                if ( choice == 1) {
                    System.out.printf ("%s%.1f","Your weight on planet 1 is ",weight * venus);
                }

                if ( choice == 2) {
                    System.out.printf ("%s%.1f","Your weight on planet 2 is ",weight * mars);
                }

                if ( choice == 3) {
                    System.out.printf ("%s%.1f","Your weight on planet 3 is ",weight * jupiter);
                }

                if ( choice == 4) {
                    System.out.printf ("%s%.1f","Your weight on planet 4 is ",weight * saturn);
                }

                if ( choice == 5) {
                    System.out.printf ("%s%.1f","Your weight on planet 5 is ",weight * uranus);
                }

                if ( choice == 6) {
                    System.out.printf ("%s%.1f","Your weight on planet 6 is ",weight * neptune);
                }

            }

            else {
                System.out.println( "Invalid choice - quitting....");
            }

        }

        else {
            System.out.println( "Invalid weight - quitting....");
        }

        in.close();


        

        
        
    }
    
}
