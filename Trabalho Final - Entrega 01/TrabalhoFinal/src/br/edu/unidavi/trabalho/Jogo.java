package br.edu.unidavi.trabalho;

public class Jogo {
	private int maxTentativas;
	private int numeroSorteado;
	private boolean acertou;
	
	public int getMaxTentativas() {
		return maxTentativas;
	}
	
	public void setMaxTentativas(int maxTentativas) {
		this.maxTentativas = maxTentativas;
	}
	
	public int getNumeroSorteado() {
		return numeroSorteado;
	}
	
	public void setNumeroSorteado(int numeroSorteado) {
		this.numeroSorteado = numeroSorteado;
	}
	
	public boolean isAcertou() {
		return acertou;
	}
	
	public void setAcertou(boolean acertou) {
		this.acertou = acertou;
	}
	
	public String limpaVariaveis (String texto) {
		this.maxTentativas = 100;
		this.numeroSorteado = 100;
		this.acertou = false;
		return texto;
	}
}
