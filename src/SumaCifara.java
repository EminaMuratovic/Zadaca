
public class SumaCifara {
	public static void main(String[] args) {
		int broj, suma=0, cifra=0, k=10;
		System.out.println("Unesite broj: ");
		broj = TextIO.getlnInt();
		while (broj != 0) {
			cifra = broj % k;
			suma += cifra;
			broj /= 10;
		}
		System.out.println("Suma cifara unesenog broja je " + suma);
	}

}
