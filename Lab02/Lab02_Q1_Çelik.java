
package Lab02;

/**
 * Lab02_Q1_Çelik
 */
import java.util.Scanner;
public class Lab02_Q1_Çelik {
    public static void main(String[] args) {
        //Scanner
        Scanner in = new Scanner ( System.in);
        System.out.print( "Enter weight of first earthling (kg):");
        double worldWeight1 = in.nextDouble();
        System.out.print( "Enter weight of second earthling (kg):");
        double worldWeight2 = in.nextDouble();

        //Constants and variables
        double saturn = 1.06;
        double uranus = 0.92;
        double neptune = 1.19;
        double venus = 0.91;

        double saturnWeight1 = worldWeight1 * saturn; 
        double saturnWeight2 = worldWeight2 * saturn;
        double uranusWeight1 = worldWeight1 * uranus; 
        double uranusWeight2 = worldWeight2 * uranus;
        double neptuneWeight1 = worldWeight1 * neptune; 
        double neptuneWeight2 = worldWeight2 * neptune;
        double venusWeight1 = worldWeight1 * venus; 
        double venusWeight2 = worldWeight2 * venus; 

        System.out.printf( "%34s%15s%15s%15s%n","SATURN","URANUS","NEPTUNE","VENUS");
        System.out.printf( "%s%.1f%s%10.1f%15.1f%14.1f%17.1f%n","EARTHLING ONE( ",worldWeight1,"kg)",
        saturnWeight1,uranusWeight1,neptuneWeight1,venusWeight1);
        System.out.printf( "%s%.1f%s%10.1f%15.1f%14.1f%17.1f","EARTHLING TWO( ",worldWeight2,"kg)",
        saturnWeight2,uranusWeight2,neptuneWeight2,venusWeight2);

        in.close();
        
    }


    
}