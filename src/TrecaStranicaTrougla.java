
public class TrecaStranicaTrougla {
	public static void main(String[] args) {
		int a, b, c;
	System.out.println("Unesite prvu stranicu trougla: ");
	a = TextIO.getInt();
	System.out.println("Unesite drugu stranicu trougla: ");
	b = TextIO.getInt();
	c = 0;
	if (a < b) {
		c = b - a + 1;
		System.out.println("Najmanja moguca duzina trece stranice je " + c);
	}
	if (a > b) {
		c = a - b + 1;
		System.out.println("Najmanja moguca duzina trece stranice je " + c);
	}
	if (a == b) {
		c = 1;
		System.out.println("Najmanja moguca duzina trece stranice je " + c);
	}
}

}
