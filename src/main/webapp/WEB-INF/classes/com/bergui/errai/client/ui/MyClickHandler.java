package com.bergui.errai.client.ui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;

public class MyClickHandler implements ClickHandler{

	@Override
	public void onClick(ClickEvent event) {
		// TODO Auto-generated method stub
		 Window.alert("Hello World!");
	}

}
