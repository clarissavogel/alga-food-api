package com.algaworks.di;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.Notificador;
import com.algaworks.di.notificacao.NotificadorEmail;
import com.algaworks.di.service.AtivacaoClienteService;

public class Main {

//	Injeção de dependência: envolve fornecer as dependências necessárias para um objeto (ou componente)
//	a partir do exterior, em vez de deixá-lo criar ou gerenciar suas próprias dependências internamente.
	
	public static void main(String[] args) {
		Cliente beltrano = new Cliente("Beltrano", "beltrano@email.com", "2222224444");
		Cliente fulano = new Cliente("Fulano", "fulano@email.com", "2222225555");
		
		Notificador notificador = new NotificadorEmail();
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
		
		ativacaoCliente.ativar(beltrano);
		ativacaoCliente.ativar(fulano);
	}
}
