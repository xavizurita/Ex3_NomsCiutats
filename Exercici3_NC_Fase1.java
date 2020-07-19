import java.util.*;

public class Exercici3_NC_Fase1 {
	public static void main(String[] args) {
		String[] ciutat = new String[6];
		Scanner entrada= new Scanner(System.in);
		
		for (int hh=0; hh<=5; hh++) {
			System.out.println("escriu el nom de la ciutat " + (hh+1) + "/6");
			String nomciutat=entrada.nextLine();
			ciutat[hh]=nomciutat;
		}
		
		for (int hh=0; hh<=5; hh++) {
			System.out.println("Nom de la ciutat " + ciutat[hh] + " " + (hh+1) + "/6");
		}
		
	
	}

}
