/*
Utwórz klasę Person dodaj w niej atrybuty:
name
surname
age
gender
Wszystkie atrybuty mają być prywatne.
1. Utwórz konstruktor, który przyjmie i ustawi parametry name , surname .
2. Utwórz konstruktor, który przyjmie i ustawi parametry name , surname , age , gender .
3. Utwórz konstruktor, który przyjmie i ustawi parametry name , age .
*/

package d_Konstruktor;

public class Person {
	private String name;
	private String surname;
	private int age;
	private String gender;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public Person(String name, String surname, int age, String gender) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
