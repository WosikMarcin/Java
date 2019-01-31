/*
W pliku Main2.java umieść w metodzie main kod, który:
1. Utworzy obiekt klasy Attribute o nazwie attr,
a następnie ustaw i wyświetl wszystkie wartości które są możliwe do ustawienia.
*/

package b_Atrybuty;

public class Main2 {

	public static void main(String[] args) {
		Attribute attr = new Attribute();
		attr.publicAttribute = "publicAttribute";
		System.out.println(attr.publicAttribute);
		attr.protectedAttribute = "protectedAttribute";
		System.out.println(attr.protectedAttribute);
	}
}
