package com.projet.stock.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "article")
@JsonInclude(value=Include.NON_NULL)
public class Article {

	
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private String code;
	  
	  private String libelle;
	  private float pa;
	  private float pv;
	  
	  
	  private int stock;
	  private int stkinit;
	  private String ccateg;
	  private String cscateg;
	  private String fileName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public float getPa() {
		return pa;
	}
	public void setPa(float pa) {
		this.pa = pa;
	}
	public float getPv() {
		return pv;
	}
	public void setPv(float pv) {
		this.pv = pv;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getStkinit() {
		return stkinit;
	}
	public void setStkinit(int stkinit) {
		this.stkinit = stkinit;
	}
	public String getCcateg() {
		return ccateg;
	}
	public void setCcateg(String ccateg) {
		this.ccateg = ccateg;
	}
	public String getCscateg() {
		return cscateg;
	}
	public void setCscateg(String cscateg) {
		this.cscateg = cscateg;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Article(long id, String code, String libelle, float pa, float pv, int stock, int stkinit, String ccateg,
			String cscateg, String fileName) {
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.pa = pa;
		this.pv = pv;
		this.stock = stock;
		this.stkinit = stkinit;
		this.ccateg = ccateg;
		this.cscateg = cscateg;
		this.fileName = fileName;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", code=" + code + ", libelle=" + libelle + ", pa=" + pa + ", pv=" + pv
				+ ", stock=" + stock + ", stkinit=" + stkinit + ", ccateg=" + ccateg + ", cscateg=" + cscateg
				+ ", fileName=" + fileName + "]";
	}
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	  
	  
}
