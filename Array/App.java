package Array;

public class App {

	//Given two arrays, 1,2,3,4,5,8,10,21 and 2,3,1,0,21,4, 5 print which numbers are not present in the second array.
	public static void main(String args[]){
	
	int test1 [] = {1,2,3};
	int test2 [] = {2,3,5};
	int list1 [] = {1, 2, 3, 4, 5, 8, 10, 21};
	int list2 [] = {2, 3, 1, 0, 21, 4, 5 };
	
	//iterate through first array
	for(int i = 0; i < list1.length; i++){
		int j;
		//iterate through second array
		for(j =0; j < list2.length; j++){
			//if a value in first array equals a value in second array, end the search
			if(list1[i] == list2[j]){
				break;
				}
			
			}
			//if j equals the length of the second array, then the current value in the first array is not
			//present in the second array
			if(j == list2.length){
				System.out.println("Number not present: " + list1[i]);
			}
		}
}
}

