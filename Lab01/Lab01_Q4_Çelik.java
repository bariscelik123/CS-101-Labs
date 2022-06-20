package Lab01;

public class Lab01_Q4_Çelik {
    public static void main(String[] args) {
        
        //Constants and variables
        double goldenRatio = (1 + Math.sqrt(5)) / 2;
        int n6;
        int n10;
        int n100;
        int n101;

        //assigning 6 to n
        n6 = 6;
        double result6 = (Math.pow(goldenRatio, n6) - Math.pow( -1 / goldenRatio, n6)) / Math.sqrt(5);
        System.out.println( "Fibonacci(" + n6 + ") is " + result6);

        //assigning 10 to n
        n10 = 10;
        double result10 = (Math.pow(goldenRatio, n10) - Math.pow( -1 / goldenRatio, n10)) / Math.sqrt(5);
        System.out.println( "Fibonacci(" + n10 + ") is " + result10);

        //assigning 100 to n
        n100 = 100;
        double result100 = (Math.pow(goldenRatio, n100) - Math.pow( -1 / goldenRatio, n100)) / Math.sqrt(5);
        System.out.println( "Fibonacci(" + n100 + ") is " + result100);

        //assigning 101 to n
        n101 = 101;
        double result101 = (Math.pow(goldenRatio, n101) - Math.pow( -1 / goldenRatio, n101)) / Math.sqrt(5);
        System.out.println( "Fibonacci(" + n101 + ") is " + result101);

        
        }
    
}
