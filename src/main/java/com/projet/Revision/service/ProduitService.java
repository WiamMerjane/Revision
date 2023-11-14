package com.projet.Revision.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.Revision.dao.IDao;
import com.projet.Revision.entites.Produit;
import com.projet.Revision.repository.ProduitRepository;


@Service
public class ProduitService  implements IDao <Produit>{
	
	@Autowired
	private ProduitRepository produitRepository;

	@Override
	public Produit create(Produit o) {
		return produitRepository.save(o);
	}

	@Override
	public boolean delete(Produit o) {
		try {
			produitRepository.delete(o);
			return true;
		}
		catch(Exception ex) {
			return false;
		}
	}

	@Override
	public Produit update(Produit o) {
		return produitRepository.save(o);
	}

	@Override
	public List<Produit> findAll() {
		return produitRepository.findAll();
	}

	@Override
	public Produit findById(Long id) {
		return produitRepository.findById(id).orElse(null);

	}
	

}
