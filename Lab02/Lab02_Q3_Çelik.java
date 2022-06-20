package Lab02;

import java.util.Scanner;
public class Lab02_Q3_Çelik {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in);
        System.out.print( "Enter your weight(kg): " );
        double weight = in.nextDouble();
        System.out.print( "Enter your height(cm): " );
        double height = in.nextDouble();
        System.out.print( "Enter your age(years): " );
        double age = in.nextDouble();

        double bmr = 10 * weight + 6.25 * height - 5 * age - 161;
        double pal = 1.4;
        double calories = bmr * pal;
        double carbPercentage = 45;
        double proPercentage = 25;
        double fatPercentage = 30;
        double fatCalories = 9;
        double proCalories = 4;
        double carbCalories = 4;

        double proGram = (calories * proPercentage / 100) / proCalories;
        double carbGram = (calories * carbPercentage / 100) / carbCalories;
        double fatGram = ( calories * fatPercentage / 100) / fatCalories;

        System.out.printf("%s%20.2f%n","Calories Required:",calories);
        System.out.printf("%18s%20.2f%n","GRAMS PROTEIN:",proGram);
        System.out.printf("%18s%20.2f%n","GRAMS FAT:",fatGram);
        System.out.printf("%18s%20.2f%n","GRAMS CARBS:",carbGram);

        in.close();
        
        

        

    }

    
}
