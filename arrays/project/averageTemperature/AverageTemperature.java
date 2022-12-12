package arrays.project.averageTemperature;

import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number of days : ");
        int numDays = console.nextInt();
        int[] daysTemperature = new int[numDays];
        int sumTemp = 0; 
        for(int i = 0; i < numDays; i++){
            System.out.print("Day " + i + "'s high temperature : ");
            int dayTemperature = console.nextInt();
            daysTemperature[i] = dayTemperature;
            sumTemp += dayTemperature;
        }

        double averageTemp = sumTemp/numDays;
        int sumDays = 0;
        for (int i : daysTemperature) {
            if(i > averageTemp){
                sumDays += 1;
            }
        }

        System.out.println("The average temperature is : " + averageTemp);
        System.out.println(sumDays + "'s above average");
        console.close();
    }
}
