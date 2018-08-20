package com.rieger.gwt.tutorials.layoutpanel.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomDockLayoutPanel;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomFlexTable;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomFlowPanel;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomGrid;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomHorizontalPanel;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomLayoutPanel;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomCssFormatter;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomDeckPanel;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomSplitLayoutPanel;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomStackLayoutPanel;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomVerticalPanel;

public class LayoutExamples implements EntryPoint {
    public void onModuleLoad() {
	DockLayoutPanel outer = new DockLayoutPanel(Unit.EM);
	Widget north = new HTML("<h1>TabLayoutPanel</h1>");
	outer.addNorth(north, 4);

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

	outer.add(p);
	CustomCssFormatter.addGWTStyles(outer);
	RootLayoutPanel.get().add(outer);
    }
}
