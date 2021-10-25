package com.aleDev.CursoSrpingPedidos.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "estado", schema = "public")
public class Estado implements Serializable {
	
public Estado() {
		
	}
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
	this.nome = nome;
}
public List<Cidade> getCidades() {
	return cidades;
}
public void setCidades(List<Cidade> cidades) {
	this.cidades = cidades;
}
public Estado(Long id, String nome, List<Cidade> cidades) {
	super();
	this.id = id;
	this.nome = nome;
	this.cidades = cidades;
}
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

private String nome;
@JsonManagedReference
@OneToMany(mappedBy="estado")
private List<Cidade> cidades;

}
