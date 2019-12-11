package arraysCollections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class AplicacaoListArquivo implements Serializable {

	public static void main(String[] args) {
	
		Salvar litados = new Salvar();
		Random gerador = new Random();
		
		
		
		for (int i=0; i<20; i++) {
			litados.salvarElemento(gerador.nextInt(2000));
		
	}
		litados.SalvaLista();
		litados.RecuperaLista();
		
		System.out.println(litados.getLista());
}
	
}
