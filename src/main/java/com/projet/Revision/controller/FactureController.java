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

import com.projet.Revision.entites.Facture;
import com.projet.Revision.service.FactureService;


@RestController
@RequestMapping("/api/factures")
public class FactureController {
	@Autowired
	private FactureService factureService;
	

	@GetMapping
	public List<Facture> findAllFacture(){
		return factureService.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> findById(@PathVariable Long id) {
		Facture Facture = factureService.findById(id);
		if(Facture == null) {
			return new ResponseEntity<Object>("Facture with ID " + id + " not found", HttpStatus.BAD_REQUEST);
		}
		else {
			return ResponseEntity.ok(Facture);
		}
	}
	
	@PostMapping
	public Facture createFacture(@RequestBody Facture Facture) {
		Facture.setId(0L);
		return factureService.create(Facture);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateFacture(@PathVariable Long id,@RequestBody Facture Facture) {
//		Facture Facture = FactureService.findById(id);
		if(factureService.findById(id) == null) {
			return new ResponseEntity<Object>("Facture with ID " + id + " not found", HttpStatus.BAD_REQUEST);
		}
		else {
			Facture.setId(id);
			return ResponseEntity.ok(factureService.update(Facture));
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteFacture(@PathVariable Long id){
		Facture Facture = factureService.findById(id);
		if(Facture == null) {
			return new ResponseEntity<Object>("Facture with ID " + id + " not found", HttpStatus.BAD_REQUEST);
		}
		else {
			factureService.delete(Facture);
			return ResponseEntity.ok("Facture has been deleted");
		}
	}

}
