package com.bergui.errai.client.ui.model;

import org.jboss.errai.databinding.client.api.Bindable;

@Bindable
public class Step {

	private String city;

	public Step(String city) {
		super();
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Step() {
		super();
		// TODO Auto-generated constructor stub
	}

}
