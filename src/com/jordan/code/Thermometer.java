package com.jordan.code;

import java.util.Arrays;

public class Thermometer {
	
	//class fields
	private int degreesF;
	private int degreesC;
	private String name;
	
	private static int[] tempReadings = new int[3]; //integer array with a specified length of 3
	
	//constructors
	//these two constructors have the method name but they have a different number....
	//this concept is known as method overloading
	//note: method overloading can also occur when there are different datatypes of parameters but the same number parameters
	public Thermometer() { //no args constructor?
		super(); //tells the JVM that this is an object and therefore is able..
		// to override the Object class's method like 
	}
	
	public Thermometer(int degreesF, int degreesC, String name, int[]tempReadings) { // all "arg" constructor
		this.degreesF = degreesF;
		this.degreesC = degreesC;
		this.name = name;
		this.tempReadings = tempReadings;
				
	}
	//right click go to source >>> Generate Getters and Setters
	//as we need access to our private class fields here from our Main Driver
	public int getDegreesF() { //setters and getters for each field 
		return degreesF;
	}
	public void setDegreesF(int deggreesF) {
		this.degreesF = degreesF;
	}

	public int getDegreesC() {
		return degreesC;
	}

	public void setDegreesC(int degreesC) {
		this.degreesC = degreesC;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getTempReadings() {
		return tempReadings;
	}

	public void setTempReadings(int[] tempReadings) {
		this.tempReadings = tempReadings;
	}

	//right click>>>source >>> Generate toString()
	//this annotation lets the JVM know that we are overriding the parent class implementation of this method... 
	//...(aka we are doing our own way to show the Thermometer class details, instead of using Objects class's implementation)
	//this is called method overriding, which is another form of encapsulation in Java
	@Override
	public String toString() {
		return "Thermometer [degreesF=" + degreesF + ", degreesC=" + degreesC + ", name=" + name + ", tempReadings="
				+ Arrays.toString(tempReadings) + "]";
	}

	//Custom method signatures
	public static int convertToFahrenheit(int c) { //c represents celsius 
		return (int) (c*(9.0/5.0) + 32); //(int) casts the return value as an integer from the method, then formula for convert
	}
	
	public static int convertToCelsius(int f) {
		return (int) ((f - 32)*5)/9; //int casts again and formula for convert
	}
	
	public static void calculateAvgTemp(int[] temps) {
		//need a counter for total temp numbers, starts at 0
		//iterate thru the array
		//for each temp, and it to the total counter
		//end of loop
		//return the total temps, divided by 3
		int i, total;
		int n = 3;
		total = 0;
		
		for (i = 0; i < n; i++) {
			total += tempReadings[i];
		
			
			//Azhya example code
			////cunter for total temp numbers, start at 0
			//int total = 0;
			////iterate thru the array
			//for(int i = 0; i < temps.length; i++) {
			//	//for each temp, add it to the total counter
				//total += temps[i];
			//}
			
		} //ran into a lot of trouble because the system out was included in the for loop causing it to print average for each value
		
		System.out.println("The average temperature is: " + total/3); 
		
	
		//int avetemps[] = new int[3];
	
		
		//int average = 0;
		//for(int i = 0; i < 3; i++) 
		//	average += (tempReadings[i]);
		//average = average / 3;
		
		//System.out.println("Average: " + average);
	}
}
