package Lab05;

import java.util.Scanner;
public class Lab05_Q1_Çelik {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        System.out.println("Menu:");
        System.out.println("    1-Special Number");
        System.out.println("    2-Vowel Word");
        System.out.println("    3-Quit");
        System.out.print("Enter choice:");
        String choice = in.nextLine();

        if (choice.equals("1")) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number:");
            int number = input.nextInt();
            
            

            if ((int) (Math.log10(number) + 1) != 4) {
            Scanner numinput = new Scanner(System.in);
            System.out.print("Enter number:");
            int x = numinput.nextInt();
            x = number;
        
        }
        else {
            int number4 = number % 10;
            int newnumber = number / 10; 
            int number3 = newnumber % 10;
            int newnumber1 = newnumber / 10;
            int number2 = newnumber1 % 10;
            int newnumber2 = newnumber1 / 10;
            int number1 = newnumber2 % 10;

            int no = number4 * 1000 + number3 * 100 + number2 * 10 + number1;
            
            if (no == 4 * number) {
                System.out.println(number + " is a very special number.");           
            }
            else {
                System.out.println(number + " is not a very special number.");
            }
            
        }

    }

        else if (choice.equals("2")) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter word:");
            String word = scan.nextLine();
            String caseWord = word.toLowerCase();
            int length = caseWord.length();

            for (int i = 0; i < length; i++) {
                if ( caseWord.substring(i, i+1).equals("a")) {

                    for (int j = 0; j < length; j++) {
                        if ( caseWord.substring(j, j+1).equals("e")) {

                            for (int k = 0; k < length; k++) {
                                if ( caseWord.substring(k, k+1).equals("i")) {

                                    for (int t = 0; t < length; t++) {
                                        if ( caseWord.substring(t, t+1).equals("o")) {

                                            for (int p = 0; p < length; p++) {
                                                if ( caseWord.substring(p, p+1).equals("u")) {
                                                    System.out.println(word + " is a vowel word. ");
                                                }

                                               
                                                }

                                        }
                                    }
                                }
                            }
                        }

                    }
                  
                    
                } 
            }
            
            
        }

        else if (choice.equals("3")) {
            System.out.println("Goodbye!");
        }

        else if (!choice.equals("1")||!choice.equals("2")||!choice.equals("3")) {
            System.out.println("Choice must be between 1 and 3!");
        }

    }
}


