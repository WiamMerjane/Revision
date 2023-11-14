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

import com.projet.Revision.entites.Produit;
import com.projet.Revision.service.ProduitService;

@RestController
@RequestMapping("/api/produits")

public class ProduitController {
	
	@Autowired
	
	private  ProduitService ProduitService;
	

	@GetMapping
	public List<Produit> findAllProduit(){
		return ProduitService.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> findById(@PathVariable Long id) {
		Produit Produit = ProduitService.findById(id);
		if(Produit == null) {
			return new ResponseEntity<Object>("Produit with ID " + id + " not found", HttpStatus.BAD_REQUEST);
		}
		else {
			return ResponseEntity.ok(Produit);
		}
	}
	
	@PostMapping
	public Produit createProduit(@RequestBody Produit Produit) {
		Produit.setId(0L);
		return ProduitService.create(Produit);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateProduit(@PathVariable Long id,@RequestBody Produit Produit) {
//		Produit Produit = ProduitService.findById(id);
		if(ProduitService.findById(id) == null) {
			return new ResponseEntity<Object>("Produit with ID " + id + " not found", HttpStatus.BAD_REQUEST);
		}
		else {
			Produit.setId(id);
			return ResponseEntity.ok(ProduitService.update(Produit));
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteProduit(@PathVariable Long id){
		Produit Produit = ProduitService.findById(id);
		if(Produit == null) {
			return new ResponseEntity<Object>("Produit with ID " + id + " not found", HttpStatus.BAD_REQUEST);
		}
		else {
			ProduitService.delete(Produit);
			return ResponseEntity.ok("Produit has been deleted");
		}
	}

}
