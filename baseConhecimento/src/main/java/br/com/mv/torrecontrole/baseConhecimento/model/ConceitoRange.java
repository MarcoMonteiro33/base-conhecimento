package br.com.mv.torrecontrole.baseConhecimento.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity
@Table(name = "conceito_range")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, 
property = "conceito")
public class ConceitoRange {
		
	@EmbeddedId // maracação da PK que é uma instancia de ConceitoRangeKey 
	private ConceitoRangeKey conceitoRangeKey;
	
	@ManyToOne
	@MapsId("conceito_id")
	@JoinColumn(name = "conceito_id")
	private Conceito conceito;
	
	@ManyToOne
	@MapsId("range_id")
	@JoinColumn(name ="range_id")
	private Range range;
	
	private String classificacao;
	
	private String analiseAtual;
	
	private String melhoria;

	public ConceitoRangeKey getConceitoRangeKey() {
		return conceitoRangeKey;
	}
	
	

	public ConceitoRange() {
		}



	public ConceitoRange(Conceito conceito, String classificacao,
			String analiseAtual, String melhoria, Range range) {
		ConceitoRangeKey key = new ConceitoRangeKey();
		key.setConceitoId(conceito.getId());
		key.setRangeId(range.getId());
		this.conceitoRangeKey = key;
		this.range = range;
		this.conceito = conceito;
		this.classificacao = classificacao;
		this.analiseAtual = analiseAtual;
		this.melhoria = melhoria; 
	}



	@Override
	public String toString() {
		return "ConceitoRange [conceitoRangeKey=" + conceitoRangeKey + ", conceito=" + conceito + ", range=" + range
				+ ", classificacao=" + classificacao + ", analiseAtual=" + analiseAtual + ", melhoria=" + melhoria
				+ "]";
	}



	public void setConceitoRangeKey(ConceitoRangeKey conceitoRangeKey) {
		this.conceitoRangeKey = conceitoRangeKey;
	}

	public Conceito getConceito() {
		return conceito;
	}

	public void setConceito(Conceito conceito) {
		this.conceito = conceito;
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

	public String getMelhoria() {
		return melhoria;
	}

	public void setMelhoria(String melhoria) {
		this.melhoria = melhoria;
	}
	
	
	

}
