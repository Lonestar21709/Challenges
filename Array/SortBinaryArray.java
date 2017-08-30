import java.util.Arrays;
public class SortBinaryArray {
	public static void main(String args[]){
		//given an binary array, sort it in linear time and constant space. Output should print contain all zeros followed by ones
		int array [] = {1, 0, 1, 0, 0, 1, 1, 0, 1};
		int numbers [] = {3, 5, 1, 6, 2, 3, 9, 21, 30};
		int zero = 0;
		
		sortZero(array, zero);
		//modify solution so that all 1's would come first
		sortOne(array, zero);
		//rearrange even and odd numbers in linear time such that all even numbers comes before all odd numbers 
		sortNum(numbers);
	}
	public static void sortNum(int A []){
		//create a new array[A.length]
		int [] array = new int[A.length]; 
		//int front = 0, end = A.length - 1; 
		int front = 0;
		int end = A.length - 1;
		//iterate through array
		for(int i = 0; i < A.length; i++){
			//check if number is even 
			if(A[i]%2 == 0){
				array[front++] = A[i];
			}
			else{ //number is odd
				array[end--] = A[i];
			}
		}
		for(int x = 0; x < array.length; x++){
			System.out.print(array[x] + " ");
		}
			
	}
	public static void sortOne(int array [], int one){
		for(int i = 0; i < array.length; i++){
			if(array[i] == 1){
				one++;
			}
		}
		int counter = 0;
		while(one-- != 0){
			array[counter++] = 1;
		}
		while(counter < array.length){
			array[counter++] = 0;
		}
		for(int x = 0; x< array.length; x++){
			System.out.print(array[x] + " ");
		}
		System.out.println(" ");

	}
	public static void sortZero(int array [], int zero){
		for(int i = 0; i < array.length; i++){
			if(array[i] == 0){
				zero++;
			}
			
		}
		int counter = 0;
		while(zero-- != 0){
			array[counter++] = 0;
		}
		while(counter < array.length){
			array[counter++] = 1;
		}
		for(int x = 0; x< array.length; x++){
			System.out.print(array[x] + " ");
		}
		System.out.println(" ");
	}
}
