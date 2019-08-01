package br.com.mv.torrecontrole.baseConhecimento.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.mv.torrecontrole.baseConhecimento.model.ConceitoRange;

public class DiagnosticoConceitoDto {
	
	private Long id;
	private String conceito;
	private String descricao;
	private Long idRange;
	private String range;
	private String analiseAtual;
	private String classificacao;
	private String melhoria;

	public DiagnosticoConceitoDto(ConceitoRange conceitoRange) {
		this.id = conceitoRange.getConceito().getId();
		this.conceito = conceitoRange.getConceito().getNome();
		this.descricao = conceitoRange.getConceito().getDescricao();
		this.analiseAtual = conceitoRange.getAnaliseAtual();
		this.classificacao = conceitoRange.getClassificacao();
		this.melhoria = conceitoRange.getMelhoria();
		this.idRange = conceitoRange.getRange().getId();
		this.range = conceitoRange.getRange().getNome();
	}
	
	public DiagnosticoConceitoDto() {
	// TODO Auto-generated constructor stub
	}
	
	public static List<DiagnosticoConceitoDto> converte(List<ConceitoRange> conceitoRanges){
		return conceitoRanges.stream().map(DiagnosticoConceitoDto::new).collect(Collectors.toList());
	
	}

	

	
	@Override
	public String toString() {
		return "DiagnosticoConceitoDto [id=" + id + ", conceito=" + conceito + ", descricao=" + descricao + ", idRange="
				+ idRange + ", range=" + range + ", analiseAtual=" + analiseAtual + ", classificacao=" + classificacao
				+ ", melhoria=" + melhoria + "]";
	}

	public Long getId() {
		return id;
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

	public String getConceito() {
		return conceito;
	}

	public String getDescricao() {
		return descricao;
	}

	public Long getIdRange() {
		return idRange;
	}

	public String getRange() {
		return range;
	}
	
	

}
