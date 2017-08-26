package Random;
import java.util.Random;

//Write a program which will display the largest 10 numbers in a file containing 10 billion random numbers.
//Also write a program to create the file (for testing purposes, use 1 million numbers.)

public class App {
	
	public static void main(String args[]){
		//Not sure how to do this one, specifically making the file, i would need more time to figure out the required methods 
		//to generate a file.
		Random generateNum = new Random();
		for(int i = 1; i <= 10; i++){
			int randomNum = generateNum.nextInt(10000);
		}
		//would store the numbers that are largest into a data structure, probably just an array.  Then I would have to 
		//create  a nest of loops, first ten numbers would fill the the array, then after that you're just looping through the array
		//on each number from the file.  Until it goes through all the numbers.  
		
	}
}
