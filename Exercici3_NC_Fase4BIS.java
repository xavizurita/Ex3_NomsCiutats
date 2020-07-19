import java.util.*;

	public class Exercici3_NC_Fase4BIS {

		public static void main(String[] args) {
		
		
			String ciutat0 = ("Barcelona");
			String ciutat1 = ("Madrid");
			String ciutat2 = ("Valencia");
			String ciutat3 = ("Malaga");
			String ciutat4 = ("Cadis");
			String ciutat5 = ("Santander");	
			
			int largo0 = ciutat0.length();
			int largo1 = ciutat1.length();
			int largo2 = ciutat2.length();
			int largo3 = ciutat3.length();
			int largo4 = ciutat4.length();
			int largo5 = ciutat5.length();
						
			String[] ciutat00 = new String[largo0];
			String[] ciutat11 = new String[largo1];
			String[] ciutat22 = new String[largo2];
			String[] ciutat33 = new String[largo3];
			String[] ciutat44 = new String[largo4];
			String[] ciutat55 = new String[largo5];
			
			ciutat00 =ciutat0.split("");
			ciutat11 =ciutat1.split("");
			ciutat22 =ciutat2.split("");
			ciutat33 =ciutat3.split("");
			ciutat44 =ciutat4.split("");
			ciutat55 =ciutat5.split("");
			
			// System.out.println(Arrays.toString(ciutat00));

			int contador = 0;
			contador=largo0-1;
			while ((contador+1)!=0) {
				System.out.print(ciutat00[contador] + " ");
				contador--;
			}
			
			System.out.println(" ");
			contador = 0;
			contador=largo1-1;
			while ((contador+1)!=0) {
				System.out.print(ciutat11[contador] + " ");
				contador--;
			}
			
			System.out.println(" ");
			contador = 0;
			contador=largo2-1;
			while ((contador+1)!=0) {
				System.out.print(ciutat22[contador] + " ");
				contador--;
			}
			
			System.out.println(" ");
			contador = 0;
			contador=largo3-1;
			while ((contador+1)!=0) {
				System.out.print(ciutat33[contador] + " ");
				contador--;
			}
			
			System.out.println(" ");
			contador = 0;
			contador=largo4-1;
			while ((contador+1)!=0) {
				System.out.print(ciutat44[contador] + " ");
				contador--;
			}
			
			System.out.println(" ");
			contador = 0;
			contador=largo5-1;
			while ((contador+1)!=0) {
				System.out.print(ciutat55[contador] + " ");
				contador--;
			}
			
		}
	}



