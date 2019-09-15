package estudando;

public class Pilha {

	int[] elementos;
	int topo; // indice que indica em que pos do vetor est� o ultimo elemento

	public Pilha() {
		this.elementos = new int[10];
		this.topo = -1; // pos invalida do vetor
	}

	public void push(int e) {
		if(isFull()) {
			throw new RuntimeException("Stack Overflow");
		}
		this.topo++; // pq se topo est� na pos -1, a primeira vez q eu for empilhar, deixo topo numa pos v�lida
		this.elementos[topo] = e;
	
	}

	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack Empty!");
		}
		int e;
		e = this.elementos[topo];
		topo--;
		return e;

	}

	public boolean isEmpty() { // 
		return (this.topo == -1);
	}

	public boolean isFull() { // Verifica se a pilha est� cheia
		return (this.topo == elementos.length-1);

	}

	public int top() { // Retorna o elemento que est� no topo
		if(isEmpty()) {
			throw new RuntimeException("Stack Empty!");
		}
		return this.elementos[topo];

	}

}
