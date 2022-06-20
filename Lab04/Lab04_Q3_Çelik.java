package Lab04;

import java.util.Scanner;
public class Lab04_Q3_Çelik {
    

    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in);
        System.out.print("Input a binary number: ");
        long binaryNumber = in.nextLong();

        long decimalNumber = 0;
        long j = 1;
        long remainder;
        long newNum = binaryNumber;


        //converting to binary
        while (binaryNumber != 0) 
        {
         remainder = binaryNumber % 10;
         decimalNumber = decimalNumber + remainder * j;
         j = j * 2;                                  //We are taking the power of 2 so j*2
         binaryNumber = binaryNumber / 10;  
        }

        //converting to hexadecimal
        long num = decimalNumber;
        String hex =Long.toHexString(num);
                

        System.out.printf("%10s%10s%15s%n","Binary","Decimal","Hexadecimal");
        System.out.printf("%10d%10d%15s",newNum,decimalNumber,hex);
        
     in.close();   
    }
    
    
}
