/*
W pliku Main1.java umieść w metodzie main kod, który:
1. Utwórz obiekt klasy Cat i przypisz do zmiennej cat .
2. Utwórz obiekt klasy Dog i przypisz do zmiennej dog .
3. Spróbuj porównać oba te obiekty za pomocą instrukcji if , zaobserwuj jaki wystąpi błąd.
*/

package a_Pierwsza_Klasa;

public class Main1 {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		if (cat == dog) {
			System.out.println("True!");
		} else {
			System.out.println("False!");
		}
	}
}

/*
Użycie operatora == w instrukcji warunkowej if nie zadziała gdyż służy on do porównania typów prostych.
Do porównania typów obiektowych należy użyć equals, tak jak poniżej:
        if (cat.equals(dog)) {
			System.out.println("True!");
		} else {
			System.out.println("False!");
		}
*/


