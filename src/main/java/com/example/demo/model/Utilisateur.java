package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "UTILISATEUR")
public class Utilisateur {
	
	public Utilisateur() {
		
	}
	
	public Utilisateur(String nom,String prenom,String password, String username) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.username = username;	
		};
	

	private String nom;
	private String prenom;
	private String password;
	private String username;
	
	

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		
		return this.prenom;
	}
	public void setUsername(String username) {
		this.username = username;
	}


}
