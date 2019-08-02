package br.com.mv.torrecontrole.baseConhecimento.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(schema = "mvbike",name = "range_diagnostico")
public class Range {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_range_diagnostico")
	@SequenceGenerator(sequenceName = "mvbike.seq_range_diagnostico", allocationSize = 1,name = "seq_range_diagnostico")
	@Column(name = "cd_range_diagnostico")
	private Long id;
	
	@NotBlank(message = "Não é possível Inserir nome vazio")
	@Column(name = "nm_range_diagnostico")
	private String nome;
	
	@NotBlank(message = "Não é possível Inserir descricao vazio")
	@Column(name = "nm_range_diagnostico")
	private String descricao;

	@Column(name = "nr_valor_inicial")
	private Long nrValorInicial;

	@Column(name = "nr_valor_final")
	private Long nrValorFinal;

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

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNrValorInicial() {
		return nrValorInicial;
	}

	public void setNrValorInicial(Long nrValorInicial) {
		this.nrValorInicial = nrValorInicial;
	}

	public Long getNrValorFinal() {
		return nrValorFinal;
	}

	public void setNrValorFinal(Long nrValorFinal) {
		this.nrValorFinal = nrValorFinal;
	}
}
