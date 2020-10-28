package com.naidachang.week3;

public class Week3 {

	public static void main(String[] args) {
		
		// Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93. 
		// Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”. 

		int [] ages = new int [8];
		
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		
		System.out.println(ages[0] - ages[ages.length-1]);
		
		System.out.println(calculateAverage(ages));
		
		String[] names = new String [6];
		
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
	
		
		System.out.println(calculateLetterAverage(names));
			
		//Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		
		String firstName = "Naida";
		String lastName = "Chang";
		System.out.println(firstName + " " + lastName);
		
		boolean isHotOutside = true;
		double moneyInPocket = 25;
		
		double [] money = new double [4];
		money[0] = 5;
		money[1] = 10;
		money[2] = 15;
		money[3] = 20;
	
		System.out.println(calculateMoneyAverage(money));
		
	
		
		// Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100. 
		int [] num = new int [6];
		num[0] = 16;
		num[1] = 57;
		num[2] = 5;
		num[3] = 25;
		num[4] = 2;
		num[5] = 0;
		
		int total = num[0]+num[1]+num[2]+num[3]+num[4]+num[5];
		
		if(total > 100) {
			System.out.println("Is the array greater than 100?Yes it is!");
		}
		else {
			System.out.println("Is the array greater than 100? Unfortunately it's not.");
		
		}
		
		//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it. 
		// create a method to keep track of my bills versus the amount of money I have for bills

		double [] bills = new double [6];
		bills[0] = 160;
		bills[1] = 340;
		bills[2] = 57;
		bills[3] = 135;
		bills[4] = 472;
		bills[5] = 175;

		double sum = bills[0]+bills[1]+bills[2]+bills[3]+bills[4]+bills[5];

		if(sum < 1500) {
			System.out.println("Do I have enough to pay my bills?Yes I do!");
		}
		
		else {
			System.out.println("Do I have enough to pay my bills? Unfortunately I do not. Need to work more!");
		}
		// Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). 
		for (int i = 0; i<ages.length; i++){
			
		}
		
		// Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50. 
		if(isHotOutside == true && moneyInPocket >= 10.50) {
			System.out.println("Will Buy Drink!");
		} else {
			System.out.println("Can't buy a drink today");
			
		}
		// Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times.
		System.out.println(multiplyString("Hi",5));
		
		//b Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console. 
		for (String name : names) {
		System.out.print(name + " ");
		}
		
		int[] a = {2, 4, 6, 8};
		int[] b = {3, 5, 1,8,15,4};
		
		System.out.println('\n' + "Is the average of the elements in the first array greater than the average of the elements in the second array? " + equals(a, b));
	}	
			
		// Use a loop to iterate through the array and calculate the average age.
	public static int calculateAverage(int[] numbers){
		
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
			return sum/numbers.length;
							
		}
			
		// Use a loop to iterate through the array and calculate the average number of letters per name.

	public static double calculateLetterAverage(String [] letters) {
			
		double sum = 0;
		
		for(String letter : letters) {
			sum += letter.length();
		}
		return sum/letters.length;
		}
		
	
		// How do you access the last element of any array? 
		//// array[array.length -1]


		// How do you access the first element of any array? 
		//// array[0]

	// Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”). 
	
	public static String multiplyString(String str,int n) {
		
		String results ="";
		for(int i=0; i <n; i++) {
			results += str;
		}
		return results;
		}
		
		
		// Write a method that takes an array of double and returns the average of all the elements in the array. 
			
	public static double calculateMoneyAverage(double[] numbers) {
				
		double sum = 0;
			
		for (double number : numbers) {
			sum += number;
		}
		return sum/numbers.length;
	}	

		// Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array. 

	public static boolean equals(int[] a, int[] b) {
	    if (a.length > b.length)
	        return true;
	    for (int i = 0; i < a.length; i++)
	        if (a[i] != b[i])
	            return false;
	    return true;
	}

}


				


