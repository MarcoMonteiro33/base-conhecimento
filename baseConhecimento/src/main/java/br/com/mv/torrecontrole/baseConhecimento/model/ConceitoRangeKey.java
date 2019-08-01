package br.com.mv.torrecontrole.baseConhecimento.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Embeddable
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, 
  property = "conceitoId")
public class ConceitoRangeKey implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5861482768956733394L;

	@Column(name = "conceito_id")
	private long conceitoId;
	
	@Column(name = "range_id")
	private long rangeId;

	public long getConceitoId() {
		return conceitoId;
	}

	public void setConceitoId(long conceitoId) {
		this.conceitoId = conceitoId;
	}

	public long getRangeId() {
		return rangeId;
	}

	public void setRangeId(long rangeId) {
		this.rangeId = rangeId;
	}
	
	

}
