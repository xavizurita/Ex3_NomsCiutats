import java.util.*;

public class Exercici3_NC_Fase3 {
	public static void main(String[] args) {
		
		ArrayList<String> arrayciutat2 = new ArrayList<String>();
		ArrayList<String> ArrayCiutatsModificades = new ArrayList<String>();
		
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
		
		String valor =("a");
		
		Iterator<String> sensenom = arrayciutat2.iterator();
		while(sensenom.hasNext()) {
			String ciutatfinal="";
			String elemento = sensenom.next();
			int largo = elemento.length();
			for (int hh=0; hh<=(largo-1); hh++) {
				String subelemento = elemento.substring(hh,hh+1);
	
                if(valor.equals(subelemento)){	
    				subelemento="4";
					ciutatfinal=ciutatfinal+subelemento;
				} else {
					ciutatfinal=ciutatfinal+subelemento;
				}
			}
			
			ArrayCiutatsModificades.add(ciutatfinal);
		}
		
		Collections.sort(ArrayCiutatsModificades); 
		System.out.println(ArrayCiutatsModificades);
	}
}
