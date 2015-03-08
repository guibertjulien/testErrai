package com.bergui.errai.client.ui.foo;

import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.inject.Inject;

@Templated("PageLayout.html")
public class LoginLayout extends PageLayout {

   @Inject
   @DataField
   private LoginForm content;

   /* Override footer defined in PageLayout */
	/*
   @Inject
   @DataField
   private CustomFooter footer;*/
 
}
