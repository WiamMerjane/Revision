package com.projet.Revision.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.Revision.dao.IDao;
import com.projet.Revision.entites.Client;
import com.projet.Revision.repository.ClientRepository;

@Service
public class ClientService implements IDao<Client> {
	
	@Autowired
	private ClientRepository clientRepository;

	@Override
	public Client create(Client o) {
		return clientRepository.save(o);
	}

	@Override
	public boolean delete(Client o) {
		try {
			clientRepository.delete(o);
			return true;
		}
		catch(Exception ex) {
			return false;
		}
	}

	@Override
	public Client update(Client o) {
		return clientRepository.save(o);

	}

	@Override
	public List<Client> findAll() {
		return clientRepository.findAll();
	}

	@Override
	public Client findById(Long id) {
		return clientRepository.findById(id).orElse(null);

	}
	

}
