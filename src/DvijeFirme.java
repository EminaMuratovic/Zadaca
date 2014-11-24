public class DvijeFirme {
	public static void main(String[] args) {
		System.out.println("Unesite broj sati.");
		int h = TextIO.getlnInt();
		double prvaFirma = 10 + (0.50 * h), drugaFirma = 0.80 * h;
		if (prvaFirma < drugaFirma) {
			double razlika = drugaFirma - prvaFirma;
			System.out.print("Za uneseni broj sati isplatnija vam je prva firma za "
							+ razlika + " KM.");
		}
		if (drugaFirma < prvaFirma) {
			double razlika1 = prvaFirma - drugaFirma;
			System.out.print("Za uneseni broj sati isplatnija vam je druga firma za "
							+ razlika1 + " KM.");
		}
		if (prvaFirma == drugaFirma) {
			System.out.print("Za uneseni broj sati nema razlike u firmama, izaberite koju zelite");
		}
	}

}
