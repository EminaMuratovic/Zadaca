
public class RecenicaIRijec {
	public static void main(String[] args) {
		System.out.println("Upisite recenicu.");
		String recenica = TextIO.getlnString().trim();
		System.out.println("Broj rijeci koju zelite izbaciti?");
		int rijec = TextIO.getlnInt();
		int brojac = 0;
		String zadanaRijec = "";
		for (int i = 0; i < recenica.length(); i++) {
			if (recenica.charAt(i) == ' ') {
				brojac++;
			}
			if (brojac == rijec - 1) {
				for (int j = i + 1; j < recenica.length(); j++) {
					if (recenica.charAt(j) != ' ') {
						zadanaRijec += recenica.charAt(j);
					} else {
						System.out.println(zadanaRijec);
						return;
					}
				}

			}
		}
	}

}
