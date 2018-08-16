package com.rieger.gwt.tutorials.layoutpanel.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class LayoutExamples implements EntryPoint {
    public DockLayoutPanel getDockLayoutPanel() {
	DockLayoutPanel p = new DockLayoutPanel(Unit.EM);
	Widget header = new HTML("header");
	header.setStyleName("border border-primary rounded gwt-border-2px");
	Widget footer = new HTML("footer");
	footer.setStyleName("border border-primary rounded gwt-border-2px");
	Widget navigation = new HTML("navigation");
	navigation.setStyleName("border border-primary rounded gwt-border-2px");
	Widget details = new HTML("<h1>Layout with Bootstrap</h1>");
	details.setStyleName("border border-primary rounded gwt-border-2px");

	p.addNorth(header, 2);
	p.addSouth(footer, 2);
	p.addWest(navigation, 10);
	p.add(details);

	return p;
    }
    
    public void onModuleLoad() {
	TabLayoutPanel p = new TabLayoutPanel(2.5, Unit.EM);
	
	p.add(getDockLayoutPanel(), "DockLayoutPanel");
	p.add(new HTML("that content"), "that");
	p.add(new HTML("the other content"), "the other");
	RootLayoutPanel.get().add(p);
    }
}
