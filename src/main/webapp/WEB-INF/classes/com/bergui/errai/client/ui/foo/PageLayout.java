package com.bergui.errai.client.ui.foo;

import javax.annotation.PostConstruct;

import org.jboss.errai.ui.shared.api.annotations.DataField;

import com.google.gwt.user.client.ui.Composite;
import com.google.inject.Inject;

public class PageLayout extends Composite {

	@Inject
	@DataField
	private FooterComponent footer;

	@PostConstruct
	public final void init() {
		// do some setup
	}

}
