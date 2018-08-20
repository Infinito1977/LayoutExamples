package com.rieger.gwt.tutorials.layoutpanel.client.layouts;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.rieger.gwt.tutorials.layoutpanel.client.i8n.CustomMessages;

public class CustomSplitLayoutPanel extends SplitLayoutPanel {
    private CustomMessages messages = GWT.create(CustomMessages.class);
    
    public CustomSplitLayoutPanel() {
	Widget header = new HTML("header");
	header.setStyleName("gwt-round-border");
	Widget footer = new HTML("footer");
	footer.setStyleName("gwt-round-border");
	Widget navigation = new HTML("navigation");
	navigation.setStyleName("gwt-round-border");
	ScrollPanel detailsPanel = new ScrollPanel();
	Widget details = new HTML("<h1>Inside ScrollPanel</h1>" + messages.loreIpsum10k());
	details.setStyleName("gwt-round-border");
	detailsPanel.add(details);

	addNorth(header, 150);
	addWest(navigation, 128);
	addSouth(footer, 150);
	add(detailsPanel);
    }
}
