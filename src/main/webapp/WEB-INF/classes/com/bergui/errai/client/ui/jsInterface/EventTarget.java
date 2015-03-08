package com.bergui.errai.client.ui.jsInterface;

import com.google.gwt.core.client.js.JsType;

@JsType
public interface EventTarget {
  void addEventListener(String type, EventListener listener);
}