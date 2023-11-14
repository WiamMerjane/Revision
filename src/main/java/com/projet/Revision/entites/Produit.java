package com.projet.Revision.entites;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Produit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String libelle;
	private int prix;
	private int quantite_Stock;
	
	@JsonIgnore
    @OneToMany(mappedBy = "produit")
	private List<LigneFacture> ligneFacture;

	public Produit() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getQuantite_Stock() {
		return quantite_Stock;
	}

	public void setQuantite_Stock(int quantite_Stock) {
		this.quantite_Stock = quantite_Stock;
	}

	public List<LigneFacture> getLigneFacture() {
		return ligneFacture;
	}

	public void setLigneFacture(List<LigneFacture> ligneFacture) {
		this.ligneFacture = ligneFacture;
	}
	
	
	
	
	

	

}
