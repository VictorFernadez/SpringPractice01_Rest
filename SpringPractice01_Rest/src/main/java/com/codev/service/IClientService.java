package com.codev.service;

import java.util.List;

import com.codev.model.Client;

public interface IClientService {
	List<Client> findAll();

	Client create(Client client);

	Client find(Long id);

	Client update(Client client);

	int delete(Long id);

}
