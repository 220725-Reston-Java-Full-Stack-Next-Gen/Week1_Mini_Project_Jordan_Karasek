package com.jordan.code;

import java.util.Arrays;
import java.util.Scanner;

public class MainDriver {

	

	public static void main(String[] args) {
		
		//this is how java makes new objects
		Thermometer meter = new Thermometer();
		
		Scanner scantemp = new Scanner(System.in);
		System.out.print("Please give your Thermometer a name.");
		
		//scantemp.next(); just does string values, scantemp.nextln(); 
		String name = scantemp.next();
		meter.setName(name);
		System.out.println("Hello World, thanks for using " + meter.getName() + " today!");
		
		
		System.out.println("Enter a Fahrenheit value: ");
		int fah = scantemp.nextInt();
		scantemp.nextLine();
		meter.setDegreesF(fah);
		
		
		System.out.println("Enter a Celsius value: ");
		int cels = scantemp.nextInt();
		scantemp.nextLine();
		meter.setDegreesC(cels);

		//alternate option for calling Thermometer.convertToCelsius
		//int resultF = obj.convertToFahrenheit(cels);
		//int resultC = obj.convertToCelsius(fah);
		
		//use 
		System.out.println(fah + " Fahrenheit converted to Celsius is " + Thermometer.convertToCelsius(fah) + " degrees");
		System.out.println("and");
		System.out.println(cels + " Celsius converted to Fahrenheit is " + Thermometer.convertToFahrenheit(cels) + " degrees");
		
		System.out.println("Enter the last three days temperature in Fahrenheit or Celsius");
			int[] tempReadings = new int[3];
				for(int i = 0; i < 3; i++) {
					tempReadings[i] = scantemp.nextInt();
					
		}
			scantemp.close();
				
		meter.setTempReadings(tempReadings); //has to set the input values in Thermometer class
				
		Thermometer.calculateAvgTemp(meter.getTempReadings()); //call the average temp formula and prints out the result.
				
				
		System.out.println("Thanks for using this tool! Goodbye!");
		
		
		/*/
		 * int temp1 = in.nextInt();
		 * int temp2 = in.nextInt();
		 * int temp3 = in.nextInt();
		 * 
		 * int [] temps = {temp1, temp2, temp3};
		 * 
		 * meter.setTempReadings(temps);
		 * 
		 * meter.calculateAvgTemp(meter.getTempReadings());
		 * 
		 * 
		 */
		
		//[I@19dfb72a
		//Scanner scan = new Scanner(System.in);
		//System.out.print("Please enter a number: ");
		//int choice = scan.nextInt();
		
		//String color = chooseColor(choice);
		//car.setColor(color);
		//System.out.println("Result: " + car.getColor());
	

	}

}
