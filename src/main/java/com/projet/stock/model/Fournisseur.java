package com.projet.stock.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "fournisseur")
public class Fournisseur {

	
    @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private String libelle;
	  
	  private String adresse;
	  private String ville;	  
	  private String tel;
	  private String email;
	 
	  
	  private float   soldinit;
	  private float   soldef;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getSoldinit() {
		return soldinit;
	}
	public void setSoldinit(float soldinit) {
		this.soldinit = soldinit;
	}
	public float getSoldef() {
		return soldef;
	}
	public void setSoldef(float soldef) {
		this.soldef = soldef;
	}
	public Fournisseur(long id, String libelle, String adresse, String ville, String tel, String email, float soldinit,
			float soldef) {
		this.id = id;
		this.libelle = libelle;
		this.adresse = adresse;
		this.ville = ville;
		this.tel = tel;
		this.email = email;
		this.soldinit = soldinit;
		this.soldef = soldef;
	}
	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Fournisseur [id=" + id + ", libelle=" + libelle + ", adresse=" + adresse + ", ville=" + ville + ", tel="
				+ tel + ", email=" + email + ", soldinit=" + soldinit + ", soldef=" + soldef + "]";
	}
	  
	  
}
