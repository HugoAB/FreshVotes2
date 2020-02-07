package com.freshvotes.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class VoteId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7978131317174691284L;
	private Users user;
	private Feature feature;
	
	@ManyToOne
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	
	@ManyToOne
	public Feature getFeature() {
		return feature;
	}
	public void setFeature(Feature feature) {
		this.feature = feature;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
