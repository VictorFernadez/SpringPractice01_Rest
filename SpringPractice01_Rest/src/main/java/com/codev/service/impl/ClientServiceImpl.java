package com.codev.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codev.model.Client;
import com.codev.repository.IClient;
import com.codev.service.IClientService;

@Service
public class ClientServiceImpl implements IClientService {

	@Autowired
	private IClient clientRepository;

	@Override
	public List<Client> findAll() {
		return clientRepository.findAll();
	}

	@Override
	public Client create(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public Client find(Long id) {
		Optional<Client> clientOptional = clientRepository.findById(id);
		return clientOptional.get();
	}

	@Override
	public Client update(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public int delete(Long id) {
		int rsp = 0;
		try {
			clientRepository.deleteById(id);
			rsp = 1;
		} catch (Exception e) {
			rsp = 0;
			// TODO: handle exception
		}
		return rsp;
	}

}
