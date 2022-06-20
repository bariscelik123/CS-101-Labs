package Lab04;

import java.util.Scanner;
public class Lab04_Q1_Çelik {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print ( "Enter strings: ");
        String word = in.nextLine();
        String lowerWord = word.toLowerCase();

        while ( !lowerWord.equals("exit")) {
         String newWord = in.nextLine();
         String lowerNewWord = newWord.toLowerCase();
            
            if ( lowerNewWord.compareTo(lowerWord) < 0) {

                System.out.println("String that comes second: " + lowerWord);
            }

            else if (lowerNewWord.compareTo(lowerWord) > 0) {
                System.out.println("String that comes second: " + lowerNewWord);
            }

            else {
                System.out.println( "Not enough data");
            }
                
            }

        }
        
    }
    

