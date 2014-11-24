


public class DjeliociBroja {
		public static void main(String[] args) {

			int suma=0, i;


			System.out.println("Unesite broj: ");

			int broj=TextIO.getInt();

			for(i=1; i<=broj; i++)

			if(broj%i==0) suma=suma+i;

			System.out.println(suma);



			}

}
