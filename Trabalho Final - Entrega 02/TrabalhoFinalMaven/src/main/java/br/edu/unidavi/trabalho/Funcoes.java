package br.edu.unidavi.trabalho;

import java.util.Random;

public class Funcoes extends Jogo {
	public int sorteiaNumero () {
		Random random = new Random();
		setNumeroSorteado(random.nextInt(101));
		
		if (getNumeroSorteado() <= 20) {
			setMaxTentativas(5);
			System.out.println("O número sorteado está entre 0 e 20, você tem 5 tentativas."); //NOSONAR
		} else {
			setMaxTentativas(6);
			System.out.println("O número sorteado está entre 21 e 100, você tem 6 tentativas."); //NOSONAR
		}

		return getNumeroSorteado();
	}
	
	public String verificaTentativa (int numero) {
		if (numero > getNumeroSorteado()) {
			return "O número digitado está ACIMA do número sorteado !!";
		} else {
			return "O número digitado está ABAIXO do número sorteado !!";
		}
	}
	
	public boolean jogar (String valor) {
		try {
			int numeroDigitado = Integer.parseInt(valor);
			
			if (numeroDigitado < 0) {
				System.out.println("Só são permitidos números positivos."); //NOSONAR
				System.out.println("Você ainda tem "+Integer.toString(getMaxTentativas())+" tentativas."); //NOSONAR
				return false;
			}
			
			setMaxTentativas(getMaxTentativas() - 1);
			
			if (getNumeroSorteado() == numeroDigitado) {
				return true;
			} else {
				System.out.println(verificaTentativa(numeroDigitado)); //NOSONAR
				System.out.println("Tentativas: "+Integer.toString(getMaxTentativas())); //NOSONAR
				return false;
			}
		} catch (Exception e) {
			System.out.println("Valor Inválido, tente novamente."); //NOSONAR
			System.out.println("Você ainda tem "+Integer.toString(getMaxTentativas())+" tentativas."); //NOSONAR
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
