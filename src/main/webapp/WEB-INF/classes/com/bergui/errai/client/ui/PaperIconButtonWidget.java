package com.bergui.errai.client.ui;

import com.bergui.errai.client.ui.jsInterface.polymer.paperelements.PaperIconButtonElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;

public class PaperIconButtonWidget extends PaperButtonWidget {

	public PaperIconButtonWidget() {
		this(Document.get().createElement(PaperIconButtonElement.TAG));
	}

	protected PaperIconButtonWidget(Element elem) {
		super(elem);
	}
}
