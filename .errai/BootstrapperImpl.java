package org.jboss.errai.ioc.client;

import com.bergui.errai.client.App;
import com.bergui.errai.client.service.MapsService;
import com.bergui.errai.client.ui.CarnetRoute;
import com.bergui.errai.client.ui.StepWidget;
import com.bergui.errai.client.ui.TripPage;
import com.bergui.errai.client.ui.widget.PaperButtonWidget;
import com.bergui.errai.client.ui.widget.PaperIconButtonWidget;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.editor.client.IsEditor;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.event.dom.client.HasAllDragAndDropHandlers;
import com.google.gwt.event.dom.client.HasAllFocusHandlers;
import com.google.gwt.event.dom.client.HasAllGestureHandlers;
import com.google.gwt.event.dom.client.HasAllKeyHandlers;
import com.google.gwt.event.dom.client.HasAllMouseHandlers;
import com.google.gwt.event.dom.client.HasAllTouchHandlers;
import com.google.gwt.event.dom.client.HasBlurHandlers;
import com.google.gwt.event.dom.client.HasChangeHandlers;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.HasDoubleClickHandlers;
import com.google.gwt.event.dom.client.HasDragEndHandlers;
import com.google.gwt.event.dom.client.HasDragEnterHandlers;
import com.google.gwt.event.dom.client.HasDragHandlers;
import com.google.gwt.event.dom.client.HasDragLeaveHandlers;
import com.google.gwt.event.dom.client.HasDragOverHandlers;
import com.google.gwt.event.dom.client.HasDragStartHandlers;
import com.google.gwt.event.dom.client.HasDropHandlers;
import com.google.gwt.event.dom.client.HasFocusHandlers;
import com.google.gwt.event.dom.client.HasGestureChangeHandlers;
import com.google.gwt.event.dom.client.HasGestureEndHandlers;
import com.google.gwt.event.dom.client.HasGestureStartHandlers;
import com.google.gwt.event.dom.client.HasKeyDownHandlers;
import com.google.gwt.event.dom.client.HasKeyPressHandlers;
import com.google.gwt.event.dom.client.HasKeyUpHandlers;
import com.google.gwt.event.dom.client.HasMouseDownHandlers;
import com.google.gwt.event.dom.client.HasMouseMoveHandlers;
import com.google.gwt.event.dom.client.HasMouseOutHandlers;
import com.google.gwt.event.dom.client.HasMouseOverHandlers;
import com.google.gwt.event.dom.client.HasMouseUpHandlers;
import com.google.gwt.event.dom.client.HasMouseWheelHandlers;
import com.google.gwt.event.dom.client.HasTouchCancelHandlers;
import com.google.gwt.event.dom.client.HasTouchEndHandlers;
import com.google.gwt.event.dom.client.HasTouchMoveHandlers;
import com.google.gwt.event.dom.client.HasTouchStartHandlers;
import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.logical.shared.HasValueChangeHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.i18n.client.AutoDirectionHandler.Target;
import com.google.gwt.i18n.client.HasDirection;
import com.google.gwt.i18n.shared.HasDirectionEstimator;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.safehtml.client.HasSafeHtml;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.ButtonBase;
import com.google.gwt.user.client.ui.CellPanel;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FocusWidget;
import com.google.gwt.user.client.ui.Focusable;
import com.google.gwt.user.client.ui.HasAlignment;
import com.google.gwt.user.client.ui.HasAutoHorizontalAlignment;
import com.google.gwt.user.client.ui.HasConstrainedValue;
import com.google.gwt.user.client.ui.HasDirectionalText;
import com.google.gwt.user.client.ui.HasEnabled;
import com.google.gwt.user.client.ui.HasFocus;
import com.google.gwt.user.client.ui.HasHTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasName;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.HasWordWrap;
import com.google.gwt.user.client.ui.IndexedPanel;
import com.google.gwt.user.client.ui.InsertPanel;
import com.google.gwt.user.client.ui.InsertPanel.ForIsWidget;
import com.google.gwt.user.client.ui.IsRenderable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.LabelBase;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.SourcesChangeEvents;
import com.google.gwt.user.client.ui.SourcesClickEvents;
import com.google.gwt.user.client.ui.SourcesFocusEvents;
import com.google.gwt.user.client.ui.SourcesKeyboardEvents;
import com.google.gwt.user.client.ui.SourcesMouseEvents;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.TextBoxBase;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.ValueBoxBase;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.enterprise.inject.Instance;
import javax.inject.Provider;
import org.jboss.errai.common.client.api.extension.InitVotes;
import org.jboss.errai.databinding.client.DataBinderProvider;
import org.jboss.errai.databinding.client.DataBindingModuleBootstrapper;
import org.jboss.errai.enterprise.client.cdi.CDIEventTypeLookup;
import org.jboss.errai.enterprise.client.cdi.EventProvider;
import org.jboss.errai.enterprise.client.cdi.InstanceProvider;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.api.builtin.CallerProvider;
import org.jboss.errai.ioc.client.api.builtin.DisposerProvider;
import org.jboss.errai.ioc.client.api.builtin.IOCBeanManagerProvider;
import org.jboss.errai.ioc.client.api.builtin.InitBallotProvider;
import org.jboss.errai.ioc.client.api.builtin.RootPanelProvider;
import org.jboss.errai.ioc.client.container.BeanProvider;
import org.jboss.errai.ioc.client.container.CreationalContext;
import org.jboss.errai.ioc.client.container.InitializationCallback;
import org.jboss.errai.ioc.client.container.SimpleCreationalContext;
import org.jboss.errai.ioc.client.container.SyncBeanManager;
import org.jboss.errai.ioc.client.lifecycle.api.Access;
import org.jboss.errai.ioc.client.lifecycle.api.Creation;
import org.jboss.errai.ioc.client.lifecycle.api.Destruction;
import org.jboss.errai.ioc.client.lifecycle.api.LifecycleEvent;
import org.jboss.errai.ioc.client.lifecycle.api.LifecycleListenerRegistrar;
import org.jboss.errai.ioc.client.lifecycle.api.StateChange;
import org.jboss.errai.ioc.client.lifecycle.impl.AccessImpl;
import org.jboss.errai.ioc.client.lifecycle.impl.CreationImpl;
import org.jboss.errai.ioc.client.lifecycle.impl.DestructionImpl;
import org.jboss.errai.ioc.client.lifecycle.impl.LifecycleEventImpl;
import org.jboss.errai.ioc.client.lifecycle.impl.LifecycleListenerRegistrarImpl;
import org.jboss.errai.ioc.client.lifecycle.impl.StateChangeImpl;
import org.jboss.errai.ioc.support.bus.client.BatchCallerProvider;
import org.jboss.errai.ioc.support.bus.client.MessageBusProvider;
import org.jboss.errai.ioc.support.bus.client.RequestDispatcherProvider;
import org.jboss.errai.ioc.support.bus.client.SenderProvider;
import org.jboss.errai.ui.client.local.spi.LessStyle;
import org.jboss.errai.ui.client.local.spi.TranslationServiceProvider;
import org.jboss.errai.ui.client.widget.ListWidgetProvider;
import org.jboss.errai.ui.client.widget.LocaleListBox;
import org.jboss.errai.ui.client.widget.LocaleSelector;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;

