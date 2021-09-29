package com.projet.stock.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "client")
public class Client {
	  @Override
	public String toString() {
		return "Client [id=" + id + ", code=" + code + ", libelle=" + libelle + ", adresse=" + adresse + ", tel=" + tel
				+ ", email=" + email + ", cree=" + cree + ", soldinit=" + soldinit + ", soldef=" + soldef + "]";
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(long id, int code, String libelle, String adresse, String tel, String email, Date cree,
			float soldinit, float soldef) {
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.adresse = adresse;
		this.tel = tel;
		this.email = email;
		this.cree = cree;
		this.soldinit = soldinit;
		this.soldef = soldef;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
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
	public Date getCree() {
		return cree;
	}
	public void setCree(Date cree) {
		this.cree = cree;
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
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private int code;
	  private String libelle;
	  private String adresse;
	  private String tel;
	  private String email;
	 
	  private Date cree;
	  private float   soldinit;
	  private float   soldef;
}
