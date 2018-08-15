package com.rieger.gwt.tutorials.layoutpanel.client;

import com.rieger.gwt.tutorials.layoutpanel.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
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
	    + "attempting to contact the server. Please check your network "
	    + "connection and try again.";

    /**
     * Create a remote service proxy to talk to the server-side Greeting service.
     */
    private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
	Widget child0 = new Label("Left Panel"), child1 = new Label("Right Panel"),
		child2 = new Label("Center Panel");
	LayoutPanel p = new LayoutPanel();
	p.add(child0);
	p.add(child1);
	p.add(child2);

	p.setWidgetLeftWidth(child0, 0, Unit.PCT, 50, Unit.PCT); // Left panel
	p.setWidgetRightWidth(child1, 0, Unit.PCT, 50, Unit.PCT); // Right panel

	p.setWidgetLeftRight(child2, 5, Unit.EM, 5, Unit.EM); // Center panel
	p.setWidgetTopBottom(child2, 5, Unit.EM, 5, Unit.EM);

	RootLayoutPanel.get().add(p);
    }
}
