package com.bergui.errai.client.ui;

import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.bergui.errai.client.ui.widget.PaperIconButtonWidget;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.inject.Inject;

@Templated("StepWidget.html")
public class StepWidget extends Composite {

	private String stepName;

	@Inject
	@DataField
	private Label name;

	@Inject
	@DataField("button_delete_step")
	private PaperIconButtonWidget button_delete_step;

	public StepWidget() {
		super();
		//this.addDomHandler(new MyClickHandler(), ClickEvent.getType());
	}

	public String getStepName() {
		return stepName;
	}

	public void setStepName(String stepName) {
		this.stepName = stepName;
	}

	public void init(String stepName) {
		this.stepName = stepName;
		name.setText(stepName);
	}

	@EventHandler("button_delete_step")
	public void onDelete(ClickEvent e) {
		this.removeFromParent();
	}
}
