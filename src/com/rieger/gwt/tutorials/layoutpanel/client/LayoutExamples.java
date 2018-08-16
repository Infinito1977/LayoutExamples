package com.rieger.gwt.tutorials.layoutpanel.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.LayoutPanel;
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
    
    public LayoutPanel getLayoutPanel() {
	Widget leftPanel = new HTML("Left Panel"), rightPanel = new HTML("Right Panel"),
		centerPanel = new HTML("<h1>Center Panel</h1>");
	LayoutPanel p = new LayoutPanel();
	// old form for setting css class name
	leftPanel.getElement().setClassName("panelWithBorder");
	// new form for setting css class name
	rightPanel.setStyleName("panelWithBorder");
	// add 2nd css class
	rightPanel.addStyleName("gwt-Red-Text");
	// set css id
	centerPanel.getElement().setId("centerPanel");
	centerPanel.addStyleName("gwt-center");
	p.add(leftPanel);
	p.add(rightPanel);
	p.add(centerPanel);

	p.setWidgetLeftWidth(leftPanel, 0, Unit.PCT, 50, Unit.PCT); // Left panel 50% (PCT) from left
	p.setWidgetRightWidth(rightPanel, 0, Unit.PCT, 50, Unit.PCT); // Right panel 50% (PCT) from right

	// Center Panel
	p.setWidgetLeftRight(centerPanel, 5, Unit.EM, 5, Unit.EM); // 5em left and right border
	p.setWidgetTopBottom(centerPanel, 5, Unit.EM, 15, Unit.EM); // 5em top and bottom border

	Anchor anchor = new Anchor("TutorialsPoint", false, "http://www.tutorialspoint.com", "_blank");
	anchor.setStyleName("panelWithBorder");
	anchor.addStyleName("gwt-center");
	p.add(anchor);
	p.setWidgetLeftRight(anchor, 5, Unit.EM, 5, Unit.EM);
	p.setWidgetBottomHeight(anchor, 5, Unit.EM, 5, Unit.EM);

	return p;
    }
    
    public void onModuleLoad() {
	TabLayoutPanel p = new TabLayoutPanel(2.5, Unit.EM);
	
	p.add(getDockLayoutPanel(), "DockLayoutPanel");
	p.add(getLayoutPanel(), "LayoutPanel");
	p.add(new HTML("the other content"), "the other");
	RootLayoutPanel.get().add(p);
    }
}
