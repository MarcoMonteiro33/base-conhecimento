package br.com.mv.torrecontrole.baseConhecimento.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.mv.torrecontrole.baseConhecimento.model.MetaRange;

public class MetaRangeDto {
	
	private Long metaId;
	
	private String meta;
	
	private Long rangeId;
	
	private String range;
	
	private String analise_atual;
	
	private String classificacao;
	
	private String melhorias;
		

	public MetaRangeDto() {

	}
		public MetaRangeDto(MetaRange metaRange){
		this.metaId = metaRange.getMeta().getId();
		this.meta = metaRange.getMeta().getNome();
		this.rangeId = metaRange.getRange().getId();
		this.range = metaRange.getRange().getNome();
		this.analise_atual = metaRange.getAnaliseAtual();
		this.classificacao = metaRange.getClassificacao();
		this.melhorias = metaRange.getMelhorias();
	}
	
	public static List<MetaRangeDto> convert (List<MetaRange> metaRanges){
		return metaRanges.stream().map(MetaRangeDto::new).collect(Collectors.toList());
	}



	public Long getMetaId() {
		return metaId;
	}

	public String getMeta() {
		return meta;
	}

	public Long getRangeId() {
		return rangeId;
	}

	public String getRange() {
		return range;
	}

	public String getAnalise_atual() {
		return analise_atual;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public String getMelhorias() {
		return melhorias;
	}
	
	

}
