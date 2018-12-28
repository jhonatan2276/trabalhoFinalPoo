package br.edu.unidavi.trabalho;

import java.util.Scanner;

public class ExecutaJogo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Funcoes funcoes = new Funcoes();
		
		System.out.println(funcoes.limpaVariaveis("Bem-Vindo - INFORME UM NÚMERO conforme instruções abaixo: \n")); //NOSONAR
		funcoes.setNumeroSorteado(funcoes.sorteiaNumero());	
		
		while ((!funcoes.isAcertou()) && (funcoes.getMaxTentativas() > 0)) {
			String valoroDigitado = scanner.next();
			funcoes.setAcertou(funcoes.jogar(valoroDigitado));
		}	
		
		System.out.println(funcoes.resultado()); //NOSONAR
		System.out.println(funcoes.limpaVariaveis("===== Fim de Jogo - Variáveis Resetadas =====")); //NOSONAR
	}
}