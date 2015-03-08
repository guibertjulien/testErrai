package com.bergui.errai.client.ui.jsInterface;
 
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
interface MyJsInterface {
	@JsProperty
	int getX();
}
/*
class MyJsImpl implements MyJsInterface {
	public int getX() {
		return 42;
	}
}*/
