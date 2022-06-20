package Lab05;
import java.util.Scanner;
public class Lab05_Q2_Çelik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mountain width:");
        int width = sc.nextInt();  
        int x = width;  
        int y = width;
        
        
    
        if ( width % 2 == 1) {
    
         for (int i = width; i >= 1; i = i - 2) {
    
            for (int j = 1; j <= i; j++) {                //Spaces at the beggining of the lines
                System.out.print(" ");
            }
            for (int j = i; j <= x; j++) {
                System.out.print(j+" ");
            }
    
            for (int j= x - 1 ; j >= i; j--) {
                System.out.print(j+" ");
                
            }
               
            System.out.println();
                      x--;
    }
}
      else {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter mountain width: ");
        int newWidth = in.nextInt();
      
    }   

    
        
        

    

        }
    }

