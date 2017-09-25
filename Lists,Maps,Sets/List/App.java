package List;

import java.text.DecimalFormat;
import java.util.*;
public class App {

//	Circles circle = new Circles();
	
		public static void main(String [] args){
		List<Circles> circleList = new ArrayList<>();
		double random;
		DecimalFormat df = new DecimalFormat("##.##");
		while((random = Math.random()) > 0.05){
			circleList.add(new Circles((3 + (int)(Math.random() * (9-3)+ 1))));
		}
		
		
		for(Circles circle: circleList){
			double f = circle.getArea();
			System.out.println("Radius: "+ circle.getRadius());
			System.out.println("Area: " + df.format(f));
		
		}
		
		
	}
}
