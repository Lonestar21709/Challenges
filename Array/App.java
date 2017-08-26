package Array;

public class App {

	//Given two arrays, 1,2,3,4,5,8,10,21 and 2,3,1,0,21,4, 5 print which numbers are not present in the second array.
	public static void main(String args[]){

	int list1 [] = {1, 2, 3, 4, 5, 8, 10, 21};
	int list2 [] = {2, 3, 1, 0, 21, 4, 5 };
	int newArray [];
	for(int i = 0; i < list1.length; i++){
		boolean match = false;
		for(int j =0; i < list2.length; j++){
			if(list1[i] != list2[i]){
				match = true;
				break;
			}
		}
		int var = list1[i];
		if(!match){
			newArray.push(list1[i]);
		}
		}
	
	
}
}

