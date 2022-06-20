package Lab07;

import java.time.LocalDate;
import java.time.Period;
public class FitnessAssesment {
    private static int targetHeartRate;
    private static double maxHeartRate;
    private static double age;
    private String date;
    private String gender;
    private double height;
    private double weight;
    private double hip;
    private double waist;
    private double heartRate;

   

    public FitnessAssesment( String gender,String gender2, double height, double weight, double hip,
    double waist, double heartRate) {
        this.date = date;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.hip = hip;
        this.waist = waist;
        this.heartRate = heartRate;

    }

    public String getdate() {
        return this.date;
    }

    public String getgender() {
        return this.gender;
    }

    public double getheight() {
        return this.height;
    }

    public double getweight() {
        return this.weight;
    }

    public double gethip() {
        return this.hip;
    }

    public double getwaist() {
        return this.waist;
    }

    public double getheartRate() {
        return this.heartRate;
    }


    public void setdate( String date) {
        this.date = date;

    }

    public void setgender( String gender) {
        this.gender = gender;

    }

    public void setheight( double height) {
        this.height = height;

    }

    public void setweight( double weight) {
        this.weight = weight;

    }

    public void sethip( double hip) {
        this.hip = hip;

    }

    public void setwaist( double waist) {
        this.waist = waist;

    }

    public void setheartRate( double heartRate) {
        this.heartRate = heartRate;

    }

    public static double calculateWaistHipRatio (double hip, double waist){
        double waistHipRatio = waist / hip;
        return waistHipRatio;
    }



    public static double calculateMaxHeartRate (int age) {
        double maxHeartRate = (220 - age) * 1.0;
        return maxHeartRate;
    }

    public static double calculateTargetHeartRate (double heartRate) {

        heartRate = maxHeartRate;
        double targetHeartRate = maxHeartRate * 85 / 100; 
        return targetHeartRate;
    }

    public static double calculateBMI (double weight, double height){
        double BMI = weight /(height * height);
        return BMI;
    }

    public static int calculateAge (String date) {
        String x = date.substring(0,4);
        int y = Integer.parseInt(x);
        int age = 2022 - y;
        return age;         
     }
 



    public static String findBMICategory ( double weight,double height) {
        String BMICategory;

        if (weight /(height * height) >= 30) {
            BMICategory = "Obese";
            
        }

        else if (weight /(height * height) >= 25 && weight /(height * height) < 30) {
            BMICategory = "Overweight";
        }

        else if (weight /(height * height) >= 20 && weight /(height * height) < 25) {
            BMICategory = "Normal";
        }

        else {
            BMICategory = "Underweight";
        }
        return BMICategory;
    }


    public static String determineFitnessLevel (double height, double weight,double waist,double hip){
        int count = 0;
        String fitnessLevel;

        if ( weight /(height * height) <= 24 || weight /(height * height) >= 20){
            count = count + 1;
        }

      
        if ( targetHeartRate < 70){
            count = count + 1;
        }

        if (waist/hip < 1){
            count = count + 1;
        }
        
        if ( count == 0) {
             fitnessLevel = "poor";
        }

        else if ( count == 1) {
             fitnessLevel = "average";
        }

        else if ( count == 2) {
            fitnessLevel = "good";
        }

        else{
            fitnessLevel = "excellent";
        }
        return fitnessLevel;
    }    
}