package Lab10;

import java.util.Scanner;


public class Notebook_Çelik {

    private static int page;
    private static int size;
    
    

    public Notebook_Çelik( int page, int size, String note) {
        this.page = page;
        this.size = size;
       
    }

    public Notebook_Çelik(int page2, int size2) {
    }

    public int getpage(){
        return this.page;
    }

    public void setpage(int page) {
        this.page = page;
    }

    public int getsize(){
        return this.size;
    }

    public void setsize(int size) {
        this.size = size;
    }

  


    public static String writeNote (int page, int size) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Write the note:");
        String note = scanner.nextLine();
        
        if ( note.length() > 20){
            note = note.substring(0, size);
        }
        return note;
        
    }

   public static void printNotebook(){
      



   }

  

    
}
