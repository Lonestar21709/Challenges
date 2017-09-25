package Car;

public class PaperclipSale implements Sellable{
	private String color;
	private double boxPrice;
	private int boxesSold;
	
	public PaperclipSale(String color, double boxPrice, int boxesSold) {
		super();
		this.color = color;
		this.boxPrice = boxPrice;
		this.boxesSold = boxesSold;
	}
	
	public String getColor() {
		return color;
	}

	public double getBoxPrice() {
		return boxPrice;
	}

	public int getBoxesSold() {
		return boxesSold;
	}

	@Override
	public double getFinalCost() {
		// TODO Auto-generated method stub
		return boxesSold * boxPrice;
	}

	@Override
	public String toString() {
		return "PaperclipSale [color: " + color + ", boxPrice: " + boxPrice + ", boxesSold: " + boxesSold + ", Final Cost: " + this.getFinalCost() + "]";
	}
	
}
