package com.example.nielson.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nielson.domain.exception.NegocioException;
import com.example.nielson.domain.model.Cliente;
import com.example.nielson.domain.repository.ClienteRepository;

@Service
public class CadastroClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	public Cliente salvar(Cliente cliente) {
		Cliente clienteExistente = clienteRepository.findByEmail(cliente.getEmail());
		if (clienteExistente != null && !clienteExistente.equals(cliente)) {
			throw new NegocioException("Já existe cliente cadastrado com esse email");
		}
		return clienteRepository.save(cliente);
	}
	
	public void excluir(Long clienteId) {
		clienteRepository.deleteById(clienteId);
	}
	
}
