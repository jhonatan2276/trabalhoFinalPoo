package br.edu.unidavi.trabalho;

public class ExecutaJogo {
	public static void main(String[] args) {
		Funcoes funcoes = new Funcoes();
		
		System.out.println(funcoes.limpaVariaveis("Bem-Vindo - INFORME UM NÚMERO conforme instruções abaixo: \n"));
		funcoes.setNumeroSorteado(funcoes.sorteiaNumero());
		
		while ((!funcoes.isAcertou()) && (funcoes.getMaxTentativas() > 0)) {
			funcoes.setAcertou(funcoes.jogar());
		}	
		
		System.out.println(funcoes.resultado());
		System.out.println(funcoes.limpaVariaveis("===== Fim de Jogo - Variáveis Resetadas ====="));
	}
}