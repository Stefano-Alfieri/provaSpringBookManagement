package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Libro {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String titolo;
	
	@ManyToOne //indica che l'entità libro è il lato proprietario della relazione e che quindi conterrà la chiave esterna (FK) per
	//collegarsi alla tabella categoria o autore. L'annotation @ManyToOne indica che quindi molti libri possono appartenere a 
	//una categoria. 
	
	//L'annotation @JoinColumn(name="category_id") specifica il nome della colonna che nel database rappresenta la chiave esterna
	@JoinColumn(name ="categoria_id")
	private Categoria categoria;
	
	@JoinColumn(name ="autore_id")
	private Autore autore;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Autore getAutore() {
		return autore;
	}

	public void setAutore(Autore autore) {
		this.autore = autore;
	}
	
	
	
}
