package com.codev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codev.model.Client;
import com.codev.service.IClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

	@Autowired
	IClientService clientService;

	@GetMapping(value = "/list")
	public ResponseEntity<List<Client>> findAll() {
		return new ResponseEntity<List<Client>>(clientService.findAll(), HttpStatus.OK);
	}

	@PostMapping(value = "/save")
	public ResponseEntity<Client> saveClient(@RequestBody Client client) {
		return new ResponseEntity<Client>(clientService.create(client), HttpStatus.OK);

	}

	@DeleteMapping(value = "/delete/{id}")
	public void deleteClient(@PathVariable long id) {
		clientService.delete(id);
	}

	@PutMapping(value = "/actualizar")
	public ResponseEntity<Client> updateClient(@RequestBody Client client) {
		return new ResponseEntity<Client>(clientService.update(client), HttpStatus.OK);
	}

	@GetMapping(value = "list/{id}")
	public ResponseEntity<Client> clientById(@PathVariable long id) {
		return new ResponseEntity<Client>(clientService.find(id), HttpStatus.OK);
	}
}
