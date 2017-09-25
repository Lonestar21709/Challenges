package List;

public class Circles {

	private double radius;
	
	public Circles(double rad){
		this.radius = rad;
	}
	@Override
	public String toString() {
		return "Circles [radius=" + radius + ", area=" + this.getArea() + "]";
	}
	public double getArea(){
		return Math.PI * (radius * radius);
	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
