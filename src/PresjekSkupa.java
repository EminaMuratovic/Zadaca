
public class PresjekSkupa {
	public static void main(String[] args) {
		int a, b, c, d;
		System.out.println("Unesite granice skupa S1!");
		a = TextIO.getlnInt();
		b = TextIO.getlnInt();
		System.out.println("Unesite granice skupa S2!");
		c = TextIO.getlnInt();
		d = TextIO.getlnInt();
		String pr = "";
		if (a < c && b > d) {
			System.out.println("Skup S2 je sadrzan u skupu S1.");
		}
		if (a > c && b < d) {
			System.out.println("Skup S1 je sadrzan u skupu S2.");
		}
		if (a < c && b < d) {
			for (int i = b; i <= d; i++) {
				pr += i + " ";
			}
			System.out.println("Presjek skupova je: " + pr);
		}
		if (c < a && d < b) {
			for (int i = a; i <= d; i++) {
				pr += i + " ";
			}
			System.out.println("Presjek skupova je: " + pr);
		}
	}

}
