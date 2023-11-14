package com.projet.Revision.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.Revision.dao.IDao;
import com.projet.Revision.entites.Facture;
import com.projet.Revision.entites.Facture;
import com.projet.Revision.repository.FactureRepository;
import com.projet.Revision.repository.FactureRepository;

@Service
public class FactureService implements IDao<Facture> {
	@Autowired
	private FactureRepository factureRepository;

	@Override
	public Facture create(Facture o) {
		return factureRepository.save(o);
	}

	@Override
	public boolean delete(Facture o) {
		try {
			factureRepository.delete(o);
			return true;
		}
		catch(Exception ex) {
			return false;
		}
	}

	@Override
	public Facture update(Facture o) {
		return factureRepository.save(o);

	}

	@Override
	public List<Facture> findAll() {
		return factureRepository.findAll();
	}

	@Override
	public Facture findById(Long id) {
		return factureRepository.findById(id).orElse(null);

	}

}
