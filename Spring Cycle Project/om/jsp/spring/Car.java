package om.jsp.spring;

public class Car {
	private String brand;
	private String cost;
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", cost=" + cost + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}

	//public void init()
	public void haii()
	{
		System.out.println("Data initialized");
	}
	public void bye()
	//public void destroy()
	{
		System.out.println("Data destroyed");
	}

}
