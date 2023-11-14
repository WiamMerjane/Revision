package com.projet.Revision.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.Revision.entites.Produit;

@Repository
public interface ProduitRepository extends JpaRepository <Produit, Long> {

}
