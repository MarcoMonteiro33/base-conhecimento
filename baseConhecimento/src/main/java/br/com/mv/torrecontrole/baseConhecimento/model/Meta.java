package br.com.mv.torrecontrole.baseConhecimento.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "meta")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, 
property = "id")
public class Meta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	private String descricao;
	
	@ManyToOne	
	private AreaNegocio areaNegocio;
	
	@ManyToOne
	private Conceito conceito;
	
	@OneToMany(mappedBy = "meta")
	private List<MetaRange> metaRange = new ArrayList<MetaRange>();
	
	

	@Override
	public String toString() {
		return "Meta [id=" + id + ", nome=" + nome + ", descricao=" + descricao + "]";
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

	public AreaNegocio getAreaNegocio() {
		return areaNegocio;
	}

	public void setAreaNegocio(AreaNegocio areaNegocio) {
		this.areaNegocio = areaNegocio;
	}

	public Conceito getConceito() {
		return conceito;
	}

	public void setConceito(Conceito conceito) {
		this.conceito = conceito;
	}

	public long getId() {
		return id;
	}
	
	

}
