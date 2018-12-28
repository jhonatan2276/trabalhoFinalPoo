package br.edu.unidavi.trabalho;

import java.util.Random;
import java.util.Scanner;

public class Funcoes extends Jogo {
	Scanner scanner = new Scanner(System.in);
	
	public int sorteiaNumero () {
		Random random = new Random();
		setNumeroSorteado(random.nextInt(101));
		
		if (getNumeroSorteado() <= 20) {
			setMaxTentativas(5);
			informaFaixaTentativa("0 e 20", "5");
		} else {
			setMaxTentativas(6);
			informaFaixaTentativa("21 e 100", "6");
		}

		return getNumeroSorteado();
	}
	
	public void informaFaixaTentativa (String faixa, String tentativas) {
		System.out.println("O número sorteado está entre "+faixa+", você tem "+tentativas+" tentativas.");
	}
	
	public String verificaTentativa (int numero) {
		if (numero > getNumeroSorteado()) {
			return "O número digitado está ACIMA do número sorteado !!";
		} else {
			return "O número digitado está ABAIXO do número sorteado !!";
		}
	}
	
	public boolean jogar () {
		setMaxTentativas(getMaxTentativas() - 1);
			
		int numeroDigitado = scanner.nextInt();
		if (getNumeroSorteado() == numeroDigitado) {
			return true;
		} else {
			System.out.println(verificaTentativa(numeroDigitado));
			System.out.println("Tentativas: "+Integer.toString(getMaxTentativas()));
			return false;
		}
	}
	
	public String resultado () {
		return "Você "+(isAcertou() ? "Acertou. \n" : "Perdeu, o número sorteado foi "+Integer.toString(getNumeroSorteado())+". \n");
	}
	
	@Override
	public String limpaVariaveis (String texto) {
		setMaxTentativas(0);
		setNumeroSorteado(0);
		setAcertou(false);
		return texto;
	}
}
