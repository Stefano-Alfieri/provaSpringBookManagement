package com.example.demo.model;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity //rappresetna un'entità JPA
public class Categoria {
	@Id //indica che il  campo è una primari key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //genra automaticamente un id
	private Long id;
	
	private String nome;//nomse della categoria
	
	@OneToMany(mappedBy="categoria")//vuol dire  che tanti elementi si possono collegare a questa entità
	private List<Libro> libri;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}

	
	
}
