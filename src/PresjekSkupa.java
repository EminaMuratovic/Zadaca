

public class PresjekSkupa {

	public static void main(String[] args) {
	
		
		int a,b,c,d;
		
		System.out.println("Skup S1=[a,b].\nUnesi a: ");
		a=TextIO.getInt();
		System.out.println("Unesi b:");
		b=TextIO.getInt();
		
		System.out.println("Skup S2=[c,d].\nUnesi c: ");
		c=TextIO.getInt();
		System.out.println("Unesi d:");
		d=TextIO.getInt();
		
		if((a<c && b<d && a<c && b<c)||(a>c && b>d && a>c && b>c)){
			System.out.println("Skupovi S1 i S2 se ne sijeku!");
			return;
		}
		
		if(a<c&&b>d) System.out.println("Skup S2 je sadržan u skupu S1!");
		
		if(c<a&&d>b) System.out.println("Skup S1 je sadržan u skupu S2!");
		
		if(a>c&&d<b) System.out.printf("Presjek skupova S1 i S2 je skup: [%d,%d]",a,d);
		if(c>a&&b<d) System.out.printf("Presjek skupova S1 i S2 je skup: [%d,%d]",c,b);
		
	}
}

