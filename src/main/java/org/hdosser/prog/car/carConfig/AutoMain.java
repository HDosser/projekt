package Auto;

public class AutoMain {

	public static void main(String[] args) {
		
		Menu m1 = new Menu();
		
		while(true)
		{
			m1.welcome();		
			boolean w = m1.abschluss();
			if(w == false) break;
		}
		
	}

}
