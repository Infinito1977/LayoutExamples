package com.rieger.gwt.tutorials.layoutpanel.client.layouts;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.rieger.gwt.tutorials.layoutpanel.client.i8n.CustomConstants;

public class CustomTabLayoutPanel extends DockLayoutPanel {
    private CustomConstants constants = GWT.create(CustomConstants.class);

    public CustomTabLayoutPanel() {
	super(Unit.EM);
	Widget northWidget = new HTML("<h1>TabLayoutPanel</h1>");
	addNorth(northWidget, 4);

	HorizontalPanel southPanel = new HorizontalPanel();
	southPanel.setSpacing(10);
	southPanel.add(new HTML("<h4>PopupPanel and DialogBox:</h2>"));
	southPanel.add(new HTML("&nbsp;"));
	southPanel.add(new CustomPopupPanelToggleButton());
	southPanel.add(new HTML("&nbsp;"));
	southPanel.add(new CustomDialogBoxPushButton());
	DecoratorPanel decoratorPanel = new DecoratorPanel();
	decoratorPanel.add(southPanel);
	addSouth(decoratorPanel, 2.7);

	TabLayoutPanel p = new TabLayoutPanel(2.5, Unit.EM);

	p.add(new CustomDockLayoutPanel(Unit.EM), "DockLayoutPanel");
	p.add(new CustomLayoutPanel(), "LayoutPanel");
	p.add(new CustomSplitLayoutPanel(), "SplitLayoutPanel");
	p.add(new CustomStackLayoutPanel(Unit.EM), "StackLayoutPanel");
	p.add(new CustomFlowPanel(), "FlowPanel");
	p.add(new CustomHorizontalPanel(), "HorizontalPanel (d)");
	p.add(new CustomVerticalPanel(), "VerticalPanel (d)");
	p.add(new CustomFlexTable(), "FlexTable");
	p.add(new CustomGrid(), "Grid inside DecoratorPanel");
	p.add(new CustomDeckPanel(), "DeckPanel inside VerticalPanel");
	p.add(new CustomFormPanel(), "FormPanel inside DecoratorPanel");

	p.selectTab(constants.selectedTab());

	add(p);
	CustomCssFormatter.addGWTStyles(this);
    }

}
