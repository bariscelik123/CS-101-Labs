package Lab01;

public class Lab01_Q2_Çelik {
    public static void main(String[] args) {
        //Constants and variables
        int total = 12486;
        int seconds;
        int minutes;
        int hours;

        //Calculations
        hours = total / 3600;                   //1 hour == 3600 seconds
        minutes = (total - hours * 3600) / 60;
        seconds = (total - hours * 3600 - minutes * 60);

        //Writing the result
        System.out.println ( total + " seconds represents " + hours + " hours "
         + minutes + " minutes and " + seconds + " seconds.");
    }
    
}
