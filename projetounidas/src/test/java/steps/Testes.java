package steps;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import elementos.Elementos;
import metodos.Metodos;
import runner.Executa;

public class Testes {

	Elementos elemento = new Elementos();
	Metodos metodo = new Metodos();

	@Before
	public void acessarFormulario() {
		Executa.abrirNavegador(true);
	}

	@Test
	public void comoAlugarCarro() throws InterruptedException {
		metodo.clicar(elemento.alugarCarro);
		metodo.clicar(elemento.comoAlugar);
		System.out.println("Teste executado com sucesso");
	}

    @Test
	public void faleConosco() throws InterruptedException {
	    Thread.sleep(2000);
		metodo.clicar(elemento.Atendimento);
		metodo.clicar(elemento.FaleConosco);
		Thread.sleep(3000);
		metodo.escrever(elemento.Nome, "Valeria Ventura Carrion");
		metodo.escrever(elemento.email, "valeriacarrion2015@hotmail.com");
		metodo.escrever(elemento.Celular, "11987708411");
		metodo.escrever(elemento.reserva, "123456");
		Thread.sleep(3000);
		metodo.scroll(0, 500);
		metodo.escrever(elemento.Mensagem, "elogio");
		Thread.sleep(3000);
		metodo.escrever(elemento.texto, "Estou muito satisfeita com o serviço prestado pela Unidas.");

		System.out.println("Teste executado com sucesso");

	}
}