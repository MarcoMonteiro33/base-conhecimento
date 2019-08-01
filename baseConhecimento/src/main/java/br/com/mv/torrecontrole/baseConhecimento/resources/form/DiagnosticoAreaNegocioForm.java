package br.com.mv.torrecontrole.baseConhecimento.resources.form;

import br.com.mv.torrecontrole.baseConhecimento.model.AreaNegocio;
import br.com.mv.torrecontrole.baseConhecimento.model.AreaNegocioRange;
import br.com.mv.torrecontrole.baseConhecimento.model.Range;
import br.com.mv.torrecontrole.baseConhecimento.repository.AreaNegocioRepository;
import br.com.mv.torrecontrole.baseConhecimento.repository.RangeRepository;

public class DiagnosticoAreaNegocioForm {
	
	private long id;
	private long idRange;
	private String areaNegocio;
	private String range;
	private String descricao;
	private String analiseAtual;
	private String classificacao;
	private String melhoria;
	
	public AreaNegocioRange convert(AreaNegocioRepository areaNegocioRepository, RangeRepository rangeRepository){
		AreaNegocio areaNegocio = areaNegocioRepository.findAllById(id);
		System.out.println("Log convert DiagnosticoAreaNegocioForm (areaNegocio): "+areaNegocio.toString());
		Range range = rangeRepository.findById(idRange);
		System.out.println("Log convert DiagnosticoAreaNegocioForm (range): "+range.toString());
		return new AreaNegocioRange(areaNegocio, range, classificacao, analiseAtual, melhoria);
	}
	
	
	
	@Override
	public String toString() {
		return "DiagnosticoAreaNegocioForm [id=" + id + ", idRange=" + idRange + ", areaNegocio=" + areaNegocio
				+ ", range=" + range + ", descricao=" + descricao + ", analiseAtual=" + analiseAtual
				+ ", classificacao=" + classificacao + ", melhoria=" + melhoria + "]";
	}



	public void setId(long id) {
		this.id = id;
	}

	public void setIdRange(long idRange) {
		this.idRange = idRange;
	}

	public void setAreaNegocio(String areaNegocio) {
		this.areaNegocio = areaNegocio;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setAnaliseAtual(String analiseAtual) {
		this.analiseAtual = analiseAtual;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public void setMelhoria(String melhoria) {
		this.melhoria = melhoria;
	}

	public long getId() {
		return id;
	}
	public long getIdRange() {
		return idRange;
	}
	public String getAreaNegocio() {
		return areaNegocio;
	}
	public String getRange() {
		return range;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getAnaliseAtual() {
		return analiseAtual;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public String getMelhoria() {
		return melhoria;
	}
	
	
	

}
