package br.com.mv.torrecontrole.baseConhecimento.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Embeddable
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, 
property = "areaNegocioId")
public class AreaNegocioRangeKey implements Serializable{
	
	private static final long serialVersionUID = 3821269077273365163L;

	@Column(name = "area_negocio_id")
	private long areaNegocioId;
	
	@Column(name = "range_id")
	private long rangeId;

	public long getAreaNegocioId() {
		return areaNegocioId;
	}

	public void setAreaNegocioId(long areaNegocioId) {
		this.areaNegocioId = areaNegocioId;
	}

	public long getRangeId() {
		return rangeId;
	}

	public void setRangeId(long rangeId) {
		this.rangeId = rangeId;
	}
	
	
	

}
