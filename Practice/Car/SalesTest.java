package Car;

public class SalesTest {
	
	
	public static void main(String []args){
		CarSale car = new CarSale("Chevy", 9999, 1.5);
//		System.out.println(car.getFinalCost());
//		System.out.println(car);
		
		PaperclipSale clip = new PaperclipSale("Red", 3.99, 50);
//		System.out.println(clip.getFinalCost());
//		System.out.println(clip);
		
		Sellable [] sellable = {
				new CarSale("Dodge", 19999, 5.5),
				new PaperclipSale("Multi-Color", 4.99, 500)
		};
		
		Sellable [] sellable2 = {};
//		for(Sellable s: sellable){
//			System.out.println(s);
//		}
		
		System.out.println(Sellable.cheapest(sellable));
		System.out.println(Sellable.totalCost(sellable));

	}
	
}
