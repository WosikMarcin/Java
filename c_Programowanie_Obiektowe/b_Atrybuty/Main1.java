/*
Utwórz klasę Attribute dodaj w niej atrybuty:
1. Atrybut o nazwie publicAttribute z modyfikatorem public .
2. Atrybut o nazwie privateAttribute z modyfikatorem private .
3. Atrybut o nazwie protectedAttribute z modyfikatorem protected .
W pliku Main1.java umieść w metodzie main kod, który:
1. Utworzy obiekt klasy Attribute i przypisze go do zmiennej attr .
2. Sprawdź które z atrybutów klasy Attribute są dostępne.
*/

package b_Atrybuty;

public class Main1 {

	public static void main(String[] args) {
		Attribute attr = new Attribute();
		attr.publicAttribute = "test1";
		System.out.println(attr.publicAttribute);
		attr.protectedAttribute = "test2";
		System.out.println(attr.protectedAttribute);
//		attr.privateAttribute = "test3";
//		System.out.println(attr.privateAttribute);
	}
}

// Atrybut privateAttribute jest dostępny tylko z wnętrza danej klasy


