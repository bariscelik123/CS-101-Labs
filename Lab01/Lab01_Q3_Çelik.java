package Lab01;

public class Lab01_Q3_Çelik {
    public static void main(String[] args) {
        //Constants and variables
        int y;
        int x;
        x = -5;

        //Calculation
        y = (int) (( Math.pow(x, 3) +  3 * Math.abs(x) + 9) / Math.pow(x, 2));

        System.out.println ( "The result of expression : " + y);


    }
    
}
