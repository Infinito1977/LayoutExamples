package com.rieger.gwt.tutorials.layoutpanel.client.layouts;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class CustomTabLayoutPanel extends DockLayoutPanel {
    public CustomTabLayoutPanel() {
	super(Unit.EM);
	Widget north = new HTML("<h1>TabLayoutPanel</h1>");
	addNorth(north, 4);

	TabLayoutPanel p = new TabLayoutPanel(2.5, Unit.EM);

	p.add(new CustomDockLayoutPanel(Unit.EM), "DockLayoutPanel");
	p.add(new CustomLayoutPanel(), "LayoutPanel");
	p.add(new CustomSplitLayoutPanel(), "SplitLayoutPanel");
	p.add(new CustomStackLayoutPanel(Unit.EM), "StackLayoutPanel");
	p.add(new CustomFlowPanel(), "FlowPanel");
	p.add(new CustomHorizontalPanel(), "HorizontalPanel");
	p.add(new CustomVerticalPanel(), "VerticalPanel");
	p.add(new CustomFlexTable(), "FlexTable");
	p.add(new CustomGrid(), "Grid inside DecoratorPanel");
	p.add(new CustomDeckPanel(), "DeckPanel inside VerticalPanel");

	add(p);
	CustomCssFormatter.addGWTStyles(this);
    }

}
