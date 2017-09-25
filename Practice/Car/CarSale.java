package Car;

public class CarSale implements Sellable {
	private String model;
	private double listPrice;
	private double discount;
	private double finalCost;
	
	CarSale(String model, double listPrice, double discount)
	{
		this.model = model;
		this.listPrice = listPrice;
		this.discount = discount;
	}
	
	public String getModel() {
		return model;
	}
	public double getListPrice() {
		return listPrice;
	}
	public double getDiscount() {
		return discount;
	}
	@Override
	public double getFinalCost() {
		finalCost = listPrice *(1 - discount/100);
//		finalCost = (listPrice - (discount * listPrice));
		return finalCost;
	}
	@Override
	public String toString() {
		return "CarSale [model=" + model + ", listPrice=" + listPrice + ", discount=" + discount + ", finalCost="
				+ this.getFinalCost() + "]";
	}
	

	
}
