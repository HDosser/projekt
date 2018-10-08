package Auto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Auto {
	
	private Scanner scan = new Scanner(System.in);
	
	private String bezeichnung;
	private double preis;
	private List<Ausstattung> typ = new ArrayList<>();
	
	public Auto(String bezeichnung, double preis)
	{
		this.bezeichnung = bezeichnung;
		this.preis = preis;
	}
	
	public void addAusstattung(String bezeichnung, double preis)
	{
		typ.add(new Ausstattung(bezeichnung, preis));
	}
	
	public Ausstattung ausstatungAusgeben() {
		
		for(int i = 0; i < typ.size();i++)
		{
			System.out.println((i+1)+". "+typ.get(i).getBezeichnung()+"\t\t "+typ.get(i).getPreis()+" €");
		}
		
		while (true)
		{
			System.out.println((typ.size()+1) + ".Zurueck");
			System.out.print("Auswahl Nr: ");
			int x = scan.nextInt();
			x--;
			if(x < typ.size() && x >= 0) return typ.get(x);
			else if(x == typ.size()) return null;
			else System.out.println("Bitte zahl von 1 - "+(typ.size()+1)+" Eingeben!!");
		}
		
	}
	
	
	
	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}
	
		
}
