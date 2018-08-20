package com.rieger.gwt.tutorials.layoutpanel.client.layouts;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class CustomVerticalPanel extends VerticalPanel {
    public CustomVerticalPanel() {
	for (int i = 0; i < 9; i++) {
	    Widget w = new HTML("<h2>" + i + "</h2>");
	    w.setStyleName("border border-primary rounded");
	    add(w);
	}
	// Fügt vor 9. Element folgendes Element hinzu
	Widget w_a = new HTML("<h2>a</h2>");
	w_a.setStyleName("border border-primary rounded");
	insert(w_a, 8);
    }
}
