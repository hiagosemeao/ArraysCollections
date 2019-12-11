package arraysCollections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Salvar implements Serializable {
	private ArrayList <Integer> lista;


	public Salvar() {
		this.lista = new ArrayList <Integer>();
	}

	public void salvarElemento(int num) {
		lista.add(num);
	}

	public void SalvaLista() {
		try {
			File f = new File("Arquivo.dat");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(lista);
			oos.close();

		}catch(Exception e) {
			JOptionPane.showInternalMessageDialog(null, "Houve um erro interno, erro ao abrir o arquivo");

		}finally {

		}

	}

	public void RecuperaLista() {
		try {
			File f = new File("Arquivo.dat");
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			ArrayList<Integer> clone = (ArrayList<Integer>) o;
			System.out.println(o);

		}catch (Exception e ) {
			JOptionPane.showMessageDialog(null, "Houve um erro interno, falha na abertura do arquivo", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}


	public ArrayList<Integer> getLista() {
		return lista;
	}


	public void setLista(ArrayList<Integer> lista) {
		this.lista = lista;
	}



}
