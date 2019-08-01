package br.com.mv.torrecontrole.baseConhecimento.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.mv.torrecontrole.baseConhecimento.model.AreaNegocioRange;

public class DiagnosticoAreaNegocioDto {
	
	private Long areaNegocioId;
	
	private String areaNegocio;
	
	private Long rangeId;
	
	private String range;
	
	private String analise_atual;
	
	private String classificacao;
	
	private String melhorias;
	
	

	public DiagnosticoAreaNegocioDto() {

	}

	public DiagnosticoAreaNegocioDto(AreaNegocioRange areaNegocioRange) {
		this.areaNegocioId = areaNegocioRange.getAreaNegocio().getId();
		this.areaNegocio = areaNegocioRange.getAreaNegocio().getNome();
		this.rangeId = areaNegocioRange.getRange().getId();
		this.range = areaNegocioRange.getRange().getNome();
		this.analise_atual = areaNegocioRange.getAnaliseAtual();
		this.classificacao = areaNegocioRange.getClassificacao();
		this.melhorias = areaNegocioRange.getMelhorias();
	}
															   
	public static List<DiagnosticoAreaNegocioDto> convert(List<AreaNegocioRange> areaNegocioRanges){
		return areaNegocioRanges.stream().map(DiagnosticoAreaNegocioDto::new).collect(Collectors.toList());
	}

	public Long getAreaNegocioId() {
		return areaNegocioId;
	}

	public void setAreaNegocioId(Long areaNegocioId) {
		this.areaNegocioId = areaNegocioId;
	}

	public String getAreaNegocio() {
		return areaNegocio;
	}

	public void setAreaNegocio(String areaNegocio) {
		this.areaNegocio = areaNegocio;
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

	public String getAnalise_atual() {
		return analise_atual;
	}

	public void setAnalise_atual(String analise_atual) {
		this.analise_atual = analise_atual;
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
	

}
