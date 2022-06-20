package Lab04;

import java.util.Scanner;
public class Lab04_Q2_Çelik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input string:");
        String input = in.nextLine();
        String lowInput = input.toLowerCase();

        String word1 = "";
        String word2 = "";
        int length = lowInput.length();
        int i = 0;
        
        while (i < length) {
            char a = lowInput.charAt(i);

            if (a == ' ') {

                if ( word1.length() > word2.length()) {
                    word2 = word1;

                    word1 = "";
                }
            }
            else {
                word1 = word1 + a;
            }      
            i++;
        }
       
        System.out.println("Longest block is " + word2.length());
    }
}
