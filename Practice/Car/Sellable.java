package Car;

public interface Sellable {
	public double getFinalCost();
	
	public static double cheapest(Sellable [] items){
		
		if(items == null){
			return -1;
		}
		//create empty instance
		Sellable lowestCost = null;
		//this value allows us to place the first value in the array as the lowest
		//then we can iterate through the array and compare each value.
		double lowest = Double.MAX_VALUE;
		for(Sellable s: items){
			//variable to hold finalCost
			
			double cost = s.getFinalCost();
			if(cost < lowest){ 
				lowestCost = s;
				lowest = cost;
			}
		}
		return lowest;
	}
	
	public static double totalCost(Sellable [] items){
//		if(items == null){
//			return -1;
//		}
		
		double total = 0;
		for(Sellable s: items){
			total += s.getFinalCost();
		}
		return total;
	}
}
