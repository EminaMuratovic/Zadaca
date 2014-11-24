
public class PravougliTrougao {
	public static void main(String[] args) {
		System.out.println("Unesite duzinu prve stranice: ");
		int a = TextIO.getInt();
		System.out.println("Unesite duzinu druge stranice: ");
		int b = TextIO.getInt();
		int c1;
		if (a > b) 
		{
			c1 = a * a - b * b;
		}
		else if (a < b) 
		{
			c1 = b * b - a * a;
		}
		else
		{
			c1 = a * a + b * b;
		}

		double c = Math.sqrt(c1);
		System.out.println("Treca stranica je " + c);
	}

}
