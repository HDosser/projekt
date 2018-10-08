package Auto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lager {

	private List<Auto> list = new ArrayList<>();
	private Scanner scan;
	
	public Lager()
	{
		lagerFuellen();
		scan = new Scanner(System.in);
	}
	
	public void addAuto(String bezeichnung, double preis)
	{
		list.add(new Auto(bezeichnung,preis));
	}
	
	public void addAusstattung(String AutoName,String bezeichnung, double preis)
	{
		for(Auto a : list)
		{
			if(a.getBezeichnung() == AutoName)
			{
				a.addAusstattung(bezeichnung, preis);
				break;
			}
		}
	}
	
	public void lagerFuellen()
	{
		Auto a1 = new Auto("Toyota",15000);
		Auto a2 = new Auto("Mercedes",24000);
		Auto a3 = new Auto("Ford",18000);
		
		a1.addAusstattung("Comfort", 4000);
		a1.addAusstattung("Basic", 1000);
		a1.addAusstattung("Offroad", 6000);
		
		a2.addAusstattung("Luxus", 8000);
		a2.addAusstattung("Stretch", 2000);
		a2.addAusstattung("Sport", 4000);
		
		a3.addAusstattung("Automatic", 1000);
		a3.addAusstattung("Sport", 4000);
		a3.addAusstattung("Turbo", 2000);
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
	}
	

	public Auto autosAusgabe() {
		for(int i = 0 ; i < list.size(); i++)
		{
			System.out.println((i+1)+". "+list.get(i).getBezeichnung()+"   \t\t "+list.get(i).getPreis()+" €");
		}		
		while (true)
		{
			System.out.print("Auswahl Nr: ");
			int x = scan.nextInt();
			x--;
			
			if(x <= (list.size()) && x >= 0 ) return list.get(x);
			else System.out.println("Bitte ein zahl von 1 - "+(list.size()+1)+" eingeben");
		}
	}

	
}
