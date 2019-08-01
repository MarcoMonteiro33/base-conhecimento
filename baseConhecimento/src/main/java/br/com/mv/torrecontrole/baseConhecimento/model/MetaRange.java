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
property = "meta")
public class MetaRange {
	
	@EmbeddedId
	private MetaRangeKey metaRangeKey;
	
	@ManyToOne
	@MapsId(value = "meta_id")
	@JoinColumn(name = "meta_id")
	private Meta meta;
	
	@ManyToOne
	@MapsId(value = "range_id")
	@JoinColumn(name = "range_id")
	private Range range;
	
	private String classificacao;
	
	private String analiseAtual;
	
	private String melhorias;
	
	public MetaRange() {
	}

	public MetaRange(Meta meta, Range range, String classificacao, String analiseAtual,
			String melhorias) {
		System.out.println("META_RANGE: "+meta.toString());
		System.out.println("RANGE_RANGE: "+range.toString());
		MetaRangeKey key = new MetaRangeKey();
		key.setMetaId(meta.getId());
		key.setRangeId(range.getId());
		this.metaRangeKey = key;
		this.meta = meta;
		this.range = range;
		this.classificacao = classificacao;
		this.analiseAtual = analiseAtual;
		this.melhorias = melhorias;
	}

	public MetaRangeKey getMetaRangeKey() {
		return metaRangeKey;
	}

	public void setMetaRangeKey(MetaRangeKey metaRangeKey) {
		this.metaRangeKey = metaRangeKey;
	}

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
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
