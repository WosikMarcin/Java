/*
Utwórz klasę Person dodaj w niej atrybuty:
name
surname
age
gender
Wszystkie atrybuty mają być publiczne, oraz mają mieć ustawione wartości domyślne.
W pliku Main3.java umieść w metodzie main kod, który:
1. Utworzy obiekt klasy Person o nazwie person a następnie wyświetl kolejno atrybuty klasy
(name, surname, age, gender)
*/

package b_Atrybuty;

public class Main3 {

	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.name);
		System.out.println(person.surname);
		System.out.println(person.age);
		System.out.println(person.gender);
	}
}
