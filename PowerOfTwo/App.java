package PowerOfTwo;

public class App {

	public static void main(String args[]){
		
		System.out.println(powerOfTwo(1));
		System.out.println(powerOfTwo(3));
		System.out.println(powerOfTwo(4));
		System.out.println(powerOfTwo(16));
		System.out.println(powerOfTwo(65));
		System.out.println(powerOfTwo(8192));
		System.out.println(powerOfTwo(32766));
		System.out.println(powerOfTwo(48));
		System.out.println(powerOfTwo(278));
	}
	
	
	
	public static boolean powerOfTwo(int num){
		boolean result = false;
		if(num == 0){
			result = false;
		}
		while(num != 1){
			{
				if(num % 2 != 0)
					return false;
				num = num/2;
			}
			result = true;
		}
		return result;
		
	}
}
