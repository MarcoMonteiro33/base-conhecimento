package br.com.mv.torrecontrole.baseConhecimento.resources.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.mv.torrecontrole.baseConhecimento.model.Conceito;
import br.com.mv.torrecontrole.baseConhecimento.model.ConceitoRange;
import br.com.mv.torrecontrole.baseConhecimento.model.Range;
import br.com.mv.torrecontrole.baseConhecimento.repository.ConceitoRepository;
import br.com.mv.torrecontrole.baseConhecimento.repository.RangeRepository;

public class DiagnosticoConceitoForm {
	
	@NotNull @NotEmpty
	private long id;
	@NotNull @NotEmpty
	private long idRange;
	@NotNull @NotEmpty @Length(min = 30) @Length(max = 150)
	private String conceito;
	@NotNull @NotEmpty @Length(max = 150)
	private String range;
	@NotNull @NotEmpty @Length(min = 30) @Length(max = 150)
	private String descricao;
	@NotNull @NotEmpty @Length(min = 30) @Length(max = 150)
	private String analiseAtual;
	@NotNull @NotEmpty @Length(min = 30) @Length(max = 150)
	private String classificacao;
	@NotNull @NotEmpty @Length(min = 30) @Length(max = 150)
	private String melhoria;
	
	public ConceitoRange convert(ConceitoRepository conceitoRepository, RangeRepository rangeRepository) {
		Conceito conceito = conceitoRepository.findById(id);
		Range range = rangeRepository.findById(idRange);
		return new ConceitoRange(conceito, classificacao, analiseAtual, melhoria, range);
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getConceito() {
		return conceito;
	}
	public void setConceito(String conceito) {
		this.conceito = conceito;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAnaliseAtual() {
		return analiseAtual;
	}
	public void setAnaliseAtual(String analiseAtual) {
		this.analiseAtual = analiseAtual;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public String getMelhoria() {
		return melhoria;
	}
	public void setMelhoria(String melhoria) {
		this.melhoria = melhoria;
	}

	public long getIdRange() {
		return idRange;
	}

	public void setIdRange(long idRange) {
		this.idRange = idRange;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}
	
	

	
}
