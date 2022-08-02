package com.jordan.code;

import java.util.Arrays;

public class Thermometer {
	
	private int degreesF;
	private int degreesC;
	private String name;
	
	private static int[] tempReadings = new int[3]; //integer array with a specified length of 3
	
	Thermometer() { //no args constructor?
	}
	
	private Thermometer(int degreesF, int degreesC, String name, int[]tempReadings) { // all arg constructor
		this.degreesF = degreesF;
		this.degreesC = degreesC;
		this.name = name;
		this.tempReadings = tempReadings;
				
	}
	
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

	@Override
	public String toString() {
		return "Thermometer [degreesF=" + degreesF + ", degreesC=" + degreesC + ", name=" + name + ", tempReadings="
				+ Arrays.toString(tempReadings) + "]";
	}

	public static int convertToFahrenheit(int c) { //c represents celsius 
		return (int) (c*(9.0/5.0) + 32); //(int) casts the return value as an integer from the method, then formula for convert
	}
	
	public static int convertToCelsius(int f) {
		return (int) ((f - 32)*5)/9; //int casts again and formula for convert
	}
	
	public static void calculateAvgTemp(int[] temps) {
		int i, total;
		int n = 3;
		total = 0;
		
		for (i = 0; i < n; i++) {
			total += tempReadings[i];
		
			
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
