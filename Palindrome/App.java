package reverse;


public class App {

	public static void main(String args[]){

		//NOTE -- not sure if uppercase matters when determining a palindrome, sorry!
		String string1;
		String string2;
		
		string1 = "Cesar";
		string2 = reverseString("Cesar");
		System.out.println(string1);
		System.out.println(string2);
		palindrome(string1, string2);
		
		string1 = "noon";
		string2 = reverseString("noon");
		System.out.println(string1);
		System.out.println(string2);
		palindrome(string1, string2);
	
		string1 = "Step on no pets";
		string2 = reverseString("Step on no pets");
		System.out.println(string1);
		System.out.println(string2);
		palindrome(string1, string2);
		

	}
	public static boolean palindrome(String str1, String str2 ){
		String lowerCase1 = str1.toLowerCase();
		String lowerCase2= str2.toLowerCase();
		int size = str1.length();
		boolean result = false;
		for(int i = 0; i < str1.length(); i++){
			char check1 = lowerCase1.charAt(i);
			char check2 = lowerCase2.charAt(i);
			if(!(check1 == check2)){
				System.out.println("Not a Palindrome");
				return false;
				
			} else {
				System.out.println("Palindrome!!");
				result = true;
				break;
			}
		}
		return result;
	}

	public static String reverseString(String str){
		int stackSize = str.length();
		Stack stringStack = new Stack(stackSize);
		for(int i = 0; i< str.length(); i++){
			char ch = str.charAt(i); //extracts the character at the index position i
			stringStack.push(ch);
		}
		String result = "";
		while(!stringStack.isEmpty()){
			char ch = stringStack.pop();
			result += ch;
		}
		return result;
		
	}
}
