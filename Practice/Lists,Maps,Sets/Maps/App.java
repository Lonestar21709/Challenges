package Maps;

import java.util.HashMap;

import java.util.*;

public class App {

	public static void main(String [] args){
		
//		HashMap<String, String> employeeMap = new HashMap<>();
//		//put automatically assigns the first value as the key
//		employeeMap.put("a1234", "Steve Jobs");
//		employeeMap.put("a1235", "Scott McNealy");
//		employeeMap.put("a1236", "Jeff Bezos");
//		employeeMap.put("a1237", "Larry Ellison");
//		employeeMap.put("a1238", "Bill Gates");
//		employeeMap.put("b1239", "Cesar Gates");
//
//		String [] testIDs = {"A1235", "a1238", "a1234",
//            "b1234", "Q1234", "zz22b", "B1239" };
//		
//		System.out.println(employeeMap.keySet());
//		for(String id: testIDs){
////			String name = employeeMap.get(id);
//			String name = employeeMap.get(id.toLowerCase());
//			if(name != null){
//				System.out.printf("The id '%s' is for '%s'.%n", id, name);
//			}
//			else{
//				System.out.printf("No employee with id '%s'.%n", id);
//			}
//		}
				
		HashMap<Integer, String> numbers = new HashMap<>();
		numbers.put(1, "uno");
		numbers.put(2, "dos");
		numbers.put(3, "tres");
		numbers.put(4, "cuatro");
		numbers.put(5, "cinco");
		numbers.entrySet();
		Integer [] testNums = {1, 2, 2, 6, 5, 8, 7, 6};
		
		
		//Version One
//		for(HashMap.Entry <Integer, String> nums: numbers.entrySet()){
//			boolean success = false;
//			
//			for(int i = 0; i < testNums.length; i++){
//				if(nums.getKey() == testNums[i]){
//					success = true;
//					counter++;
//					System.out.println(counter);
//					System.out.printf("Id: '%s', which is for '%s' .%n", nums, testNums[i]);
//					break;
//				}
//				else{
//					success = false;
//				}
//			}
//			if(!success){
//				System.out.printf("No ID with that value '%s' .%n", nums);
//			}
//	
//		}
		
		//Version Two
		for(int i = 0; i < testNums.length; i++){
			boolean success = false;
			int counter = 0;
			for(HashMap.Entry <Integer, String> nums: numbers.entrySet()){
				counter++;
				if(nums.getKey() == testNums[i]){
					success = true;
					System.out.printf("Id: '%s', which is for '%s' .%n", nums, testNums[i]);
					break;
				}
				
				if(counter == numbers.size())
					System.out.println("No ID with that value");
				}	
			
//			if(!success){
//				System.out.printf("No ID with that value '%s' .%n", nums);
//			}
		}
		
	}
}
