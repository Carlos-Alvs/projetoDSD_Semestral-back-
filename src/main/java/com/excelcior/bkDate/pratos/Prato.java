package com.excelcior.bkDate.pratos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.excelcior.bkDate.restaurantes.Restaurante;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Prato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private Double preco;
	
	@NotNull
	private String nome;
	private String tipo;
	private String listaDeIngredientes;
	private Integer serveQuantas;
	
	@ManyToOne
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Restaurante restaurante;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getListaDeIngredientes() {
		return listaDeIngredientes;
	}
	public void setListaDeIngredientes(String listaDeIngredientes) {
		this.listaDeIngredientes = listaDeIngredientes;
	}
	public Integer getServeQuantas() {
		return serveQuantas;
	}
	public void setServeQuantas(Integer serveQuantas) {
		this.serveQuantas = serveQuantas;
	}
	
}
