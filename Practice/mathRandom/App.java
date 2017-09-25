package mathRandom;

public class App {

	public static void main(String [] args){
//		Math.random() * ( Max - Min ) returns a value between the range [0, MAX - MIN), where max-min is not included
//		min + (math.random() * (Max - Min))	[min, Max]
		System.out.println(5 + (int)(Math.random() * (10 - 5))); //range is from [5, 10), 10 is not included
		System.out.println(5 + (int)(Math.random() * (10 - 5)));
		System.out.println(5 + (int)(Math.random() * (10 - 5)));
		
		//in order to get [Min, Max] or [5,10], you must add 1 to the Max-Min, and adding (int) truncates the decimal
		System.out.println(5 + (int)(Math.random() * (10 - 5) + 1));
		System.out.println(5 + (int)(Math.random() * (10 - 5) + 1));
		System.out.println(5 + (int)(Math.random() * (10 - 5) + 1));
	}
}
