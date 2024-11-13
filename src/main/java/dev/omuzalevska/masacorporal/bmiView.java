package dev.omuzalevska.masacorporal;

import java.util.Scanner;

public class bmiView {
    
    private Scanner scanner = new Scanner(System.in);

    public double askWeight(){
        System.out.println("Enter your weight, kg ");
        return scanner.nextDouble();
    }

    public double askHeight(){
        System.out.println("Enter your height, metros ");
        return scanner.nextDouble(); 
    }

public void showResults(double bmi, String clasification){
    System.out.printf("You BMI is: %.2f\n\n", bmi);
    System.out.println("You BMI is: " + clasification);
}

}
