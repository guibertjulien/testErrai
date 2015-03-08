package com.bergui.errai.client.ui;

import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.gwt.user.client.ui.Composite;
import com.google.inject.Inject;

@Templated("TripPage.html#app-template")
public class TripPage extends Composite {

	public TripPage() {
		super();
	}

	@Inject
	@DataField
	private CarnetRoute carnet_route;
}
