package com.rieger.gwt.tutorials.layoutpanel.client.layouts;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DeckPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CustomDeckPanel extends VerticalPanel {
    public CustomDeckPanel() {
	// Create DeckPanel widget
	final DeckPanel deckPanel = new DeckPanel();
	deckPanel.setSize("300px", "120px");
	deckPanel.setStyleName("deckpanel");

	// Create lables to add to deckpanel
	Label label1 = new HTML("<h1>This is first Page</h1>");
	Label label2 = new HTML("<h1>This is second Page</h1>");
	Label label3 = new HTML("<h1>This is third Page</h1>");

	// Add labels to deckpanel
	deckPanel.add(label1);
	deckPanel.add(label2);
	deckPanel.add(label3);

	// show first label
	deckPanel.showWidget(0);

	// create button bar
	HorizontalPanel buttonBar = new HorizontalPanel();
	buttonBar.setSpacing(5);

	// create button and add click handlers
	// show different labels on click of different buttons
	Button button1 = new Button("Page 1");
	button1.addClickHandler(new ClickHandler() {
	    @Override
	    public void onClick(ClickEvent event) {
		deckPanel.showWidget(0);
	    }
	});

	Button button2 = new Button("Page 2");
	button2.addClickHandler(new ClickHandler() {
	    @Override
	    public void onClick(ClickEvent event) {
		deckPanel.showWidget(1);
	    }
	});

	Button button3 = new Button("Page 3");
	button3.addClickHandler(new ClickHandler() {
	    @Override
	    public void onClick(ClickEvent event) {
		deckPanel.showWidget(2);
	    }
	});

	buttonBar.add(button1);
	buttonBar.add(button2);
	buttonBar.add(button3);

	add(deckPanel);
	add(buttonBar);
    }
}
