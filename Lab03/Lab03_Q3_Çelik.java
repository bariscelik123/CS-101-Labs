package Lab03;

import java.util.Scanner;
public class Lab03_Q3_Çelik {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in);
        System.out.println( "Is the object an Animal/Vegetable/Mineral?");
        System.out.print( "Answer:");
        String firstAnswer = in.nextLine();
        String casefirstAnswer = firstAnswer.toLowerCase();

        String bigAnimal = "elephant";
        String smallAnimal = "squirell";
        String bigVegetable = "pumpkin";
        String smallVegetable = "carrot";
        String bigMineral = "bus";
        String smallMineral = "pencil";
 
        if ( casefirstAnswer.equals( "animal")) {
            System.out.println( "Is the object bigger than a shoe box? ");
            System.out.print( "Answer:");
            String answer1 = in.nextLine();
            String caseAnswer1 = answer1.toLowerCase();

            if ( caseAnswer1.equals( "yes")) {
                System.out.println( "It is a " + bigAnimal);
            }

            else if ( caseAnswer1.equals( "no")) {
                System.out.println( "It is a " + smallAnimal);
            }

            else {
                System.out.println( "I don't understand, \"" + answer1 + "\" is not a valid answer.");
            }

        }

        else if ( casefirstAnswer.equals( "vegetable")) {
            System.out.println( "Is the object bigger than a shoe box? ");
            System.out.print( "Answer:");
            String answer2 = in.nextLine();
            String caseAnswer2 = answer2.toLowerCase();

            if ( caseAnswer2.equals( "yes")) {
                System.out.println( "It is a " + bigVegetable);
            }
            
            else if ( caseAnswer2.equals( "no")) {
                System.out.println( "It is a " + smallVegetable);
            }

            else {
                System.out.println( "I don' t understand \"" + answer2 + "\" is not a valid answer. ");
            }

        }

        else if ( casefirstAnswer.equals( "mineral")) {
            System.out.println( "Is the object bigger than a shoe box? ");
            System.out.print( "Answer:");
            String answer3 = in.nextLine();
            String caseAnswer3 = answer3.toLowerCase();

            if ( caseAnswer3.equals( "yes")) {
                System.out.println( "It is a " + bigMineral);
            }

            else if ( caseAnswer3.equals( "no")) {
                System.out.println( "It is a " + smallMineral);
            }

            else {
                System.out.println( "I don't understand \"" + answer3 + "\" is not a valid answer.");
            }

        }

        else {
            System.out.println( "I don't understand, \"" + firstAnswer + "\" is not a valid answer.");
        }
    in.close();
    }
}
