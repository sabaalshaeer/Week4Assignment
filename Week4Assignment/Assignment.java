package Week4Assignment;

import java.util.Arrays;


public class Assignment {

	public static void main(String[] args) {
		
		//1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3,9,23,64,2,8,28,93};
		
		//a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array 
		//(i.e. do not use ages[7] in your code). Print the result to the console.  
		
		// Subtract the value of the first element from the last element
		int subFirstelementFromLastElement = ages[ages.length -1] - ages[0];
		System.out.println("Result of Subtraction is: " +subFirstelementFromLastElement);
		
		//b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		// Add a new age to the array
		
        int newAge = 50;
        //creating a new array with a larger size  by using(ages.length + 1) 
        int[] newAges = new int[ages.length + 1];
        for (int i = 0; i < ages.length; i++) {
        	//copying all the elements from ages to newAges
            newAges[i] = ages[i];
        }
        //set the last element of newAges to the new age (newAge). 
        newAges[newAges.length - 1] = newAge;
        
        for(int ele: newAges) {
        	System.out.println(ele);
        }
        
        // Subtract the value of the first element from the last element again
        int newSubtractionResult = newAges[newAges.length - 1] - newAges[0];
        System.out.println("New of Subtraction is: " + newSubtractionResult);
        
        //c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
        // Calculate the average age
        int sum = 0;
        for (int age : newAges) {
            sum += age;
        }
        double average = (double) sum / newAges.length;
        System.out.println("Average Age is: " + average);
        
        System.out.println("......................................");
        
        //2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck","Bob"};
        
        //a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
        int sumNumOfLetters =0;
        for(String name: names) {
        	//add the length of each name to the sumNumOfLetters variable
        	sumNumOfLetters += name.length();
        }
        //divide the total sum by (names.length) to get the average number of letters per name. 
        double averageNumOfLetter = (double)sumNumOfLetters / names.length;
        System.out.println("Avg number of letters per name: "+ averageNumOfLetter);
        
        
        //b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
        StringBuilder sb = new StringBuilder();
        
        for(int i =0; i < names.length; i++) {
        	sb.append(names[i]);
        	if( i != names.length -1) {
        		sb.append(" ");
        		}
        	}
        	System.out.println(sb.toString());
        	
            System.out.println("......................................");
            //3.	How do you access the last element of any array? By Using the index array.length - 1. 
            int lastElement =newAges[newAges.length -1];
            System.out.println(lastElement);
//            for(Integer age: newAges) {
//            	System.out.println(age);
//            }
            System.out.println("......................................");

            //4.	How do you access the first element of any array? buy using  the index 0 which represents the first element of the array
            int firstElement =newAges[0];
            System.out.println(firstElement);
            System.out.println("......................................");

            //5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously 
            //created names array and add the length of each name to the nameLengths array.
            
            //declare a new array of integers called nameLengths with the same length as the names array.
            int[] nameLengths = new int[names.length];
            //iterate over the names array
            for (int i = 0; i < names.length; i++) {
            	//then assign the length of each name to corresponding index in the nameLengths array
                nameLengths[i] = names[i].length();
            }
            // Print the nameLengths array
            for (int length : nameLengths) {
                System.out.println(length);
            }
            System.out.println("......................................");

            //6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console
            int sumOfLength = 0;
            for(int length : nameLengths) {
            	sumOfLength += length;
            }
            System.out.println(sumOfLength);
            System.out.println("......................................");

            //7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
            //(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
            System.out.println(concatenateWordsNTime("Hello", 3));
            System.out.println("Q7.....................................");

            //8.	Write a method that takes two Strings, firstName and lastName, and returns a full name 
            //(the full name should be the first and the last name as a String separated by a space).
            System.out.println(getFullName("Saba", "Alshaeer"));
            System.out.println("......................................");
            
            //9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
            int[] numbers = {4,6,9,34,67};
            System.out.println(returnIfsumOfIntGreaterThan(numbers));
            System.out.println("......................................");
            
            //10.	Write a method that takes an array of double and returns the average of all the elements in the array.
            double[] arryOfNumbers = {3.5, 4.8, 2.2, 6.6, 8.1};
            double avgOfElements = calculateAverage(arryOfNumbers);
            System.out.println("Average of elements in arr : " + avgOfElements);
            System.out.println("Q10.....................................");

            
            //11.	Write a method that takes two arrays of double and returns true if the average of the elements in 
            //the first array is greater than the average of the elements in the second array.
            double[] arryOfNumbers2 = {1.5, 1.8, 1.2, 1.6, 1.1};
            boolean avgOfElements2 = compareAvgOftwoArrays(arryOfNumbers, arryOfNumbers2);
            System.out.println(avgOfElements2);
            System.out.println("......................................");
            
            //12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
            //and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
            System.out.println(willBuyDrink(false, 11.0));
            System.out.println("Q12..................................");
            
            //13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
            /*
             * findMaxValue method.I chose this method because it is a common task to find a max value in array also used in various scenarios 
             * such as finding the highest score in a list of student scores.
             * 
             * the method takes an array of int and return maximum value in the array
             */
            int[] arrayNums = {5, 9, 3, 12, 7};
			int maxNum = findMaxValue(arrayNums);
			System.out.println("The maximum value is: " + maxNum);
			
            
	}
	
	//method for Q7:
	public static String concatenateWordsNTime(String word, int n) {
		String conString = "";
		for(int i =0;i<n; i++) {
			conString += word;
		}
		return conString;
	}
	//method for Q8:
		public static String getFullName(String firstName, String lastName) {
			return firstName+ " "+ lastName;
		}	
		
	//method for Q9:
			public static boolean returnIfsumOfIntGreaterThan(int[] arr) {
				int sum =0;
				for(int i =0; i < arr.length; i++) {
					sum += arr[i];
					if(sum > 100) {
						return true;
					}
				}
				return false;
			}	
		//method for Q10:
		public static double calculateAverage(double[] arr) {
			double sum =0;
			for(int i =0; i < arr.length; i++) {
				sum += arr[i];
				}
			return sum /arr.length;
			
		}	
		//method for Q11:
		public static boolean compareAvgOftwoArrays(double[] arr1, double[] arr2) {
//			double sum1 =0;
//			double sum2 =0;
//			for(int i =0; i < arr1.length; i++) {
//				sum1 += arr1[i];
//				}
//			double avarage1 = sum1 /arr1.length;
//			for(int j =0; j < arr2.length; j++) {
//				sum2 += arr2[j];
//				}
//			double avarage2 = sum2 /arr2.length;
//			
//			return avarage1 > avarage2;
			
			//short way, using calculateAverage() method
			 double average1 = calculateAverage(arr1);
			 double average2 = calculateAverage(arr2);
			 return average1 > average2;
		}	
			
		//method for Q12
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			return (isHotOutside && moneyInPocket > 10.50);
		}
		//method for Q13
		public static int findMaxValue(int[] arr) {
			int max = Integer.MIN_VALUE;
			for (int num : arr) {
				if (num > max) {
					max = num;
				}
			}
			return max;
		}

			
			






}
