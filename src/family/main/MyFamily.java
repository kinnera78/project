package family.main;

import family.model.Ammama;

public class MyFamily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ammama ammama = new Ammama();
		// displayAmmama = new displayAmmama()
		MyFamily myFamily = new MyFamily();
		ammama = myFamily.setAmmama();
		myFamily.displayAmmama(ammama);
//b=a.setAmmama(Ammama);
//displayAmmama = new displayAmmama();

	}

	private Ammama setAmmama() {
		Ammama ammama = new Ammama();
		ammama.setChanti("Ramesh");
		ammama.setChinna("Satish");
		return ammama;
	}

	private void displayAmmama(Ammama ammama) {
//	displayAmmama =new displayAmmama();
		System.out.println("chinna mama " + ammama.getChinna());
		System.out.println("chanti mama " + ammama.getChanti());

	}
}