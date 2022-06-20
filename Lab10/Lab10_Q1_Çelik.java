package Lab10;


import java.util.Arrays;
import java.util.Scanner;
public class Lab10_Q1_Çelik {


    public static void main(String[] args) {

               
        Scanner s = new Scanner (System.in);
        System.out.print("Enter the number of elements: ");
        int n = s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter elements:");

        for(int i = 0; i < n ; i++) {
           arr[i] = s.nextInt();
        }

        System.out.println(makeAdjacent(arr));
        
    }  

    public static String makeAdjacent(int[] arr) {

        for (int i = 0; i < arr.length - 2; i ++) {         
            
            if (arr[i] == 5 && arr[i + 1] == 4) {

                arr[i] = 4;
                arr[i + 1] = 5;
            }
   
           
             if (arr[i] == 4) {
                arr[i + 1] = 5;
            }

            if (arr[arr.length-1] == 5 && arr[arr.length-2] != 4 && arr[arr.length - 4] == 9){
                arr[arr.length-1] = 9;
            }

                
        }
        String intString = Arrays.toString(arr);
        return intString;
    }
}


