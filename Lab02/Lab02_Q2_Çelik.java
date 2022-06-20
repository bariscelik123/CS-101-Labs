package Lab02;

import java.util.Scanner;
public class Lab02_Q2_Çelik {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in);
        System.out.print( "Enter phone number: ");
        String phoneNumber = in.nextLine();

        //Country Code
        String realNumber = phoneNumber.trim();
        int paranthesis = realNumber.indexOf( ")");
        String countryCode = realNumber.substring(1, paranthesis);
        String realCountryCode = countryCode.trim();

        //City Code
        int dash = realNumber.indexOf( "-");
        String cityCode = realNumber.substring(paranthesis + 1, dash);
        String realCityCode = cityCode.trim();

        //Phone Number
        int length = realNumber.length();
        int secondDash = realNumber.indexOf("-", dash + 1);
        String restOfNumber1 = realNumber.substring(dash + 1, secondDash );
        String realRestofNumber1 = restOfNumber1.trim();
        String restOfNumber2 = realNumber.substring(secondDash + 1, length);
        String realRestofNumber2 = restOfNumber2.trim();
        String realRestofNumber = realRestofNumber1 + " - " + realRestofNumber2;

        System.out.println( "Country code: " + realCountryCode);
        System.out.println( "City code: " + realCityCode);
        System.out.println( "Phone number: " + realRestofNumber); 

        
        in.close();
    }
    
}
