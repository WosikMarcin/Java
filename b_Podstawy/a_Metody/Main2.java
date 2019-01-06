/*
W pliku Main2.java
Napisz metodę static int multiply(int multipler, int index), 
która zwróci wartość zmiennej multipler pomnożoną przez wartość argumentu index.
*/

package a_Metody;

public class Main2 {

	public static void main(String[] args) {
		int multipler = 10;
		int index = 5;
		System.out.println(multiply(multipler, index));
	}

	static int multiply(int multipler, int index) {
		return multipler * index;
	}
}
