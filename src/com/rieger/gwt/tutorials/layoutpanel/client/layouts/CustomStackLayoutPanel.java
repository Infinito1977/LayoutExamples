package com.rieger.gwt.tutorials.layoutpanel.client.layouts;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.StackLayoutPanel;

public class CustomStackLayoutPanel extends StackLayoutPanel {
    public CustomStackLayoutPanel(Unit unit) {
	super(unit);
	add(new HTML("this content"), new HTML("this"), 4);
	add(new HTML("that content"), new HTML("that"), 4);
	add(new HTML("the other content"), new HTML("the other"), 4);
    }
}
