package com.bergui.errai.client;

//Add the package declaration here

import javax.annotation.PostConstruct;

import org.jboss.errai.ioc.client.api.EntryPoint;

import com.bergui.errai.client.ui.TripPage;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.inject.Inject;

@EntryPoint
public class App {
	
	@Inject
	private TripPage tripPage;

	@PostConstruct
	public void init() {
		System.out.println("BEGIN");
		
		//RootPanel.get().add(loginLayout);
		RootPanel.get().add(tripPage);
		
		System.out.println("END");
	}
}
