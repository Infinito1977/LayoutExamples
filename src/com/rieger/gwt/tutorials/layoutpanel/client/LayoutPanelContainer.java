package com.rieger.gwt.tutorials.layoutpanel.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class LayoutPanelContainer implements EntryPoint {
    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
	Widget leftPanel = new HTML("Left Panel"), rightPanel = new HTML("Right Panel"),
		centerPanel = new HTML("<h1><center>Center Panel</center></h1>");
	LayoutPanel p = new LayoutPanel();
	// old form for setting css class name
	leftPanel.getElement().setClassName("panelWithBorder");
	// new form for setting css class name
	rightPanel.setStyleName("panelWithBorder");
	// add 2nd css class
	rightPanel.addStyleName("gwt-Red-Text");
	// set css id
	centerPanel.getElement().setId("centerPanel");
	p.add(leftPanel);
	p.add(rightPanel);
	p.add(centerPanel);

	p.setWidgetLeftWidth(leftPanel, 0, Unit.PCT, 50, Unit.PCT); // Left panel 50% (PCT) from left
	p.setWidgetRightWidth(rightPanel, 0, Unit.PCT, 50, Unit.PCT); // Right panel 50% (PCT) from right

	// Center Panel
	p.setWidgetLeftRight(centerPanel, 5, Unit.EM, 5, Unit.EM); // 5em left and right border
	p.setWidgetTopBottom(centerPanel, 5, Unit.EM, 5, Unit.EM); // 5em top and bottom border

	RootLayoutPanel.get().add(p);
    }
}
