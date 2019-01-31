/*
Stwórz klasę Car posiadającą następujące atrybuty:
brand
model
price
Stwórz metody dostępowe do ww. atrybutów tzw. gettery i settery.
Dopisz metodę toString zwracającą markę oraz cenę w jednej linii.
*/

package c_Metody;

public class Car {
	private String brand;
	private String model;
	private double price;

	public String toString() {
		return brand + " - " + model;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}
}
