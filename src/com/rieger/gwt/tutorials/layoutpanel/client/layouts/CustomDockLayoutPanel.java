package com.rieger.gwt.tutorials.layoutpanel.client.layouts;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;

public class CustomDockLayoutPanel extends DockLayoutPanel {
    public CustomDockLayoutPanel(Unit unit) {
	super(unit);
	Widget header = new HTML("header");
	header.setStyleName("border border-primary rounded gwt-border-2px");
	Widget footer = new HTML("footer");
	footer.setStyleName("border border-primary rounded gwt-border-2px");
	Widget navigation = new HTML("navigation");
	navigation.setStyleName("border border-primary rounded gwt-border-2px");
	Widget details = new HTML("<h1>Layout with Bootstrap</h1>");
	details.setStyleName("border border-primary rounded gwt-border-2px");

	addNorth(header, 2);
	addSouth(footer, 2);
	addWest(navigation, 10);
	add(details);
    }
}
