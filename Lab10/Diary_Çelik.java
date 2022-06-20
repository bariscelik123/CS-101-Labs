package Lab10;

import java.util.Scanner;

public class Diary_Çelik {
    private static String note;

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of pages:");
        int page = in.nextInt();
        System.out.print("Enter page size:");
        int size = in.nextInt();

        String arr[]=new String[size];
       
        for ( int i = 0; i < size; i++){
            arr[i] = in.nextLine();
        }
       

        
        Notebook_Çelik x = new Notebook_Çelik(page, size);

        

        for (int i = 0; i < page; i++) {
            
        System.out.println("What do you want to do?");
        System.out.println("(1) Take a note");
        System.out.println("(2) Browse notebook");
        System.out.println("(3) Exit");
        int choice = in.nextInt();

        

        if ( choice == 3) {

            System.out.println("Your choice: " + choice);
            System.out.println("Goodbye...");
            break;
        }

        if ( choice == 1) {

            System.out.println("Your choice: " + choice);
            System.out.println(x.writeNote(page, size));
        }

        if ( choice == 2) {
            System.out.println("Your choice " + choice);
           System.out.println(printNotebook(arr));
        }


        }

    }
  public static String printNotebook ( String[] arr){
      String x = arr.toString();
      return x;

  }  
    
}
