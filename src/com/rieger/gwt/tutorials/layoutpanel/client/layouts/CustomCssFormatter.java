package com.rieger.gwt.tutorials.layoutpanel.client.layouts;

import com.google.gwt.user.client.ui.ComplexPanel;

public class CustomCssFormatter {
    public static void addGWTStyles(ComplexPanel p) {
	for (int i = 0; i < p.getWidgetCount(); i++) {
	    p.getWidget(i).addStyleName("gwt-color gwt-background-color gwt-font-size");
	}
    }
}
