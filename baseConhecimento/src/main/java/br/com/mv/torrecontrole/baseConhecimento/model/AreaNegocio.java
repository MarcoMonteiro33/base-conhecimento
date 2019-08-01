package br.com.mv.torrecontrole.baseConhecimento.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "area_negocio")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, 
property = "id")
public class AreaNegocio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String descricao;
	
	@OneToMany(mappedBy = "areaNegocio")
	private List<AreaNegocioRange> areaNegocioRange =   new ArrayList<AreaNegocioRange>();
	
	

	@Override
	public String toString() {
		return "AreaNegocio [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", areaNegocioRange="
				+ areaNegocioRange + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public List<AreaNegocioRange> getAreaNegocioRange() {
		return areaNegocioRange;
	}

	public void setAreaNegocioRange(List<AreaNegocioRange> areaNegocioRange) {
		this.areaNegocioRange = areaNegocioRange;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
