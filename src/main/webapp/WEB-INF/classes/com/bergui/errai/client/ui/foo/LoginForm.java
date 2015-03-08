package com.bergui.errai.client.ui.foo;

import javax.annotation.PostConstruct;

import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;

@Templated("LoginForm.html#login-form")
public class LoginForm extends Composite {
	// This element must be initialized manually because Element is not
	// @Inject-able*/
	/*@DataField
	private Element form = DOM.createForm();
*/
	// If not otherwise specified, the name to match in the HTML template
	// defaults to the name of the field; in this case, the name would be
	// "username"
	@Inject
	@DataField
	private TextBox username;

	// The name to reference in the template can also be specified manually
	@Inject
	@DataField
	private PasswordTextBox password;
	
	@PostConstruct
	public final void init() {
		username.setText("bergui");
	}
}