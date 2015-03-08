package com.bergui.errai.client.ui;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Instance;

import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.bergui.errai.client.service.MapsService;
import com.bergui.errai.client.ui.widget.PaperButtonWidget;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.inject.Inject;

@Templated("CarnetRoute.html#carnet-route")
public class CarnetRoute extends Composite {
/*
	@Inject
	@DataField
	private CoreSelector<StepWidget> core_selector;
*/
	@Inject
	@DataField
	private VerticalPanel dyn;
	
	@Inject
	@DataField
	private PaperButtonWidget button_add_step;

	@Inject
	Instance<StepWidget> instance;
	
	@Inject
	@DataField
	TextBox textBox_autocomplete;
	
	@Inject
	private MapsService mapsService;

	public StepWidget getNewComponent() {
		return instance.get();
	}

	private String[] steps = new String[] { "PARIS", "SAN FRANCISCO",
			"LOS ANGELES" };

	@PostConstruct
	public void init() {
		
		button_add_step.setVisible(false);
		
		mapsService.initialize(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				mapsService.initialize();
			}
		});
/*		
		textBox_autocomplete.getElement().setPropertyString(
				"placeholder", "Une ville, un lieu...");
		textBox_autocomplete.getElement().setPropertyString("type",
				"search");
*/		
		
/*		button_ko = new Button("BUTTON_KO");
		
		button_ok.addClickHandler(new MyClickHandler());
		button_ko.addClickHandler(new MyClickHandler());
		
		dyn.add(button_ko);*/
		
		//this.getElement().appendChild(button_ko.getElement());
	}
	
	//@PostConstruct
	//public void init() {
	//	for (String step : steps) {
	//		StepWidget stepWidget = instance.get();
	//		stepWidget.init(step);
	//		core_selector.addValue(stepWidget);
	//	}
	//}

	@EventHandler("textBox_autocomplete")
	private void onClick(FocusEvent e) {
		
		button_add_step.setVisible(true);
	}
	
	@EventHandler("button_add_step")
	private void onAdd(ClickEvent e) {
		if (!textBox_autocomplete.getText().isEmpty()) {
			StepWidget stepWidget = getNewComponent();
			stepWidget.init(textBox_autocomplete.getText());
			//core_selector.addValue(stepWidget);
			dyn.add(stepWidget);
			
			textBox_autocomplete.setText("");
			//Window.alert(String.valueOf(stepWidget.isAttached()));
		}
	}

}