public class BootstrapperImpl implements Bootstrapper {
  {
    new CDI().initLookupTable(CDIEventTypeLookup.get());
    new DataBindingModuleBootstrapper().run();
  }

  private final SimpleInjectionContext injContext = new SimpleInjectionContext();
  private final SimpleCreationalContext context = injContext.getRootContext();
  private final BeanProvider<TranslationServiceProvider> inj3898_TranslationServiceProvider_creational = new BeanProvider<TranslationServiceProvider>() {
    public TranslationServiceProvider getInstance(final CreationalContext context) {
      final TranslationServiceProvider inj3875_TranslationServiceProvider = new TranslationServiceProvider();
      context.addBean(context.getBeanReference(TranslationServiceProvider.class, QualifierUtil.DEFAULT_QUALIFIERS), inj3875_TranslationServiceProvider);
      return inj3875_TranslationServiceProvider;
    }
  };
  private final TranslationServiceProvider inj3875_TranslationServiceProvider = inj3898_TranslationServiceProvider_creational.getInstance(context);
  private final BeanProvider<DataBinderProvider> inj3899_DataBinderProvider_creational = new BeanProvider<DataBinderProvider>() {
    public DataBinderProvider getInstance(final CreationalContext context) {
      final DataBinderProvider inj3891_DataBinderProvider = new DataBinderProvider();
      context.addBean(context.getBeanReference(DataBinderProvider.class, QualifierUtil.DEFAULT_QUALIFIERS), inj3891_DataBinderProvider);
      return inj3891_DataBinderProvider;
    }
  };
  private final DataBinderProvider inj3891_DataBinderProvider = inj3899_DataBinderProvider_creational.getInstance(context);
  private final BeanProvider<InstanceProvider> inj3900_InstanceProvider_creational = new BeanProvider<InstanceProvider>() {
    public InstanceProvider getInstance(final CreationalContext context) {
      final InstanceProvider inj3895_InstanceProvider = new InstanceProvider();
      context.addBean(context.getBeanReference(InstanceProvider.class, QualifierUtil.DEFAULT_QUALIFIERS), inj3895_InstanceProvider);
      return inj3895_InstanceProvider;
    }
  };
  private final InstanceProvider inj3895_InstanceProvider = inj3900_InstanceProvider_creational.getInstance(context);
  private final BeanProvider<VerticalPanel> inj3902_VerticalPanel_creational = new BeanProvider<VerticalPanel>() {
    public VerticalPanel getInstance(final CreationalContext context) {
      final VerticalPanel inj2521_VerticalPanel = new VerticalPanel();
      context.addBean(context.getBeanReference(VerticalPanel.class, QualifierUtil.DEFAULT_QUALIFIERS), inj2521_VerticalPanel);
      return inj2521_VerticalPanel;
    }
  };
  private final BeanProvider<PaperButtonWidget> inj3903_PaperButtonWidget_creational = new BeanProvider<PaperButtonWidget>() {
    public PaperButtonWidget getInstance(final CreationalContext context) {
      final PaperButtonWidget inj2399_PaperButtonWidget = new PaperButtonWidget();
      context.addBean(context.getBeanReference(PaperButtonWidget.class, QualifierUtil.DEFAULT_QUALIFIERS), inj2399_PaperButtonWidget);
      return inj2399_PaperButtonWidget;
    }
  };
  private final BeanProvider<TextBox> inj3904_TextBox_creational = new BeanProvider<TextBox>() {
    public TextBox getInstance(final CreationalContext context) {
      final TextBox inj2542_TextBox = new TextBox();
      context.addBean(context.getBeanReference(TextBox.class, QualifierUtil.DEFAULT_QUALIFIERS), inj2542_TextBox);
      return inj2542_TextBox;
    }
  };
  private final BeanProvider<MapsService> inj3905_MapsService_creational = new BeanProvider<MapsService>() {
    public MapsService getInstance(final CreationalContext context) {
      final MapsService inj3864_MapsService = new MapsService();
      context.addBean(context.getBeanReference(MapsService.class, QualifierUtil.DEFAULT_QUALIFIERS), inj3864_MapsService);
      return inj3864_MapsService;
    }
  };
  private InitializationCallback<CarnetRoute> init_inj2352_CarnetRoute = new InitializationCallback<CarnetRoute>() {
    public void init(final CarnetRoute obj) {
      obj.init();
    }
  };
  private final BeanProvider<CarnetRoute> inj3901_CarnetRoute_creational = new BeanProvider<CarnetRoute>() {
    public CarnetRoute getInstance(final CreationalContext context) {
      final CarnetRoute inj2352_CarnetRoute = new CarnetRoute();
      context.addBean(context.getBeanReference(CarnetRoute.class, QualifierUtil.DEFAULT_QUALIFIERS), inj2352_CarnetRoute);
      _$146157933__832667302_dyn(inj2352_CarnetRoute, inj3902_VerticalPanel_creational.getInstance(context));
      _$146157933__$279516891_button_add_step(inj2352_CarnetRoute, inj3903_PaperButtonWidget_creational.getInstance(context));
      _$146157933__$903668163_instance(inj2352_CarnetRoute, inj3895_InstanceProvider.provide(new Class[] { StepWidget.class }, null));
      _$146157933__$371269162_textBox_autocomplete(inj2352_CarnetRoute, inj3904_TextBox_creational.getInstance(context));
      _$146157933__$2098168360_mapsService(inj2352_CarnetRoute, inj3905_MapsService_creational.getInstance(context));
      context.addInitializationCallback(inj2352_CarnetRoute, new InitializationCallback<CarnetRoute>() {
        public void init(final CarnetRoute obj) {
          com_bergui_errai_client_ui_CarnetRouteTemplateResource var33 = GWT.create(com_bergui_errai_client_ui_CarnetRouteTemplateResource.class);
          Element var34 = TemplateUtil.getRootTemplateElement(var33.getContents().getText(), "com/bergui/errai/client/ui/CarnetRoute.html", "carnet-route");
          TemplateUtil.translateTemplate("com/bergui/errai/client/ui/CarnetRoute.html", var34);
          Map<String, Element> var35 = TemplateUtil.getDataFieldElements(var34);
          Map<String, Widget> var36 = new LinkedHashMap<String, Widget>();
          TemplateUtil.compositeComponentReplace("com.bergui.errai.client.ui.CarnetRoute", "com/bergui/errai/client/ui/CarnetRoute.html", _$146157933__832667302_dyn(inj2352_CarnetRoute), var35, "dyn");
          TemplateUtil.compositeComponentReplace("com.bergui.errai.client.ui.CarnetRoute", "com/bergui/errai/client/ui/CarnetRoute.html", _$146157933__$279516891_button_add_step(inj2352_CarnetRoute), var35, "button_add_step");
          TemplateUtil.compositeComponentReplace("com.bergui.errai.client.ui.CarnetRoute", "com/bergui/errai/client/ui/CarnetRoute.html", _$146157933__$371269162_textBox_autocomplete(inj2352_CarnetRoute), var35, "textBox_autocomplete");
          var36.put("dyn", _$146157933__832667302_dyn(inj2352_CarnetRoute));
          var36.put("button_add_step", _$146157933__$279516891_button_add_step(inj2352_CarnetRoute));
          var36.put("textBox_autocomplete", _$146157933__$371269162_textBox_autocomplete(inj2352_CarnetRoute));
          TemplateUtil.initWidget(inj2352_CarnetRoute, var34, var36.values());
          ((HasFocusHandlers) var36.get("textBox_autocomplete")).addFocusHandler(new FocusHandler() {
            public void onFocus(FocusEvent event) {
              _$146157933_onClick_FocusEvent(inj2352_CarnetRoute, event);
            }
          });
          ((HasClickHandlers) var36.get("button_add_step")).addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
              _$146157933_onAdd_ClickEvent(inj2352_CarnetRoute, event);
            }
          });
        }
      });
      context.addInitializationCallback(inj2352_CarnetRoute, init_inj2352_CarnetRoute);
      return inj2352_CarnetRoute;
    }
  };
  private final BeanProvider<LocaleSelector> inj3907_LocaleSelector_creational = new BeanProvider<LocaleSelector>() {
    public LocaleSelector getInstance(final CreationalContext context) {
      final LocaleSelector inj3906_LocaleSelector = new LocaleSelector();
      context.addBean(context.getBeanReference(LocaleSelector.class, QualifierUtil.DEFAULT_QUALIFIERS), inj3906_LocaleSelector);
      return inj3906_LocaleSelector;
    }
  };
  private final LocaleSelector inj3906_LocaleSelector = inj3907_LocaleSelector_creational.getInstance(context);
  private final BeanProvider<EventProvider> inj3908_EventProvider_creational = new BeanProvider<EventProvider>() {
    public EventProvider getInstance(final CreationalContext context) {
      final EventProvider inj3879_EventProvider = new EventProvider();
      context.addBean(context.getBeanReference(EventProvider.class, QualifierUtil.DEFAULT_QUALIFIERS), inj3879_EventProvider);
      return inj3879_EventProvider;
    }
  };
  private final EventProvider inj3879_EventProvider = inj3908_EventProvider_creational.getInstance(context);
  private final BeanProvider<TripPage> inj3909_TripPage_creational = new BeanProvider<TripPage>() {
    public TripPage getInstance(final CreationalContext context) {
      final TripPage inj2664_TripPage = new TripPage();
      context.addBean(context.getBeanReference(TripPage.class, QualifierUtil.DEFAULT_QUALIFIERS), inj2664_TripPage);
      _2046955809__$146157933_carnet_route(inj2664_TripPage, inj3901_CarnetRoute_creational.getInstance(context));
      context.addInitializationCallback(inj2664_TripPage, new InitializationCallback<TripPage>() {
        public void init(final TripPage obj) {
          com_bergui_errai_client_ui_TripPageTemplateResource var37 = GWT.create(com_bergui_errai_client_ui_TripPageTemplateResource.class);
          Element var38 = TemplateUtil.getRootTemplateElement(var37.getContents().getText(), "com/bergui/errai/client/ui/TripPage.html", "app-template");
          TemplateUtil.translateTemplate("com/bergui/errai/client/ui/TripPage.html", var38);
          Map<String, Element> var39 = TemplateUtil.getDataFieldElements(var38);
          Map<String, Widget> var40 = new LinkedHashMap<String, Widget>();
          TemplateUtil.compositeComponentReplace("com.bergui.errai.client.ui.TripPage", "com/bergui/errai/client/ui/TripPage.html", _2046955809__$146157933_carnet_route(inj2664_TripPage), var39, "carnet_route");
          var40.put("carnet_route", _2046955809__$146157933_carnet_route(inj2664_TripPage));
          TemplateUtil.initWidget(inj2664_TripPage, var38, var40.values());
        }
      });
      return inj2664_TripPage;
    }
  };
  private InitializationCallback<App> init_inj3910_App = new InitializationCallback<App>() {
    public void init(final App obj) {
      obj.init();
    }
  };
  private final BeanProvider<App> inj3911_App_creational = new BeanProvider<App>() {
    public App getInstance(final CreationalContext context) {
      final App inj3910_App = new App();
      context.addBean(context.getBeanReference(App.class, QualifierUtil.DEFAULT_QUALIFIERS), inj3910_App);
      _249902996__2046955809_tripPage(inj3910_App, inj3909_TripPage_creational.getInstance(context));
      context.addInitializationCallback(inj3910_App, init_inj3910_App);
      return inj3910_App;
    }
  };
  private final App inj3910_App = inj3911_App_creational.getInstance(context);
  private final BeanProvider<SenderProvider> inj3912_SenderProvider_creational = new BeanProvider<SenderProvider>() {
    public SenderProvider getInstance(final CreationalContext context) {
      final SenderProvider inj3893_SenderProvider = new SenderProvider();
      context.addBean(context.getBeanReference(SenderProvider.class, QualifierUtil.DEFAULT_QUALIFIERS), inj3893_SenderProvider);
      return inj3893_SenderProvider;
    }
  };
  private final SenderProvider inj3893_SenderProvider = inj3912_SenderProvider_creational.getInstance(context);
  private final BeanProvider<IOCBeanManagerProvider> inj3913_IOCBeanManagerProvider_creational = new BeanProvider<IOCBeanManagerProvider>() {
    public IOCBeanManagerProvider getInstance(final CreationalContext context) {
      final IOCBeanManagerProvider inj3889_IOCBeanManagerProvider = new IOCBeanManagerProvider();
      context.addBean(context.getBeanReference(IOCBeanManagerProvider.class, QualifierUtil.DEFAULT_QUALIFIERS), inj3889_IOCBeanManagerProvider);
      return inj3889_IOCBeanManagerProvider;
    }
  };
  private final IOCBeanManagerProvider inj3889_IOCBeanManagerProvider = inj3913_IOCBeanManagerProvider_creational.getInstance(context);
  private final BeanProvider<CallerProvider> inj3914_CallerProvider_creational = new BeanProvider<CallerProvider>() {
    public CallerProvider getInstance(final CreationalContext context) {
      final CallerProvider inj3883_CallerProvider = new CallerProvider();
      context.addBean(context.getBeanReference(CallerProvider.class, QualifierUtil.DEFAULT_QUALIFIERS), inj3883_CallerProvider);
      return inj3883_CallerProvider;
    }
  };
  private final CallerProvider inj3883_CallerProvider = inj3914_CallerProvider_creational.getInstance(context);
  private final BeanProvider<StateChangeImpl> inj3916_StateChangeImpl_creational = new BeanProvider<StateChangeImpl>() {
    public StateChangeImpl getInstance(final CreationalContext context) {
      final StateChangeImpl inj3915_StateChangeImpl = new StateChangeImpl();
      context.addBean(context.getBeanReference(StateChangeImpl.class, QualifierUtil.DEFAULT_QUALIFIERS), inj3915_StateChangeImpl);
      return inj3915_StateChangeImpl;
    }
  };
  private final BeanProvider<Label> inj3918_Label_creational = new BeanProvider<Label>() {
    public Label getInstance(final CreationalContext context) {
      final Label inj2994_Label = new Label();
      context.addBean(context.getBeanReference(Label.class, QualifierUtil.DEFAULT_QUALIFIERS), inj2994_Label);
      return inj2994_Label;
    }
  };
  private final BeanProvider<PaperIconButtonWidget> inj3919_PaperIconButtonWidget_creational = new BeanProvider<PaperIconButtonWidget>() {
    public PaperIconButtonWidget getInstance(final CreationalContext context) {
      final PaperIconButtonWidget inj2661_PaperIconButtonWidget = new PaperIconButtonWidget();
      context.addBean(context.getBeanReference(PaperIconButtonWidget.class, QualifierUtil.DEFAULT_QUALIFIERS), inj2661_PaperIconButtonWidget);
      return inj2661_PaperIconButtonWidget;
    }
  };
  private final BeanProvider<StepWidget> inj3917_StepWidget_creational = new BeanProvider<StepWidget>() {
    public StepWidget getInstance(final CreationalContext context) {
      final StepWidget inj3767_StepWidget = new StepWidget();
      context.addBean(context.getBeanReference(StepWidget.class, QualifierUtil.DEFAULT_QUALIFIERS), inj3767_StepWidget);
      _$1562483267__$1862661780_name(inj3767_StepWidget, inj3918_Label_creational.getInstance(context));
      _$1562483267__$1763808066_button_delete_step(inj3767_StepWidget, inj3919_PaperIconButtonWidget_creational.getInstance(context));
      context.addInitializationCallback(inj3767_StepWidget, new InitializationCallback<StepWidget>() {
        public void init(final StepWidget obj) {
          com_bergui_errai_client_ui_StepWidgetTemplateResource var41 = GWT.create(com_bergui_errai_client_ui_StepWidgetTemplateResource.class);
          Element var42 = TemplateUtil.getRootTemplateElement(var41.getContents().getText(), "com/bergui/errai/client/ui/StepWidget.html", "");
          TemplateUtil.translateTemplate("com/bergui/errai/client/ui/StepWidget.html", var42);
          Map<String, Element> var43 = TemplateUtil.getDataFieldElements(var42);
          Map<String, Widget> var44 = new LinkedHashMap<String, Widget>();
          TemplateUtil.compositeComponentReplace("com.bergui.errai.client.ui.StepWidget", "com/bergui/errai/client/ui/StepWidget.html", _$1562483267__$1862661780_name(inj3767_StepWidget), var43, "name");
          TemplateUtil.compositeComponentReplace("com.bergui.errai.client.ui.StepWidget", "com/bergui/errai/client/ui/StepWidget.html", _$1562483267__$1763808066_button_delete_step(inj3767_StepWidget), var43, "button_delete_step");
          var44.put("name", _$1562483267__$1862661780_name(inj3767_StepWidget));
          var44.put("button_delete_step", _$1562483267__$1763808066_button_delete_step(inj3767_StepWidget));
          TemplateUtil.initWidget(inj3767_StepWidget, var42, var44.values());
          ((HasClickHandlers) var44.get("button_delete_step")).addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
              inj3767_StepWidget.onDelete(event);
            }
          });
        }
      });
      return inj3767_StepWidget;
    }
  };
  private final BeanProvider<MessageBusProvider> inj3920_MessageBusProvider_creational = new BeanProvider<MessageBusProvider>() {
    public MessageBusProvider getInstance(final CreationalContext context) {
      final MessageBusProvider inj3871_MessageBusProvider = new MessageBusProvider();
      context.addBean(context.getBeanReference(MessageBusProvider.class, QualifierUtil.DEFAULT_QUALIFIERS), inj3871_MessageBusProvider);
      return inj3871_MessageBusProvider;
    }
  };
  private final MessageBusProvider inj3871_MessageBusProvider = inj3920_MessageBusProvider_creational.getInstance(context);
  private final BeanProvider<InitBallotProvider> inj3921_InitBallotProvider_creational = new BeanProvider<InitBallotProvider>() {
    public InitBallotProvider getInstance(final CreationalContext context) {
      final InitBallotProvider inj3877_InitBallotProvider = new InitBallotProvider();
      context.addBean(context.getBeanReference(InitBallotProvider.class, QualifierUtil.DEFAULT_QUALIFIERS), inj3877_InitBallotProvider);
      return inj3877_InitBallotProvider;
    }
  };
  private final InitBallotProvider inj3877_InitBallotProvider = inj3921_InitBallotProvider_creational.getInstance(context);
  private final BeanProvider<RequestDispatcherProvider> inj3922_RequestDispatcherProvider_creational = new BeanProvider<RequestDispatcherProvider>() {
    public RequestDispatcherProvider getInstance(final CreationalContext context) {
      final RequestDispatcherProvider inj3887_RequestDispatcherProvider = new RequestDispatcherProvider();
      context.addBean(context.getBeanReference(RequestDispatcherProvider.class, QualifierUtil.DEFAULT_QUALIFIERS), inj3887_RequestDispatcherProvider);
      return inj3887_RequestDispatcherProvider;
    }
  };
  private final RequestDispatcherProvider inj3887_RequestDispatcherProvider = inj3922_RequestDispatcherProvider_creational.getInstance(context);
  private final BeanProvider<DestructionImpl> inj3924_DestructionImpl_creational = new BeanProvider<DestructionImpl>() {
    public DestructionImpl getInstance(final CreationalContext context) {
      final DestructionImpl inj3923_DestructionImpl = new DestructionImpl();
      context.addBean(context.getBeanReference(DestructionImpl.class, QualifierUtil.DEFAULT_QUALIFIERS), inj3923_DestructionImpl);
      return inj3923_DestructionImpl;
    }
  };
  private final BeanProvider<RootPanelProvider> inj3925_RootPanelProvider_creational = new BeanProvider<RootPanelProvider>() {
    public RootPanelProvider getInstance(final CreationalContext context) {
      final RootPanelProvider inj3873_RootPanelProvider = new RootPanelProvider();
      context.addBean(context.getBeanReference(RootPanelProvider.class, QualifierUtil.DEFAULT_QUALIFIERS), inj3873_RootPanelProvider);
      return inj3873_RootPanelProvider;
    }
  };
  private final RootPanelProvider inj3873_RootPanelProvider = inj3925_RootPanelProvider_creational.getInstance(context);
  private final BeanProvider<LifecycleListenerRegistrarImpl> inj3927_LifecycleListenerRegistrarImpl_creational = new BeanProvider<LifecycleListenerRegistrarImpl>() {
    public LifecycleListenerRegistrarImpl getInstance(final CreationalContext context) {
      final LifecycleListenerRegistrarImpl inj3926_LifecycleListenerRegistrarImpl = new LifecycleListenerRegistrarImpl();
      context.addBean(context.getBeanReference(LifecycleListenerRegistrarImpl.class, QualifierUtil.DEFAULT_QUALIFIERS), inj3926_LifecycleListenerRegistrarImpl);
      return inj3926_LifecycleListenerRegistrarImpl;
    }
  };
  private final LifecycleListenerRegistrarImpl inj3926_LifecycleListenerRegistrarImpl = inj3927_LifecycleListenerRegistrarImpl_creational.getInstance(context);
  private final BeanProvider<ListWidgetProvider> inj3928_ListWidgetProvider_creational = new BeanProvider<ListWidgetProvider>() {
    public ListWidgetProvider getInstance(final CreationalContext context) {
      final ListWidgetProvider inj3881_ListWidgetProvider = new ListWidgetProvider();
      context.addBean(context.getBeanReference(ListWidgetProvider.class, QualifierUtil.DEFAULT_QUALIFIERS), inj3881_ListWidgetProvider);
      return inj3881_ListWidgetProvider;
    }
  };
  private final ListWidgetProvider inj3881_ListWidgetProvider = inj3928_ListWidgetProvider_creational.getInstance(context);
  private final BeanProvider<LocaleListBox> inj3930_LocaleListBox_creational = new BeanProvider<LocaleListBox>() {
    public LocaleListBox getInstance(final CreationalContext context) {
      final LocaleListBox inj3929_LocaleListBox = new LocaleListBox();
      context.addBean(context.getBeanReference(LocaleListBox.class, QualifierUtil.DEFAULT_QUALIFIERS), inj3929_LocaleListBox);
      _1350680564__$1232121576_selector(inj3929_LocaleListBox, inj3906_LocaleSelector);
      InitVotes.registerOneTimeInitCallback(new Runnable() {
        public void run() {
          inj3929_LocaleListBox.init();
        }
      });
      return inj3929_LocaleListBox;
    }
  };
  private InitializationCallback<LessStyle> init_inj3931_LessStyle = new InitializationCallback<LessStyle>() {
    public void init(final LessStyle obj) {
      obj.init();
    }
  };
  private final BeanProvider<LessStyle> inj3932_LessStyle_creational = new BeanProvider<LessStyle>() {
    public LessStyle getInstance(final CreationalContext context) {
      final LessStyle inj3931_LessStyle = new LessStyle();
      context.addBean(context.getBeanReference(LessStyle.class, QualifierUtil.DEFAULT_QUALIFIERS), inj3931_LessStyle);
      context.addInitializationCallback(inj3931_LessStyle, init_inj3931_LessStyle);
      return inj3931_LessStyle;
    }
  };
  private final LessStyle inj3931_LessStyle = inj3932_LessStyle_creational.getInstance(context);
  private final BeanProvider<DisposerProvider> inj3933_DisposerProvider_creational = new BeanProvider<DisposerProvider>() {
    public DisposerProvider getInstance(final CreationalContext context) {
      final DisposerProvider inj3885_DisposerProvider = new DisposerProvider();
      context.addBean(context.getBeanReference(DisposerProvider.class, QualifierUtil.DEFAULT_QUALIFIERS), inj3885_DisposerProvider);
      _$1300398733__$652658075_beanManager(inj3885_DisposerProvider, inj3889_IOCBeanManagerProvider.get());
      return inj3885_DisposerProvider;
    }
  };
  private final DisposerProvider inj3885_DisposerProvider = inj3933_DisposerProvider_creational.getInstance(context);
  private final BeanProvider<BatchCallerProvider> inj3934_BatchCallerProvider_creational = new BeanProvider<BatchCallerProvider>() {
    public BatchCallerProvider getInstance(final CreationalContext context) {
      final BatchCallerProvider inj3897_BatchCallerProvider = new BatchCallerProvider();
      context.addBean(context.getBeanReference(BatchCallerProvider.class, QualifierUtil.DEFAULT_QUALIFIERS), inj3897_BatchCallerProvider);
      return inj3897_BatchCallerProvider;
    }
  };
  private final BatchCallerProvider inj3897_BatchCallerProvider = inj3934_BatchCallerProvider_creational.getInstance(context);
  private final BeanProvider<CreationImpl> inj3936_CreationImpl_creational = new BeanProvider<CreationImpl>() {
    public CreationImpl getInstance(final CreationalContext context) {
      final CreationImpl inj3935_CreationImpl = new CreationImpl();
      context.addBean(context.getBeanReference(CreationImpl.class, QualifierUtil.DEFAULT_QUALIFIERS), inj3935_CreationImpl);
      return inj3935_CreationImpl;
    }
  };
  private final BeanProvider<AccessImpl> inj3938_AccessImpl_creational = new BeanProvider<AccessImpl>() {
    public AccessImpl getInstance(final CreationalContext context) {
      final AccessImpl inj3937_AccessImpl = new AccessImpl();
      context.addBean(context.getBeanReference(AccessImpl.class, QualifierUtil.DEFAULT_QUALIFIERS), inj3937_AccessImpl);
      return inj3937_AccessImpl;
    }
  };
  public interface com_bergui_errai_client_ui_CarnetRouteTemplateResource extends Template, ClientBundle { @Source("com/bergui/errai/client/ui/CarnetRoute.html") public TextResource getContents(); }
  public interface com_bergui_errai_client_ui_TripPageTemplateResource extends Template, ClientBundle { @Source("com/bergui/errai/client/ui/TripPage.html") public TextResource getContents(); }
  public interface com_bergui_errai_client_ui_StepWidgetTemplateResource extends Template, ClientBundle { @Source("com/bergui/errai/client/ui/StepWidget.html") public TextResource getContents(); }
  private void declareBeans_0() {
    injContext.addBean(TranslationServiceProvider.class, TranslationServiceProvider.class, inj3898_TranslationServiceProvider_creational, inj3875_TranslationServiceProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(Provider.class, TranslationServiceProvider.class, inj3898_TranslationServiceProvider_creational, inj3875_TranslationServiceProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(DataBinderProvider.class, DataBinderProvider.class, inj3899_DataBinderProvider_creational, inj3891_DataBinderProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(ContextualTypeProvider.class, DataBinderProvider.class, inj3899_DataBinderProvider_creational, inj3891_DataBinderProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(InstanceProvider.class, InstanceProvider.class, inj3900_InstanceProvider_creational, inj3895_InstanceProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(ContextualTypeProvider.class, InstanceProvider.class, inj3900_InstanceProvider_creational, inj3895_InstanceProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(VerticalPanel.class, VerticalPanel.class, inj3902_VerticalPanel_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(HasAlignment.class, VerticalPanel.class, inj3902_VerticalPanel_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasHorizontalAlignment.class, VerticalPanel.class, inj3902_VerticalPanel_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasVerticalAlignment.class, VerticalPanel.class, inj3902_VerticalPanel_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(ForIsWidget.class, VerticalPanel.class, inj3902_VerticalPanel_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(InsertPanel.class, VerticalPanel.class, inj3902_VerticalPanel_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(IndexedPanel.class, VerticalPanel.class, inj3902_VerticalPanel_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(com.google.gwt.user.client.ui.IndexedPanel.ForIsWidget.class, VerticalPanel.class, inj3902_VerticalPanel_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(CellPanel.class, VerticalPanel.class, inj3902_VerticalPanel_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(ComplexPanel.class, VerticalPanel.class, inj3902_VerticalPanel_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(Panel.class, VerticalPanel.class, inj3902_VerticalPanel_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(com.google.gwt.user.client.ui.HasWidgets.ForIsWidget.class, VerticalPanel.class, inj3902_VerticalPanel_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasWidgets.class, VerticalPanel.class, inj3902_VerticalPanel_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(Iterable.class, VerticalPanel.class, inj3902_VerticalPanel_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(Widget.class, VerticalPanel.class, inj3902_VerticalPanel_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(EventListener.class, VerticalPanel.class, inj3902_VerticalPanel_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAttachHandlers.class, VerticalPanel.class, inj3902_VerticalPanel_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasHandlers.class, VerticalPanel.class, inj3902_VerticalPanel_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(IsWidget.class, VerticalPanel.class, inj3902_VerticalPanel_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(UIObject.class, VerticalPanel.class, inj3902_VerticalPanel_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasVisibility.class, VerticalPanel.class, inj3902_VerticalPanel_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(PaperButtonWidget.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(ButtonBase.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasHTML.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasText.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasSafeHtml.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(FocusWidget.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(SourcesClickEvents.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasClickHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDoubleClickHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasFocus.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(Focusable.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(SourcesFocusEvents.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(SourcesKeyboardEvents.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasEnabled.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAllDragAndDropHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDragEndHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDragEnterHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDragLeaveHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDragHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDragOverHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDragStartHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDropHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAllFocusHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasFocusHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasBlurHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAllGestureHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasGestureStartHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasGestureChangeHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasGestureEndHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAllKeyHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasKeyUpHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasKeyDownHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasKeyPressHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAllMouseHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasMouseDownHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasMouseUpHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasMouseOutHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasMouseOverHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasMouseMoveHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasMouseWheelHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAllTouchHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasTouchStartHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasTouchMoveHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasTouchEndHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasTouchCancelHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(SourcesMouseEvents.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(Widget.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(EventListener.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAttachHandlers.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(IsWidget.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(UIObject.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasVisibility.class, PaperButtonWidget.class, inj3903_PaperButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(TextBox.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(TextBoxBase.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(SourcesChangeEvents.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(ValueBoxBase.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasChangeHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasName.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDirectionEstimator.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasValue.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(TakesValue.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasValueChangeHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasText.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(Target.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDirection.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasKeyUpHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(IsEditor.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(FocusWidget.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(SourcesClickEvents.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasClickHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDoubleClickHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasFocus.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(Focusable.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(SourcesFocusEvents.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(SourcesKeyboardEvents.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasEnabled.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAllDragAndDropHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDragEndHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDragEnterHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDragLeaveHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDragHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDragOverHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDragStartHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDropHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAllFocusHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasFocusHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasBlurHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAllGestureHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasGestureStartHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasGestureChangeHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasGestureEndHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAllKeyHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasKeyDownHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasKeyPressHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAllMouseHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasMouseDownHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasMouseUpHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasMouseOutHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasMouseOverHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasMouseMoveHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasMouseWheelHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAllTouchHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasTouchStartHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasTouchMoveHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasTouchEndHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasTouchCancelHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(SourcesMouseEvents.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(Widget.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(EventListener.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAttachHandlers.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(IsWidget.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(UIObject.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasVisibility.class, TextBox.class, inj3904_TextBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(MapsService.class, MapsService.class, inj3905_MapsService_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(CarnetRoute.class, CarnetRoute.class, inj3901_CarnetRoute_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(Composite.class, CarnetRoute.class, inj3901_CarnetRoute_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(IsRenderable.class, CarnetRoute.class, inj3901_CarnetRoute_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(Widget.class, CarnetRoute.class, inj3901_CarnetRoute_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(EventListener.class, CarnetRoute.class, inj3901_CarnetRoute_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAttachHandlers.class, CarnetRoute.class, inj3901_CarnetRoute_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasHandlers.class, CarnetRoute.class, inj3901_CarnetRoute_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(IsWidget.class, CarnetRoute.class, inj3901_CarnetRoute_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(UIObject.class, CarnetRoute.class, inj3901_CarnetRoute_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasVisibility.class, CarnetRoute.class, inj3901_CarnetRoute_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(LocaleSelector.class, LocaleSelector.class, inj3907_LocaleSelector_creational, inj3906_LocaleSelector, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(EventProvider.class, EventProvider.class, inj3908_EventProvider_creational, inj3879_EventProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(ContextualTypeProvider.class, EventProvider.class, inj3908_EventProvider_creational, inj3879_EventProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(TripPage.class, TripPage.class, inj3909_TripPage_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(Composite.class, TripPage.class, inj3909_TripPage_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(IsRenderable.class, TripPage.class, inj3909_TripPage_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(Widget.class, TripPage.class, inj3909_TripPage_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(EventListener.class, TripPage.class, inj3909_TripPage_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAttachHandlers.class, TripPage.class, inj3909_TripPage_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasHandlers.class, TripPage.class, inj3909_TripPage_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(IsWidget.class, TripPage.class, inj3909_TripPage_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(UIObject.class, TripPage.class, inj3909_TripPage_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasVisibility.class, TripPage.class, inj3909_TripPage_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(App.class, App.class, inj3911_App_creational, inj3910_App, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(SenderProvider.class, SenderProvider.class, inj3912_SenderProvider_creational, inj3893_SenderProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(ContextualTypeProvider.class, SenderProvider.class, inj3912_SenderProvider_creational, inj3893_SenderProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(IOCBeanManagerProvider.class, IOCBeanManagerProvider.class, inj3913_IOCBeanManagerProvider_creational, inj3889_IOCBeanManagerProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(Provider.class, IOCBeanManagerProvider.class, inj3913_IOCBeanManagerProvider_creational, inj3889_IOCBeanManagerProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(CallerProvider.class, CallerProvider.class, inj3914_CallerProvider_creational, inj3883_CallerProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(ContextualTypeProvider.class, CallerProvider.class, inj3914_CallerProvider_creational, inj3883_CallerProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(StateChangeImpl.class, StateChangeImpl.class, inj3916_StateChangeImpl_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(StateChange.class, StateChangeImpl.class, inj3916_StateChangeImpl_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(LifecycleEvent.class, StateChangeImpl.class, inj3916_StateChangeImpl_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(LifecycleEventImpl.class, StateChangeImpl.class, inj3916_StateChangeImpl_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(LifecycleEvent.class, StateChangeImpl.class, inj3916_StateChangeImpl_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(Label.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(HasDirectionalText.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasText.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDirection.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasClickHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDoubleClickHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(SourcesClickEvents.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(SourcesMouseEvents.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAllDragAndDropHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDragEndHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDragEnterHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDragLeaveHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDragHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDragOverHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDragStartHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDropHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAllGestureHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasGestureStartHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasGestureChangeHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasGestureEndHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAllMouseHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasMouseDownHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasMouseUpHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasMouseOutHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasMouseOverHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasMouseMoveHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasMouseWheelHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAllTouchHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasTouchStartHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasTouchMoveHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasTouchEndHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasTouchCancelHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(IsEditor.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(LabelBase.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasWordWrap.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDirectionEstimator.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAutoHorizontalAlignment.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasHorizontalAlignment.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(Widget.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(EventListener.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAttachHandlers.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(IsWidget.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(UIObject.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasVisibility.class, Label.class, inj3918_Label_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(PaperIconButtonWidget.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(PaperButtonWidget.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(ButtonBase.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasHTML.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasText.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasSafeHtml.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(FocusWidget.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(SourcesClickEvents.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasClickHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDoubleClickHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasFocus.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(Focusable.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(SourcesFocusEvents.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(SourcesKeyboardEvents.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasEnabled.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAllDragAndDropHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDragEndHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDragEnterHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDragLeaveHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDragHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDragOverHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDragStartHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasDropHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAllFocusHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasFocusHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasBlurHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAllGestureHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasGestureStartHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasGestureChangeHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasGestureEndHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAllKeyHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasKeyUpHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasKeyDownHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasKeyPressHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAllMouseHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasMouseDownHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasMouseUpHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasMouseOutHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasMouseOverHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasMouseMoveHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasMouseWheelHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAllTouchHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasTouchStartHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasTouchMoveHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasTouchEndHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasTouchCancelHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(SourcesMouseEvents.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(Widget.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(EventListener.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAttachHandlers.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(IsWidget.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(UIObject.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasVisibility.class, PaperIconButtonWidget.class, inj3919_PaperIconButtonWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(StepWidget.class, StepWidget.class, inj3917_StepWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(Composite.class, StepWidget.class, inj3917_StepWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(IsRenderable.class, StepWidget.class, inj3917_StepWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(Widget.class, StepWidget.class, inj3917_StepWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(EventListener.class, StepWidget.class, inj3917_StepWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAttachHandlers.class, StepWidget.class, inj3917_StepWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasHandlers.class, StepWidget.class, inj3917_StepWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(IsWidget.class, StepWidget.class, inj3917_StepWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(UIObject.class, StepWidget.class, inj3917_StepWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasVisibility.class, StepWidget.class, inj3917_StepWidget_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(MessageBusProvider.class, MessageBusProvider.class, inj3920_MessageBusProvider_creational, inj3871_MessageBusProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(Provider.class, MessageBusProvider.class, inj3920_MessageBusProvider_creational, inj3871_MessageBusProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(InitBallotProvider.class, InitBallotProvider.class, inj3921_InitBallotProvider_creational, inj3877_InitBallotProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(ContextualTypeProvider.class, InitBallotProvider.class, inj3921_InitBallotProvider_creational, inj3877_InitBallotProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(RequestDispatcherProvider.class, RequestDispatcherProvider.class, inj3922_RequestDispatcherProvider_creational, inj3887_RequestDispatcherProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(Provider.class, RequestDispatcherProvider.class, inj3922_RequestDispatcherProvider_creational, inj3887_RequestDispatcherProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(DestructionImpl.class, DestructionImpl.class, inj3924_DestructionImpl_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(Destruction.class, DestructionImpl.class, inj3924_DestructionImpl_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(LifecycleEvent.class, DestructionImpl.class, inj3924_DestructionImpl_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(LifecycleEventImpl.class, DestructionImpl.class, inj3924_DestructionImpl_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(LifecycleEvent.class, DestructionImpl.class, inj3924_DestructionImpl_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(RootPanelProvider.class, RootPanelProvider.class, inj3925_RootPanelProvider_creational, inj3873_RootPanelProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(Provider.class, RootPanelProvider.class, inj3925_RootPanelProvider_creational, inj3873_RootPanelProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(LifecycleListenerRegistrarImpl.class, LifecycleListenerRegistrarImpl.class, inj3927_LifecycleListenerRegistrarImpl_creational, inj3926_LifecycleListenerRegistrarImpl, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(LifecycleListenerRegistrar.class, LifecycleListenerRegistrarImpl.class, inj3927_LifecycleListenerRegistrarImpl_creational, inj3926_LifecycleListenerRegistrarImpl, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(ListWidgetProvider.class, ListWidgetProvider.class, inj3928_ListWidgetProvider_creational, inj3881_ListWidgetProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(ContextualTypeProvider.class, ListWidgetProvider.class, inj3928_ListWidgetProvider_creational, inj3881_ListWidgetProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(LocaleListBox.class, LocaleListBox.class, inj3930_LocaleListBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(ValueListBox.class, LocaleListBox.class, inj3930_LocaleListBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(Focusable.class, LocaleListBox.class, inj3930_LocaleListBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasConstrainedValue.class, LocaleListBox.class, inj3930_LocaleListBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasValue.class, LocaleListBox.class, inj3930_LocaleListBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(TakesValue.class, LocaleListBox.class, inj3930_LocaleListBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasValueChangeHandlers.class, LocaleListBox.class, inj3930_LocaleListBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasHandlers.class, LocaleListBox.class, inj3930_LocaleListBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasEnabled.class, LocaleListBox.class, inj3930_LocaleListBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(IsEditor.class, LocaleListBox.class, inj3930_LocaleListBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(Composite.class, LocaleListBox.class, inj3930_LocaleListBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(IsRenderable.class, LocaleListBox.class, inj3930_LocaleListBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(Widget.class, LocaleListBox.class, inj3930_LocaleListBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(EventListener.class, LocaleListBox.class, inj3930_LocaleListBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasAttachHandlers.class, LocaleListBox.class, inj3930_LocaleListBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(IsWidget.class, LocaleListBox.class, inj3930_LocaleListBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(UIObject.class, LocaleListBox.class, inj3930_LocaleListBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(HasVisibility.class, LocaleListBox.class, inj3930_LocaleListBox_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(LessStyle.class, LessStyle.class, inj3932_LessStyle_creational, inj3931_LessStyle, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(DisposerProvider.class, DisposerProvider.class, inj3933_DisposerProvider_creational, inj3885_DisposerProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(ContextualTypeProvider.class, DisposerProvider.class, inj3933_DisposerProvider_creational, inj3885_DisposerProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(BatchCallerProvider.class, BatchCallerProvider.class, inj3934_BatchCallerProvider_creational, inj3897_BatchCallerProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(Provider.class, BatchCallerProvider.class, inj3934_BatchCallerProvider_creational, inj3897_BatchCallerProvider, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(CreationImpl.class, CreationImpl.class, inj3936_CreationImpl_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(Creation.class, CreationImpl.class, inj3936_CreationImpl_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(LifecycleEvent.class, CreationImpl.class, inj3936_CreationImpl_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(LifecycleEventImpl.class, CreationImpl.class, inj3936_CreationImpl_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(LifecycleEvent.class, CreationImpl.class, inj3936_CreationImpl_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(AccessImpl.class, AccessImpl.class, inj3938_AccessImpl_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, true);
    injContext.addBean(Access.class, AccessImpl.class, inj3938_AccessImpl_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(LifecycleEvent.class, AccessImpl.class, inj3938_AccessImpl_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(LifecycleEventImpl.class, AccessImpl.class, inj3938_AccessImpl_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
    injContext.addBean(LifecycleEvent.class, AccessImpl.class, inj3938_AccessImpl_creational, null, QualifierUtil.DEFAULT_QUALIFIERS, null, false);
  }

  private native static CarnetRoute _2046955809__$146157933_carnet_route(TripPage instance) /*-{
    return instance.@com.bergui.errai.client.ui.TripPage::carnet_route;
  }-*/;

  private native static void _2046955809__$146157933_carnet_route(TripPage instance, CarnetRoute value) /*-{
    instance.@com.bergui.errai.client.ui.TripPage::carnet_route = value;
  }-*/;

  private native static TextBox _$146157933__$371269162_textBox_autocomplete(CarnetRoute instance) /*-{
    return instance.@com.bergui.errai.client.ui.CarnetRoute::textBox_autocomplete;
  }-*/;

  private native static void _$146157933__$371269162_textBox_autocomplete(CarnetRoute instance, TextBox value) /*-{
    instance.@com.bergui.errai.client.ui.CarnetRoute::textBox_autocomplete = value;
  }-*/;

  private native static PaperButtonWidget _$146157933__$279516891_button_add_step(CarnetRoute instance) /*-{
    return instance.@com.bergui.errai.client.ui.CarnetRoute::button_add_step;
  }-*/;

  private native static void _$146157933__$279516891_button_add_step(CarnetRoute instance, PaperButtonWidget value) /*-{
    instance.@com.bergui.errai.client.ui.CarnetRoute::button_add_step = value;
  }-*/;

  private native static void _1350680564__$1232121576_selector(LocaleListBox instance, LocaleSelector value) /*-{
    instance.@org.jboss.errai.ui.client.widget.LocaleListBox::selector = value;
  }-*/;

  private native static void _$1300398733__$652658075_beanManager(DisposerProvider instance, SyncBeanManager value) /*-{
    instance.@org.jboss.errai.ioc.client.api.builtin.DisposerProvider::beanManager = value;
  }-*/;

  private native static PaperIconButtonWidget _$1562483267__$1763808066_button_delete_step(StepWidget instance) /*-{
    return instance.@com.bergui.errai.client.ui.StepWidget::button_delete_step;
  }-*/;

  private native static void _$1562483267__$1763808066_button_delete_step(StepWidget instance, PaperIconButtonWidget value) /*-{
    instance.@com.bergui.errai.client.ui.StepWidget::button_delete_step = value;
  }-*/;

  private native static void _$146157933__$2098168360_mapsService(CarnetRoute instance, MapsService value) /*-{
    instance.@com.bergui.errai.client.ui.CarnetRoute::mapsService = value;
  }-*/;

  private native static Label _$1562483267__$1862661780_name(StepWidget instance) /*-{
    return instance.@com.bergui.errai.client.ui.StepWidget::name;
  }-*/;

  private native static void _$1562483267__$1862661780_name(StepWidget instance, Label value) /*-{
    instance.@com.bergui.errai.client.ui.StepWidget::name = value;
  }-*/;

  private native static VerticalPanel _$146157933__832667302_dyn(CarnetRoute instance) /*-{
    return instance.@com.bergui.errai.client.ui.CarnetRoute::dyn;
  }-*/;

  private native static void _$146157933__832667302_dyn(CarnetRoute instance, VerticalPanel value) /*-{
    instance.@com.bergui.errai.client.ui.CarnetRoute::dyn = value;
  }-*/;

  private native static void _249902996__2046955809_tripPage(App instance, TripPage value) /*-{
    instance.@com.bergui.errai.client.App::tripPage = value;
  }-*/;

  private native static void _$146157933__$903668163_instance(CarnetRoute instance, Instance<StepWidget> value) /*-{
    instance.@com.bergui.errai.client.ui.CarnetRoute::instance = value;
  }-*/;

  public native static void _$146157933_onClick_FocusEvent(CarnetRoute instance, FocusEvent a0) /*-{
    instance.@com.bergui.errai.client.ui.CarnetRoute::onClick(Lcom/google/gwt/event/dom/client/FocusEvent;)(a0);
  }-*/;

  public native static void _$146157933_onAdd_ClickEvent(CarnetRoute instance, ClickEvent a0) /*-{
    instance.@com.bergui.errai.client.ui.CarnetRoute::onAdd(Lcom/google/gwt/event/dom/client/ClickEvent;)(a0);
  }-*/;

  // The main IOC bootstrap method.
  public SimpleInjectionContext bootstrapContainer() {
    declareBeans_0();
    return injContext;
  }
}