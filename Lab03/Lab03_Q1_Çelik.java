package Lab03;

import java.util.Scanner;
public class Lab03_Q1_Çelik {

    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in);
        System.out.print( "Enter names of passengers: ");
        String surnames = in.nextLine();
        
        String firstLetter = surnames.substring(0, 1);
        int dash = surnames.indexOf("-");
        String secondLetter = surnames.substring( dash + 1, dash + 2);

        int difference = firstLetter.compareTo(secondLetter);
        
        if ( difference < 0) {

            if ( firstLetter.compareTo("F") <= 0) {
                System.out.println ( "BOARDING GROUP 1");
            }

            else if ( firstLetter.compareTo("N") <= 0) {
                System.out.println( "BOARDING GROUP 2");
            }

            else if ( firstLetter.compareTo("T") <= 0) {
                System.out.println( "BOARDING GROUP 3");
            }
            
            else {
                System.out.println( "BOARDING GROUP 4");
            }
            
        }

        else if ( difference > 0) {

            if ( secondLetter.compareTo("F") <= 0) {
                System.out.println ( "BOARDING GROUP 1");
            }

            else if ( secondLetter.compareTo("N") <= 0) {
                System.out.println( "BOARDING GROUP 2");
            }

            else if ( secondLetter.compareTo("T") <= 0) {
                System.out.println( "BOARDING GROUP 3");
            }
            
            else {
                System.out.println( "BOARDING GROUP 4");
            }
        }

        else if ( difference == 0) {

            if ( firstLetter.compareTo("F") <= 0) {
                System.out.println ( "BOARDING GROUP 1");
            }

            else if ( firstLetter.compareTo("N") <= 0) {
                System.out.println( "BOARDING GROUP 2");
            }

            else if ( firstLetter.compareTo("T") <= 0) {
                System.out.println( "BOARDING GROUP 3");
            }
            
            else {
                System.out.println( "BOARDING GROUP 4");
            }    

        in.close();

                    

        }
    }
    
}
