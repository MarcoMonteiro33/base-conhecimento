package br.com.mv.torrecontrole.baseConhecimento.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Embeddable
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, 
property = "meta_id")
public class MetaRangeKey implements Serializable{

	private static final long serialVersionUID = 1891776940262124610L;
	
	@Column(name = "meta_id")
	private long metaId;
	
	@Column(name = "range_id")
	private long rangeId;

	public long getMetaId() {
		return metaId;
	}

	public void setMetaId(long metaId) {
		this.metaId = metaId;
	}

	public long getRangeId() {
		return rangeId;
	}

	public void setRangeId(long rangeId) {
		this.rangeId = rangeId;
	}


}
