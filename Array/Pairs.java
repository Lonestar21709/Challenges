//First attempt - Rough Draft
public class Pairs {
	//Given an unsorted array of integers, find a pair with given sum to it
	public static void main(String args[]){
		int array [] = {5, 2, 3, 1};
		int sum = 8;
/*		int counter = 1;*/
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j <  array.length; j++){
				if(i == j){
					break;
				}
//				counter++;
				if(array[i] + array[j] == sum)
				{
//					System.out.println(counter);
					System.out.println("Pair found at index " + i + " and " + j + " ( " + array[i] + " + " + array[j] + " )");	
				}
			}
		}
		
	}
}



public class Pairs {
	//Given an unsorted array of integers, find a pair with given sum to it
	public static void main(String args[]){
		int array [] = {5, 2, 3, 1};
		int sum = 8;
		findPair(array, sum);
		
	}


public static void findPair(int array [], int sum){
/*		int counter = 1;*/
		int length = array.length;
		for(int i = 0; i < length - 1; i++){
			for(int j = i + 1; j < length; j++){
//				if(i == j){
//					break;
//				}
	//			counter++;
				if(array[i] + array[j] == sum)
				{
	//				System.out.println(counter);
					System.out.println("Pair found at index " + i + " and " + j + " ( " + array[i] + " + " + array[j] + " )");	
					return;
				}
			}
		}
		//no pair found
		System.out.println("No pair found");
	}
}