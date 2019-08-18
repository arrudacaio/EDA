package curso.loiane.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;

	}

	// Essa forma de fazer n�o � eficiente quando tivermos um array de centenas
	// posi��es
	/*
	 * public void adiciona(String elemento) { for(int i = 0; i <
	 * this.elementos.length ; i++) { if(this.elementos[i] == null) {
	 * this.elementos[i] = elemento; break; } } }
	 */

	/*
	 * Mais eficiente, pois n�o � necess�rio percorrer todo o array em busca de uma
	 * posi��o valida
	 */
	public boolean adiciona(String elemento) {
		boolean retorno = false;
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			retorno = true;
		}
		return retorno;
	}

	// o retorno deste m�todo depende do tipo do array.
	//Busca o elemento atrav�s posi��o passada, se existe, retorna o elemento.
	public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) { // Tratando posicao invalida
			throw new IllegalArgumentException("Posicao inv�lida");
		}
		return this.elementos[posicao];
	}
	
	//Verificar se elemento existe naquela cole��o
	public int buscaElemento(String elemento) {
		int retorno = -1;
		for(int i = 0; i< this.tamanho ; i++) {
			if(this.elementos[i].equals(elemento)) {
				retorno = i;
			} 
		}
		return retorno;
		
	}

	public int tamanho() {
		return this.tamanho;
	}

	/*
	 * N�o usamos concatena��o pois utilizando o StringBuilder, torna o algoritmo
	 * mais eficiente
	 */

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}
		s.append("]");

		return s.toString();
	}

}
