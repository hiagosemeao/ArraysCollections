package arraysCollections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List <String> cores = new LinkedList();
		List <String> copia =  new LinkedList();

		String cor;
		for(int i=0;i<5;i++) {

			System.out.println("Digite uma cor ");
			cor = sc.nextLine();
			cores.add(cor);
		}

		copia.addAll(cores);
		
		System.out.println(copia.toString());
	
		Collections.sort(copia);
		System.out.println(copia.toString());
		
	}
	
}
