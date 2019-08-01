package br.com.mv.torrecontrole.baseConhecimento.resources.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.mv.torrecontrole.baseConhecimento.model.Meta;
import br.com.mv.torrecontrole.baseConhecimento.model.MetaRange;
import br.com.mv.torrecontrole.baseConhecimento.model.Range;
import br.com.mv.torrecontrole.baseConhecimento.repository.MetaRepository;
import br.com.mv.torrecontrole.baseConhecimento.repository.RangeRepository;

public class DiagnosticoMetaForm {
	
	@NotNull @NotEmpty
	private long metaId;
	@NotNull @NotEmpty @Length(min = 30) @Length(max = 150)
	private String meta;
	@NotNull @NotEmpty
	private long rangeId;
	@NotNull @NotEmpty @Length(min = 30) @Length(max = 150)
	private String range;
	@NotNull @NotEmpty @Length(min = 30) @Length(max = 150)
	private String analiseAtual;
	@NotNull @NotEmpty @Length(min = 30) @Length(max = 150)
	private String classificacao;
	@NotNull @NotEmpty @Length(min = 30) @Length(max = 150)
	private String melhorias;
	
	public MetaRange convert(MetaRepository metaRepository, RangeRepository rangeRepository) {
		System.out.println("entrou aqui");
		System.out.println(" metaid: "+this.metaId+ " meta: "+this.meta+" rangeId: "+this.rangeId+" analiseAtual: "+analiseAtual+" classificacao: "+classificacao+" melhorias: "+melhorias );
		Meta meta = metaRepository.findById(this.metaId);
		Range range = rangeRepository.findById(this.rangeId);
		System.out.println("meta TO "+meta.toString());
		System.out.println("range TO "+range.toString());
		return new MetaRange(meta, range, classificacao, analiseAtual, melhorias);
	}
	
	
	@Override
	public String toString() {
		return "DiagnosticoMetaForm [metaId=" + metaId + ", meta=" + meta + ", rangeId=" + rangeId + ", range=" + range
				+ ", analiseAtual=" + analiseAtual + ", classificacao=" + classificacao + ", melhorias=" + melhorias
				+ "]";
	}

	public void setRangeId(long rangeId) {
		this.rangeId = rangeId;
	}

	public long getMetaId() {
		return metaId;
	}

	public void setMetaId(long metaId) {
		this.metaId = metaId;
	}

	public String getMeta() {
		return meta;
	}

	public void setMeta(String meta) {
		this.meta = meta;
	}

	public Long getRangeId() {
		return rangeId;
	}

	public void setRangeId(Long rangeId) {
		this.rangeId = rangeId;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getMelhorias() {
		return melhorias;
	}

	public void setMelhorias(String melhorias) {
		this.melhorias = melhorias;
	}


	public String getAnaliseAtual() {
		return analiseAtual;
	}


	public void setAnaliseAtual(String analiseAtual) {
		this.analiseAtual = analiseAtual;
	}
	
	
	
	

}
