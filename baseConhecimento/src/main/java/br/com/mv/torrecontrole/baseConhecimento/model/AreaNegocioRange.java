package br.com.mv.torrecontrole.baseConhecimento.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, 
property = "areaNegocio")
public class AreaNegocioRange {
	
	@EmbeddedId
	private AreaNegocioRangeKey areaNegocioRangeKey;

	@ManyToOne
	@MapsId(value = "area_negocio_id")
	@JoinColumn(name = "area_negocio_id")
	private AreaNegocio areaNegocio;
	
	@ManyToOne
	@MapsId(value = "range_id")
	@JoinColumn(name = "range_id")
	private Range range;
	
	private String classificacao;
	
	private String analiseAtual;
	
	private String melhorias;
	
	
	public AreaNegocioRange() {

	}
	
	
	public AreaNegocioRange(AreaNegocio areaNegocio, Range range,
			String classificacao, String analiseAtual, String melhorias) {
		AreaNegocioRangeKey key = new AreaNegocioRangeKey();
		key.setAreaNegocioId(areaNegocio.getId());
		key.setRangeId(range.getId());
		this.areaNegocioRangeKey = key;
		this.areaNegocio = areaNegocio;
		this.range = range;
		this.classificacao = classificacao;
		this.analiseAtual = analiseAtual;
		this.melhorias = melhorias;
	}


	public AreaNegocioRangeKey getAreaNegocioRangeKey() {
		return areaNegocioRangeKey;
	}

	public void setAreaNegocioRangeKey(AreaNegocioRangeKey areaNegocioRangeKey) {
		this.areaNegocioRangeKey = areaNegocioRangeKey;
	}

	public AreaNegocio getAreaNegocio() {
		return areaNegocio;
	}

	public void setAreaNegocio(AreaNegocio areaNegocio) {
		this.areaNegocio = areaNegocio;
	}

	public Range getRange() {
		return range;
	}

	public void setRange(Range range) {
		this.range = range;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getAnaliseAtual() {
		return analiseAtual;
	}

	public void setAnaliseAtual(String analiseAtual) {
		this.analiseAtual = analiseAtual;
	}

	public String getMelhorias() {
		return melhorias;
	}

	public void setMelhorias(String melhorias) {
		this.melhorias = melhorias;
	}
	
		

}
