package com.projet.Revision.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.Revision.entites.LigneFacture;

@Repository
public interface LigneFactureRepository extends JpaRepository <LigneFacture,Long>{

}
