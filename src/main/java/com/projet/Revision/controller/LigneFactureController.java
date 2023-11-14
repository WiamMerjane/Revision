//package com.projet.Revision.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.projet.Revision.entites.LigneFacture;
//import com.projet.Revision.service.LigneFactureService;
//
//
//@RestController
//@RequestMapping("/api/ligneFacture")
//
//public class LigneFactureController {
//	
//	@Autowired
//	private LigneFactureService LigneFactureService;
//	
//
//	@GetMapping
//	public List<LigneFacture> findAllLigneFacture(){
//		return LigneFactureService.findAll();
//	}
//	
//	@GetMapping("/{id}")
//	public ResponseEntity<Object> findById(@PathVariable Long id) {
//		LigneFacture LigneFacture = LigneFactureService.findById(id);
//		if(LigneFacture == null) {
//			return new ResponseEntity<Object>("LigneFacture with ID " + id + " not found", HttpStatus.BAD_REQUEST);
//		}
//		else {
//			return ResponseEntity.ok(LigneFacture);
//		}
//	}
//	
//	@PostMapping
//	public LigneFacture createLigneFacture(@RequestBody LigneFacture LigneFacture) {
//		LigneFacture.setId(0L);
//		return LigneFactureService.create(LigneFacture);
//	}
//	
//	@PutMapping("/{id}")
//	public ResponseEntity<Object> updateLigneFacture(@PathVariable Long id,@RequestBody LigneFacture LigneFacture) {
////		LigneFacture LigneFacture = LigneFactureService.findById(id);
//		if(LigneFactureService.findById(id) == null) {
//			return new ResponseEntity<Object>("LigneFacture with ID " + id + " not found", HttpStatus.BAD_REQUEST);
//		}
//		else {
//			LigneFacture.setId(id);
//			return ResponseEntity.ok(LigneFactureService.update(LigneFacture));
//		}
//	}
//	
//	@DeleteMapping("/{id}")
//	public ResponseEntity<Object> deleteLigneFacture(@PathVariable Long id){
//		LigneFacture LigneFacture = LigneFactureService.findById(id);
//		if(LigneFacture == null) {
//			return new ResponseEntity<Object>("LigneFacture with ID " + id + " not found", HttpStatus.BAD_REQUEST);
//		}
//		else {
//			LigneFactureService.delete(LigneFacture);
//			return ResponseEntity.ok("LigneFacture has been deleted");
//		}
//	}
//
//}
