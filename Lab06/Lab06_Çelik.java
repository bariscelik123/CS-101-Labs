package Lab06;

import java.util.Scanner;
public class Lab06_Çelik {

    private static StringBuffer stb;
    private static String newWord;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string:");
        String word = scanner.nextLine(); 
        
        System.out.println("Characters are alphabetic: " + isAlphaWord(word));
        System.out.println("Removed adjacent duplicates: " + removeAdjacentDuplicates(word));
        System.out.println("Removed letters: " + removeLetters(word));
        System.out.println("Get Code: " + getCode(word));
        System.out.println("Numbers of the soundex: " + getCode(removeLetters(removeAdjacentDuplicates(word)))); 
        System.out.println("Pad code: " + padCode(word));
        System.out.println("Soundex: " + getSoundex(word));
        

    }







    /**
     * This method checks the word for alphabet.
     * @param word
     * @return isAlphaWord
     */

    public static boolean isAlphaWord(String word) {
        boolean isAlphaWord = true;
        
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) <= '9') {
                 isAlphaWord = false;
            }
        }

        return isAlphaWord;
        
    } 




     /**
      * This method converts letters to numbers.
      * @param word
      * @return t
      */

     public static String getCode(String word) {

        String t = "";

        String upperWord = word.toUpperCase();

        if ( upperWord.charAt(0) != 'A' || upperWord.charAt(0) != 'E' || upperWord.charAt(0) != 'I' ||
        upperWord.charAt(0) != 'O' || upperWord.charAt(0) != 'U' || upperWord.charAt(0) != 'W' ||
        upperWord.charAt(0) != 'H' || upperWord.charAt(0) != 'Y' ) {

        for (int a = 1; a < word.length(); a++) {

            if (upperWord.charAt(a) == 'B' || upperWord.charAt(a) == 'F' || upperWord.charAt(a) == 'P'
            || upperWord.charAt(a) == 'V' ) {
                t = t + "1";
            }

            else if (upperWord.charAt(a) == 'C' || upperWord.charAt(a) == 'G' || upperWord.charAt(a) == 'J'
            || upperWord.charAt(a) == 'K' || upperWord.charAt(a) == 'Q' || upperWord.charAt(a) == 'S' ||
            upperWord.charAt(a) == 'X' || upperWord.charAt(a) == 'Z'  ) {
                t = t + "2";            }

            else if (upperWord.charAt(a) == 'D' || upperWord.charAt(a) == 'T') {
                t = t + "3";            }

            else if (upperWord.charAt(a) == 'L') {
                t = t + "4";            }

            else if (upperWord.charAt(a) == 'M' || upperWord.charAt(a) == 'N') {
                t = t + "5";            }

           else  if (upperWord.charAt(a) == 'R') {
                t = t + "6";      }

                else {
                    t = t + word.charAt(a);
                }
        }
    }

    else if (upperWord.charAt(0) == 'A' || upperWord.charAt(0) == 'E' || upperWord.charAt(0) == 'I' ||
    upperWord.charAt(0) == 'O' || upperWord.charAt(0) == 'U' || upperWord.charAt(0) == 'W' ||
    upperWord.charAt(0) == 'H' || upperWord.charAt(0) == 'Y') {

        for (int b = 1; b < word.length(); b++) {

            if (upperWord.charAt(b) == 'B' || upperWord.charAt(b) == 'F' || upperWord.charAt(b) == 'P'
            || upperWord.charAt(b) == 'V' ) {
                t = t + "1";
            }

            else if (upperWord.charAt(b) == 'C' || upperWord.charAt(b) == 'G' || upperWord.charAt(b) == 'J'
            || upperWord.charAt(b) == 'K' || upperWord.charAt(b) == 'Q' || upperWord.charAt(b) == 'S' ||
            upperWord.charAt(b) == 'X' || upperWord.charAt(b) == 'Z'  ) {
                t = t + "2";            }

            else if (upperWord.charAt(b) == 'D' || upperWord.charAt(b) == 'T') {
                t = t + "3";            }

            else if (upperWord.charAt(b) == 'L') {
                t = t + "4";            }

            else if (upperWord.charAt(b) == 'M' || upperWord.charAt(b) == 'N') {
                t = t + "5";            }

           else  if (upperWord.charAt(b) == 'R') {
                t = t + "6";      }

                else {
                    t = t + word.charAt(b);
                }
        }
    }    
        return t.toUpperCase();
    }





    /**
     * This method removes adjacent repeating characters.
     * @param upperWord
     * @return sb
     */
    public static String removeAdjacentDuplicates ( String word) {
        
        for (int i = 1; i < word.length(); i++) { 

            String upperWord = word.toUpperCase();

            if (upperWord.charAt(i) == upperWord.charAt(i - 1)) { 
                                                    
                word = word.substring(0, i) + word.substring(i + 1);                   
    
            }
        }
        return word;
    }





    /**
     * This method removes a string from our word.
     * @param word
     * @return stb
     */
    public static String removeLetters (String word) {
        
        String upWord = word.toUpperCase();

        for (int k = 0; k < word.length(); k++) {

            if (upWord.charAt(k) == 'A' || upWord.charAt(k) == 'E' || upWord.charAt(k) == 'I' || 
            upWord.charAt(k) == 'O' || upWord.charAt(k) == 'U' || upWord.charAt(k) == 'H' || 
            upWord.charAt(k) == 'W' || upWord.charAt(k) == 'Y') {

                String newWord = word.replace('a', ' ');
                String newWord2 = newWord.replace('e', ' ');
                String newWord3 = newWord2.replace('i', ' ');
                String newWord4 = newWord3.replace('o', ' ');
                String newWord5 = newWord4.replace('u', ' ');
                String newWord6 = newWord5.replace('h', ' ');
                String newWord7 = newWord6.replace('w', ' ');
                String newWord8 = newWord7.replace('y', ' ');
                
                word = newWord8.replaceAll(" ", "");
            }

        }
         return word;
    }



     public static int padCode ( String word) {

        String x =  getCode(removeAdjacentDuplicates((removeLetters(word))));
        int y;
        try {
        y = Integer.parseInt(x);
        }
        catch (NumberFormatException e) {
             y = 0;
}
        if ( y / 10 == 0) {
            y = y * 100;
        }

        else if ( y / 100 == 0) {
            y = y * 10;  
        }

        else if ( y / 100 > 0 && y / 100 <= 9) {
            y = y;
        }

        else {
            y = y / 10;
        }

   return y;
     }


     public static String getSoundex( String word) {
        
        String firstIndex = word.toUpperCase().substring(0,1);
        word = firstIndex + padCode(word);
        return word;
     }
    
     } 


 






    



  

   
    

