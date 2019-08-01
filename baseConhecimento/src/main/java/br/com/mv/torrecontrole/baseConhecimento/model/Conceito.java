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
@Table(name = "conceito")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, 
  property = "id")
public class Conceito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String descricao;
	
	/**@ManyToMany
	@JoinTable(
	name = "conceito_range", 
	joinColumns = @JoinColumn(name = "conceito_id"), 
	inverseJoinColumns = @JoinColumn(name = "range_id"))
	private List<Range> ranges;**/
	
	@OneToMany(mappedBy = "conceito")
	private List<ConceitoRange> conceitoRange = new ArrayList<ConceitoRange>();
	
	
	
	@Override
	public String toString() {
		return "Conceito [id=" + id + ", nome=" + nome + ", descricao=" + descricao + "]";
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

	/**public List<Range> getRanges() {
		return ranges;
	}

	public void setRanges(List<Range> ranges) {
		this.ranges = ranges;
	}**/

	public List<ConceitoRange> getConceitoRange() {
		return conceitoRange;
	}

	public void setConceitoRange(List<ConceitoRange> conceitoRange) {
		this.conceitoRange = conceitoRange;
	}

	

	
	
	
	

}
