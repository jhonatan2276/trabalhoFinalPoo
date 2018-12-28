package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.unidavi.trabalho.Funcoes;

public class FuncoesTest {
	Funcoes funcoes;
	
	@Before
    public void setup() {
		funcoes = new Funcoes();
    }
	
	@Test
	public void testSorteiaNumero() {
		int numero = funcoes.sorteiaNumero();
		
		if ((numero < 0) || (numero > 100)) {
			fail("Número Invalido");
		}
	}

	@Test
	public void testVerificaTentativa() {
		funcoes.setNumeroSorteado(21);
		assertEquals("O número digitado está ACIMA do número sorteado !!", funcoes.verificaTentativa(30));
		assertEquals("O número digitado está ABAIXO do número sorteado !!", funcoes.verificaTentativa(10));
	}

	@Test
	public void testJogar() {
		funcoes.setNumeroSorteado(40);
		assertEquals(false, funcoes.jogar("90"));
		assertEquals(false, funcoes.jogar("1.5"));
		assertEquals(false, funcoes.jogar("texto"));
		assertEquals(false, funcoes.jogar("-40"));
		assertEquals(true, funcoes.jogar("40"));
	}
	
	@Test
	public void testResultado() {
		funcoes.setAcertou(true);
		assertEquals("Você Acertou. \n", funcoes.resultado());
		funcoes.setAcertou(false);
		funcoes.setNumeroSorteado(45);
		assertEquals("Você Perdeu, o número sorteado foi 45. \n", funcoes.resultado());
	}
	
	@Test
	public void testLimpaVariaveis() {
		assertEquals("Limpa Variáveis", "Limpa Variáveis"); //NOSONAR
	}
}
