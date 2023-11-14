package com.projet.Revision.controller;

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

import com.projet.Revision.entites.Client;
import com.projet.Revision.service.ClientService;


@RestController
@RequestMapping("/api/clients")

public class ClientController {
	
	@Autowired
	private ClientService clientService;
	

	@GetMapping
	public List<Client> findAllClient(){
		return clientService.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> findById(@PathVariable Long id) {
		Client Client = clientService.findById(id);
		if(Client == null) {
			return new ResponseEntity<Object>("Client with ID " + id + " not found", HttpStatus.BAD_REQUEST);
		}
		else {
			return ResponseEntity.ok(Client);
		}
	}
	
	@PostMapping
	public Client createClient(@RequestBody Client Client) {
		Client.setId(0L);
		return clientService.create(Client);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateClient(@PathVariable Long id,@RequestBody Client Client) {
//		Client Client = ClientService.findById(id);
		if(clientService.findById(id) == null) {
			return new ResponseEntity<Object>("Client with ID " + id + " not found", HttpStatus.BAD_REQUEST);
		}
		else {
			Client.setId(id);
			return ResponseEntity.ok(clientService.update(Client));
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteClient(@PathVariable Long id){
		Client Client = clientService.findById(id);
		if(Client == null) {
			return new ResponseEntity<Object>("Client with ID " + id + " not found", HttpStatus.BAD_REQUEST);
		}
		else {
			clientService.delete(Client);
			return ResponseEntity.ok("Client has been deleted");
		}
	}

}
