package estructuras;

public class Arista {

	private int nodo1,
				nodo2,
				peso;	
	
	public Arista(int nodo1, int nodo2, int peso) {
		this.nodo1 = nodo1;
		this.nodo2 = nodo2;
		this.peso = peso;
	}

	public int getNodo1() {
		return nodo1;
	}

	public void setNodo1(int nodo1) {
		this.nodo1 = nodo1;
	}

	public int getNodo2() {
		return nodo2;
	}

	public void setNodo2(int nodo2) {
		this.nodo2 = nodo2;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nodo1;
		result = prime * result + nodo2;
		result = prime * result + peso;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arista other = (Arista) obj;
		if (nodo1 != other.nodo1)
			return false;
		if (nodo2 != other.nodo2)
			return false;
		if (peso != other.peso)
			return false;
		return true;
	}
	
	
	
}
