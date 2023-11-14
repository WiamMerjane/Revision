package com.projet.Revision.entites;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class LigneFacture {
	
	@EmbeddedId
	private LigneFactureKey id;
	
	private int quantite;
	
	@ManyToOne
	@JoinColumn(name="facture",referencedColumnName="id",insertable = false,updatable = false)
	private Facture facture;
	
	@ManyToOne
	@JoinColumn(name="produit",referencedColumnName="id",insertable = false,updatable = false)
	private Produit produit;
	
	public LigneFacture() {
		
	}

	public LigneFacture(LigneFactureKey id, int quantite, Facture facture, Produit produit) {
		
		this.id = id;
		this.quantite = quantite;
		this.facture = facture;
		this.produit = produit;
	}

	public LigneFactureKey getId() {
		return id;
	}

	public void setId(LigneFactureKey id) {
		this.id = id;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	
	

	
	
	
	
	

}
