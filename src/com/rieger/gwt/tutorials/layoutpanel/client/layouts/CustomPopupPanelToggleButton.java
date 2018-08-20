package com.rieger.gwt.tutorials.layoutpanel.client.layouts;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.CloseEvent;
import com.google.gwt.event.logical.shared.CloseHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.ToggleButton;

public class CustomPopupPanelToggleButton extends ToggleButton {
    private PopupPanel popup = new PopupPanel(true);

    public CustomPopupPanelToggleButton() {
	super("PopupPanel");
	popup.setWidget(new HTML("<h1>PopupMenu</h1>Click outside of this popup to close it"));
	popup.addCloseHandler(new CloseHandler<PopupPanel>() {
	    @Override
	    public void onClose(CloseEvent<PopupPanel> event) {
		setDown(false);
	    }
	});
	popup.setGlassEnabled(true);

	// add a clickListener to the push button
	addClickHandler(new ClickHandler() {
	    @Override
	    public void onClick(ClickEvent event) {
		if (isDown()) {
		    int left = (int) ((Window.getClientWidth()) / 2.5);
		    int top = (int) ((Window.getClientHeight()) / 2.5);
		    popup.setPopupPosition(left, top);
		    popup.show();
		}
	    }
	});
    }

    public void setDown(boolean down) {
	super.setDown(down);
    }
}
