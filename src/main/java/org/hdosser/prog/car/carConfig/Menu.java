package Auto;
import java.util.Scanner;

public class Menu {
	
	private Lager lager1;
	private Scanner scan;
	private Auto car;
	private Ausstattung aus;
	
	public Menu()
	{
		lager1 = new Lager();
		scan = new Scanner(System.in);
		car = null;
		aus = null;
	}
	
	public void welcome()
	{
		while(true)
		{
			System.out.println("---------------------------------------");
			System.out.println("| Herzlich willkommen bei Autohaus OKG |");
			System.out.println("---------------------------------------");
			System.out.println("1.Auto Aussuchen            2.Schließen\n");
			System.out.print("Auswahl Nr: ");
			int i  = scan.nextInt();
			if(i == 1)	break;
			else if(i == 2) System.out.println("Danke fuer ihren Besuch. Aufwiedersehen");
			else {
				System.out.println("Bitte 1 oder 2 eingeben");				
			}
		}
		autoAuswahl();
	}
	private void autoAuswahl()
	{
		System.out.println("--------------------------");
		System.out.println("|   Zur auswahl stehen   |");
		System.out.println("--------------------------");
		car = lager1.autosAusgabe();
		//schleifen problem methode zu methode ausführen
		// kann alles in reihenfolge machen nur deas zurück ist ein problem 
		// null returnen wenn ich wiederholen soll ?? 
		// alles in welcome machen bzw eigenen methode nach welcome
		//oder main aut und ausstattung speichen und das die einzelnen sachen aufrufen.
		ausstattungAuswahl();
	}
	public void ausstattungAuswahl()
	{
		System.out.println("----------------------------------");
		System.out.println("| Moegliche ausstattungen sind : |");
		System.out.println("----------------------------------");
		System.out.println("Preis momentan: "+car.getPreis()+"\n");
		aus = car.ausstatungAusgeben();
		if(aus == null)
		{
			// hier gleich problem mit schleife methode methode
			// muss etwas ueberlegen wie besser geht
			autoAuswahl();
		}
		
	}
	
	public boolean abschluss()
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("| Sie haben des Auto : "+car.getBezeichnung());
		System.out.println("| und die Ausstattung : "+aus.getBezeichnung()+" gewählt.");
		System.out.println("| Zussammen ergiebt das :"+(car.getPreis()+aus.getPreis())+" €.");
		System.out.println("| Wollen Sie kaufen?? ");
		System.out.println("| 1.Ja                   2.Nein");
		System.out.println("--------------------------------------------------------------");
		
		int i = scan.nextInt();
		boolean w;
		if(i == 1)
		{
			System.out.println("Sind Sie sicher? (j/n)");
			String n = scan.next();
			if(n.equals("j")) {
				System.out.println("Danke fuer ihren einkauf!!");
				w = false;
			}
			else w = true;				
		}
		else w = true;
		return w;
		
		
		
	}
	
}
