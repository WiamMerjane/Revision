package com.projet.Revision.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.Revision.entites.Client;

@Repository
public interface ClientRepository extends JpaRepository <Client, Long> {

}
