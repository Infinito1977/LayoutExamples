package com.rieger.gwt.tutorials.layoutpanel.client.layouts;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.ToggleButton;

public class CustomPopupPanelToggleButton extends ToggleButton {
    public CustomPopupPanelToggleButton() {
	super("PopupPanel");
	// add a clickListener to the push button
	addClickHandler(new ClickHandler() {
	    @Override
	    public void onClick(ClickEvent event) {
		Window.alert("Hello World!");
	    }
	});
    }
}
