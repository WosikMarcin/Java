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

public class Person {
	private String name = "Name";
	private String surname = "Surname";
	private int age = 18;
	private String gender = "M";

	public String getFullName() {
		return name + " - " + surname;
	}

	public void increaseAge() {
		age++;
		System.out.println(age);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
