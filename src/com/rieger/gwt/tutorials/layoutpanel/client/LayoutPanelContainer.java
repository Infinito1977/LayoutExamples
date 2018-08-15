package com.rieger.gwt.tutorials.layoutpanel.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
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
     * The message displayed to the user when the server cannot be reached or
     * returns an error.
     */
    private static final String SERVER_ERROR = "An error occurred while "
	    + "attempting to contact the server. Please check your network " + "connection and try again.";

    /**
     * Create a remote service proxy to talk to the server-side Greeting service.
     */
    private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
	Widget child0 = new HTML("Left Panel"), child1 = new HTML("Right Panel"), child2 = new HTML("Center Panel");
	LayoutPanel p = new LayoutPanel();
	child0.getElement().setClassName("panelWithBorder");
	child1.getElement().setClassName("panelWithBorder");
	child2.getElement().setClassName("panelWithBorder");
	p.add(child0);
	p.add(child1);
	p.add(child2);

	p.setWidgetLeftWidth(child0, 0, Unit.PCT, 50, Unit.PCT); // Left panel 50% (PCT) from left
	p.setWidgetRightWidth(child1, 0, Unit.PCT, 50, Unit.PCT); // Right panel 50% (PCT) from right

	// Center Panel
	p.setWidgetLeftRight(child2, 5, Unit.EM, 5, Unit.EM); // 5em left and right border
	p.setWidgetTopBottom(child2, 5, Unit.EM, 5, Unit.EM); // 5em top and bottom border

	RootLayoutPanel.get().add(p);
    }
}
