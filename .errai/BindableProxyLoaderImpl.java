package org.jboss.errai.databinding.client;

import com.bergui.errai.client.ui.model.Step;
import org.jboss.errai.databinding.client.api.InitialState;
import org.jboss.errai.ui.shared.api.Locale;

public class BindableProxyLoaderImpl implements BindableProxyLoader { public void loadBindableProxies() {
    class com_bergui_errai_client_ui_model_StepProxy extends Step implements BindableProxy {
      private BindableProxyAgent<Step> agent;
      public com_bergui_errai_client_ui_model_StepProxy(InitialState initialState) {
        this(new Step(), initialState);
      }

      public com_bergui_errai_client_ui_model_StepProxy(Step target, InitialState initialState) {
        agent = new BindableProxyAgent<Step>(this, target, initialState);
        agent.propertyTypes.put("city", new PropertyType(String.class, false, false));
        agent.copyValues();
      }

      public BindableProxyAgent getAgent() {
        return agent;
      }

      public void updateWidgets() {
        agent.updateWidgetsAndFireEvents();
      }

      public Step unwrap() {
        return agent.target;
      }

      public Step deepUnwrap() {
        final Step clone = new Step();
        clone.setCity(agent.target.getCity());
        return clone;
      }

      public boolean equals(Object obj) {
        if (obj instanceof com_bergui_errai_client_ui_model_StepProxy) {
          obj = ((com_bergui_errai_client_ui_model_StepProxy) obj).unwrap();
        }
        return agent.target.equals(obj);
      }

      public int hashCode() {
        return agent.target.hashCode();
      }

      public String toString() {
        return agent.target.toString();
      }

      public String getCity() {
        return agent.target.getCity();
      }

      public void setCity(String city) {
        String oldValue = agent.target.getCity();
        agent.target.setCity(city);
        agent.updateWidgetsAndFireEvent("city", oldValue, city);
      }

      public Object get(String property) {
        if (property.equals("city")) {
          return getCity();
        }
        throw new NonExistingPropertyException(property);
      }

      public void set(String property, Object value) {
        if (property.equals("city")) {
          agent.target.setCity((String) value);
          return;
        }
        throw new NonExistingPropertyException(property);
      }
    }
    BindableProxyFactory.addBindableProxy(Step.class, new BindableProxyProvider() {
      public BindableProxy getBindableProxy(Object model, InitialState state) {
        return new com_bergui_errai_client_ui_model_StepProxy((Step) model, state);
      }
      public BindableProxy getBindableProxy(InitialState state) {
        return new com_bergui_errai_client_ui_model_StepProxy(state);
      }
    });
    class org_jboss_errai_ui_shared_api_LocaleProxy extends Locale implements BindableProxy {
      private BindableProxyAgent<Locale> agent;
      public org_jboss_errai_ui_shared_api_LocaleProxy(InitialState initialState) {
        this(new Locale(), initialState);
      }

      public org_jboss_errai_ui_shared_api_LocaleProxy(Locale target, InitialState initialState) {
        agent = new BindableProxyAgent<Locale>(this, target, initialState);
        agent.propertyTypes.put("locale", new PropertyType(String.class, false, false));
        agent.propertyTypes.put("label", new PropertyType(String.class, false, false));
        agent.copyValues();
      }

      public BindableProxyAgent getAgent() {
        return agent;
      }

      public void updateWidgets() {
        agent.updateWidgetsAndFireEvents();
      }

      public Locale unwrap() {
        return agent.target;
      }

      public Locale deepUnwrap() {
        final Locale clone = new Locale();
        clone.setLocale(agent.target.getLocale());
        clone.setLabel(agent.target.getLabel());
        return clone;
      }

      public boolean equals(Object obj) {
        if (obj instanceof org_jboss_errai_ui_shared_api_LocaleProxy) {
          obj = ((org_jboss_errai_ui_shared_api_LocaleProxy) obj).unwrap();
        }
        return agent.target.equals(obj);
      }

      public int hashCode() {
        return agent.target.hashCode();
      }

      public String toString() {
        return agent.target.toString();
      }

      public String getLocale() {
        return agent.target.getLocale();
      }

      public void setLocale(String locale) {
        String oldValue = agent.target.getLocale();
        agent.target.setLocale(locale);
        agent.updateWidgetsAndFireEvent("locale", oldValue, locale);
      }

      public String getLabel() {
        return agent.target.getLabel();
      }

      public void setLabel(String label) {
        String oldValue = agent.target.getLabel();
        agent.target.setLabel(label);
        agent.updateWidgetsAndFireEvent("label", oldValue, label);
      }

      public Object get(String property) {
        if (property.equals("locale")) {
          return getLocale();
        }
        if (property.equals("label")) {
          return getLabel();
        }
        throw new NonExistingPropertyException(property);
      }

      public void set(String property, Object value) {
        if (property.equals("locale")) {
          agent.target.setLocale((String) value);
          return;
        }
        if (property.equals("label")) {
          agent.target.setLabel((String) value);
          return;
        }
        throw new NonExistingPropertyException(property);
      }
    }
    BindableProxyFactory.addBindableProxy(Locale.class, new BindableProxyProvider() {
      public BindableProxy getBindableProxy(Object model, InitialState state) {
        return new org_jboss_errai_ui_shared_api_LocaleProxy((Locale) model, state);
      }
      public BindableProxy getBindableProxy(InitialState state) {
        return new org_jboss_errai_ui_shared_api_LocaleProxy(state);
      }
    });
  }
}