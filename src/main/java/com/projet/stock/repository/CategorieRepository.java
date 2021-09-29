package com.projet.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.stock.model.Categorie;
import com.projet.stock.model.Client;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
