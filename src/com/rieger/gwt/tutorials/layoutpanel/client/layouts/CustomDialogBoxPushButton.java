package com.rieger.gwt.tutorials.layoutpanel.client.layouts;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CustomDialogBoxPushButton extends PushButton {
    private static class MyDialog extends DialogBox {
	public MyDialog() {
	    // Set the dialog box's caption.
	    setText("My First Dialog");

	    // Enable animation.
	    setAnimationEnabled(true);

	    // Enable glass background.
	    setGlassEnabled(true);

	    // DialogBox is a SimplePanel, so you have to set its widget
	    // property to whatever you want its contents to be.
	    Button ok = new Button("OK");
	    ok.addClickHandler(new ClickHandler() {
		public void onClick(ClickEvent event) {
		    MyDialog.this.hide();
		}
	    });

	    Label label = new Label("This is a simple dialog box.");

	    VerticalPanel panel = new VerticalPanel();
	    panel.setHeight("100");
	    panel.setWidth("300");
	    panel.setSpacing(10);
	    panel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
	    panel.add(label);
	    panel.add(ok);

	    setWidget(panel);
	}
    }

    public CustomDialogBoxPushButton() {
	super("DialogBox");
	// add a clickListener to the push button
	addClickHandler(new ClickHandler() {
	    @Override
	    public void onClick(ClickEvent event) {
		// Instantiate the dialog box and show it.
		MyDialog myDialog = new MyDialog();

		int left = Window.getClientWidth() / 2;
		int top = Window.getClientHeight() / 2;
		myDialog.setPopupPosition(left, top);
		myDialog.show();
	    }
	});
    }
}
