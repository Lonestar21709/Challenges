package ArraysLists;

import java.util.*;

public class App {
	
	public static void main(String [] args){
//		List<Integer> myList = new ArrayList<Integer>(); //Integer is a object class, have to use instead of primatives  
//		//you're telling java this list will contain only strings, and the second brackets infer that it is strings, don't have to fill it
		List<String> words = new ArrayList<>();
//		List<String> entries = new ArrayList<>();
//		List<String> words2 = Arrays.asList("hi", "hello", "hola");
//		double d;
//		while((d = Math.random()) > 0.1) {
//			entries.add("Value: " + d);
//		}
//		for(String entry: entries) {
//			System.out.println(entry);
//		}
//		List<String> names = new ArrayList<>();
		words.add("Cesar");
		words.add("Kelsie");
//		myList.add(5);
//		myList.add(21);
//		for(int i = 0; i < words.size(); i++){
//			System.out.println(words.get(i) + " " + myList.get(i));
//		}
		words.remove("Cesar");
		words.add("Hello");
		words.add("Hey");
		words.add("Here");
		words.sort((word1,word2) -> word1.length()-word2.length()); //sorts based on comparison
		words.replaceAll(word -> word.toUpperCase() + "!!");
		words.removeIf(word -> word.contains("Y"));
		words.forEach(word -> System.out.println(word)); //does the specified operation on each element
		String [] wordArray = words.toArray(new String[0]); //build a blah array from a list of blah
//		for(String word: words){
//			System.out.println(word);
//		}
		for(String word: wordArray){
			System.out.println(word);
		}
//		//pass each element of the list to println
//		words.forEach(System.out::println); //System.out::println is a method reference
//		
//		System.out.println(words);
		
		List<Integer> nums = new ArrayList<>();
		int[] values = { 2, 4, 6, 15, 9 };
		//add array into List, java takes care of converting 
		for(int value: values) {
			nums.add(value);
		}
		System.out.println(nums.size());
		nums.remove(2); //by index
		nums.remove("15");
		nums.removeAll(nums);
		for(Integer vals: nums){
			System.out.println(vals);
		}
		
		
		
		
	}
}
