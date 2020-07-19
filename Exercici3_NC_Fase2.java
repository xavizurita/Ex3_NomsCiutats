// import javax.swing.*;
import java.util.*;

public class Exercici3_NC_Fase2 {
	public static void main(String[] args) {
		ArrayList<String> arrayciutat2 = new ArrayList<String>();
		
		String ciutat0 = ("Barcelona");
		String ciutat1 = ("Madrid");
		String ciutat2 = ("Valencia");
		String ciutat3 = ("Malaga");
		String ciutat4 = ("Cadis");
		String ciutat5 = ("Santander");
		
		arrayciutat2.add(ciutat0);
		arrayciutat2.add(ciutat1);
		arrayciutat2.add(ciutat2);
		arrayciutat2.add(ciutat3);
		arrayciutat2.add(ciutat4);
		arrayciutat2.add(ciutat5);
			
		System.out.println(arrayciutat2);
		Collections.sort(arrayciutat2); 
		System.out.println(arrayciutat2);
		
		
	}

}

