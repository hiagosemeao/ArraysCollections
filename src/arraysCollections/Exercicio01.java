package arraysCollections;

import java.util.ArrayList;

public class Exercicio01 {

	public static void main(String[] args) {
		
		ArrayList <String> cores = new ArrayList();	
		
		String cor1 = "Azul";
		String cor2 = "Roxo";
		String cor3 = "Preto";
		String cor4 = "Branco";
		
		cores.add(cor1);
		cores.add(cor2);
		cores.add(cor3);
		cores.add(cor4);
		
		while(!cores.isEmpty()) {
			System.out.println(cores.remove(0));
		}
		
		cores.add(0, cor3);
		cores.add(1, cor2);
		
		while(!cores.isEmpty()) {
			System.out.println(cores.remove(0));
	}

}

}
