package br.com.mv.torrecontrole.baseConhecimento.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "ranges")
public class Range {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Não é possível Inserir nome vazio")
	private String nome;
	
	@NotBlank(message = "Não é possível Inserir descricao vazio")
	private String descricao;

	/**@ManyToMany(mappedBy = "ranges")
	private List<Conceito> conceitos;**/
	
	@OneToMany(mappedBy = "range")
	private List<ConceitoRange> conceitoRange = new ArrayList<ConceitoRange>();
	
	@OneToMany(mappedBy = "range")
	private List<AreaNegocioRange> areaNegocioRange = new ArrayList<AreaNegocioRange>();
	
	@OneToMany(mappedBy = "range")
	private List<MetaRange> metaRange = new ArrayList<MetaRange>();
	
	
	
	@Override
	public String toString() {
		return "Range [id=" + id + ", nome=" + nome + ", descricao=" + descricao + 
				 ", areaNegocioRange=" + areaNegocioRange + ", metaRange=" + metaRange + "]";
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

	/**public List<Conceito> getConceitos() {
		return conceitos;
	}

	public void setConceitos(List<Conceito> conceitos) {
		this.conceitos = conceitos;
	}**/

	public List<ConceitoRange> getConceitoRange() {
		return conceitoRange;
	}

	public void setConceitoRange(List<ConceitoRange> conceitoRange) {
		this.conceitoRange = conceitoRange;
	}

	public List<AreaNegocioRange> getAreaNegocioRange() {
		return areaNegocioRange;
	}

	public void setAreaNegocioRange(List<AreaNegocioRange> areaNegocioRange) {
		this.areaNegocioRange = areaNegocioRange;
	}

	public List<MetaRange> getMetaRange() {
		return metaRange;
	}

	public void setMetaRange(List<MetaRange> metaRange) {
		this.metaRange = metaRange;
	}	
	
	
	
	
	

}
