/*
Utwórz klasę Person dodaj w niej atrybuty:
name
surname
age
gender
Wszystkie atrybuty mają być prywatne, oraz mają mieć ustawione wartości domyślne.
Dodaj metody setName , setSurname , setAge , setGender , które ustawią atrybuty klasy zgodnie z nazwą, na którą
wskazują. Np. setName - ustawia atrybut name .
W pliku Main1.java umieść w metodzie main kod, który:
1. Utworzy obiekt klasy Person o nazwie person , a następnie ustawi za pomocą wcześniej utworzonych metod wszystkie
atrybuty klasy.
Do klasy Person dopisz metodę getFullName , która zwróci imię i nazwisko połączone znakiem spacji.
Do klasy Person napisz metodę increaseAge , która inkrementuje zmienną age o 1.
*/

package c_Metody;

public class Main1 {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Poul");
		person.setSurname("Brown");
		person.setAge(30);
		person.setGender("man");
		person.increaseAge();
		System.out.println(person.getFullName());
	}
}
