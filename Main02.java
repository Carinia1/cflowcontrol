package pl.coderslab.cflowcontrol;

public class Main02 {

	public static void main(String[] args) {

		int nr1 = 3;
		int nr2 = 7;
		int nr3 = 11;
		int result;

		if (nr1 > nr2) {
			result = nr1;
		} else if (nr2 > nr3) {
			result = nr2;
		} else {
			result = nr3;
		}
		System.out.println("Większa liczba to " + result);
	}

}
