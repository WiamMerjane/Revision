package com.projet.Revision.entites;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public final class LigneFactureKey implements Serializable {
	
	private Long facture;
	private Long produit;
	
	
	public LigneFactureKey() {
		
	}
	


	public LigneFactureKey(Long facture, Long produit) {
		
		this.facture = facture;
		this.produit = produit;
	}




	 public Long getFacture() {
	        return facture;
	    }

	    public void setFacture(Long facture) {
	        this.facture = facture;
	    }

	    public Long getProduit() {
	        return produit;
	    }

	    public void setProduit(Long produit) {
	        this.produit = produit;
	    }
	

}
