package br.edu.unidavi.trabalho;

import java.util.Random;

public class Funcoes extends Jogo {
	public int sorteiaNumero () {
		Random random = new Random();
		setNumeroSorteado(random.nextInt(101));
		
		if (getNumeroSorteado() <= 20) {
			setMaxTentativas(5);
			System.out.println("O n�mero sorteado est� entre 0 e 20, voc� tem 5 tentativas."); //NOSONAR
		} else {
			setMaxTentativas(6);
			System.out.println("O n�mero sorteado est� entre 21 e 100, voc� tem 6 tentativas."); //NOSONAR
		}

		return getNumeroSorteado();
	}
	
	public String verificaTentativa (int numero) {
		if (numero > getNumeroSorteado()) {
			return "O n�mero digitado est� ACIMA do n�mero sorteado !!";
		} else {
			return "O n�mero digitado est� ABAIXO do n�mero sorteado !!";
		}
	}
	
	public boolean jogar (String valor) {
		try {
			int numeroDigitado = Integer.parseInt(valor);
			
			if (numeroDigitado < 0) {
				System.out.println("S� s�o permitidos n�meros positivos."); //NOSONAR
				System.out.println("Voc� ainda tem "+Integer.toString(getMaxTentativas())+" tentativas."); //NOSONAR
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
			System.out.println("Valor Inv�lido, tente novamente."); //NOSONAR
			System.out.println("Voc� ainda tem "+Integer.toString(getMaxTentativas())+" tentativas."); //NOSONAR
			return false;
		}	
	}
	
	public String resultado () {
		return "Voc� "+(isAcertou() ? "Acertou. \n" : "Perdeu, o n�mero sorteado foi "+Integer.toString(getNumeroSorteado())+". \n");
	}
	
	@Override
	public String limpaVariaveis (String texto) {
		setMaxTentativas(0);
		setNumeroSorteado(0);
		setAcertou(false);
		return texto;
	}
}
