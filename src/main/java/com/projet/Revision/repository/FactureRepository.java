package com.projet.Revision.repository;

import org.springframework.stereotype.Repository;

import com.projet.Revision.entites.Facture;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface FactureRepository extends JpaRepository <Facture,Long> {

}
