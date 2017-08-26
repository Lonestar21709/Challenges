package TestStack;
import java.util.*;
public class StackTest {


	   public static void main(String args[]) {
	      Stack stack = new Stack();
	      String test = "noon";
	      stack.push(test);
	      System.out.println("Stack: " + stack);
	      
	      int stackSize = test.length();
	      
	      Stack reverse = new Stack();
	      for(int i = 0; i < stackSize; i++){
	    	  char ch = test.charAt(i);
	    	  reverse.push(ch);
	      }
	      System.out.println("Reverse Stack: " + reverse);
	      
	      String result = "";
	      
	      for(int x = 0; x < stackSize; x++){
	    	  result += reverse.pop();
	      }
	      System.out.println(result);
	      
	      // place this code into a boolean function
	      int counter = 0;
	      boolean palindrome = false;
	      for(int i = 0; i < stackSize; i++){
	    	  char ch1 = test.charAt(i);
	    	  char ch2 = result.charAt(i);
	    	  if(ch1 != ch2){
//	    		  System.out.println("Not a Palindrome"); 
	    		  palindrome = false;
	    	  }
	    	  else {
	    		  palindrome = true;
	    	  }
//	    	  counter++;
//	    	  System.out.println(counter + "  " +  stackSize);
//	    	  if(counter == stackSize - 1){
//	    		  System.out.println("Palindrome Achieved");
//	    	  }
	      }
	      System.out.println(palindrome);
	      
	   }
}
