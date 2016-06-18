package estructuras;

import java.util.HashMap;
import java.util.HashSet;

public class Grafo {

	private int dimension;
	private HashSet<Arista> aristas = new HashSet<Arista>();
	
	public Grafo(int dimension){
		this.dimension = dimension;
	}
	
	public void addArista(int n1, int n2, int peso){
		Arista arista = new Arista(n1,n2, peso);
		aristas.add(arista);
	}
	
	
	
}
