/*
W pliku Main5.java napisz metodę calculateNet, która przyjmie argumenty:
gross, czyli kwotę brutto ceny zakupu,
vat, czyli wartość podatku VAT. Możesz założyć, że VAT ma być liczbą
zmiennoprzecinkową z zakresu 0 – 1.
Funkcja ma zwrócić wartość netto ceny. 
*/

package a_Metody;

public class Main5 {

	public static void main(String[] args) {
		double gross = 100.5;
		double vat = 0.5;
		System.out.println(calculateNet(gross, vat));
	}

	static double calculateNet(double gross, double vat) {
		return gross / (1 + vat);
	}
}
