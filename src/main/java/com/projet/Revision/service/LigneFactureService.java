package com.projet.Revision.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.projet.Revision.dao.IDao;
import com.projet.Revision.entites.LigneFacture;
import com.projet.Revision.entites.LigneFacture;
import com.projet.Revision.repository.LigneFactureRepository;

public class LigneFactureService implements IDao<LigneFacture> {
	
	@Autowired
	private LigneFactureRepository ligneFactureRepository;

	@Override
	public LigneFacture create(LigneFacture o) {
		return ligneFactureRepository.save(o);
	}

	@Override
	public boolean delete(LigneFacture o) {
		try {
			ligneFactureRepository.delete(o);
			return true;
		}
		catch(Exception ex) {
			return false;
		}
	}

	@Override
	public LigneFacture update(LigneFacture o) {
		return ligneFactureRepository.save(o);

	}

	@Override
	public List<LigneFacture> findAll() {
		return ligneFactureRepository.findAll();
	}

	@Override
	public LigneFacture findById(Long id) {
		return ligneFactureRepository.findById(id).orElse(null);

	}


}
