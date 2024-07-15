package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Categoria;
import com.example.demo.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorie")
public class CategoriaController {
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	public List<Categoria> getAllCategorie(){
		return categoriaRepository.findAll();
	}
	
	@PostMapping
	public Categoria createCategoria(@RequestBody Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
}
