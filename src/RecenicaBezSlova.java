
public class RecenicaBezSlova {
	public static void main(String[] args) {
		System.out.println("Ispisite recenicu: ");
		String recenica1 = TextIO.getlnString().toUpperCase();
		System.out.println("Unesite slovo:");
		String slovo = TextIO.getln().toUpperCase();
		
		
		String recenica2 = recenica1.replaceAll(slovo, "");
		System.out.println(recenica2);
	}

}
