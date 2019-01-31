/*
Utwórz klasę Burger dodaj w niej atrybuty:
size
price
1. Utwórz konstruktor, który przyjmie i ustawi parametry size , price .
2. Utwórz konstruktor bezargumentowy.
*/

package d_Konstruktor;

public class Burger {
	private String size;
	private double price;

	public Burger(String size, double price) {
		this.size = size;
		this.price = price;
	}

	public Burger() {
	}
}
