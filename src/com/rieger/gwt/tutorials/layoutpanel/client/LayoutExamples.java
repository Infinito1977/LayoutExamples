package com.rieger.gwt.tutorials.layoutpanel.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomDockLayoutPanel;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomFlexTable;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomFlowPanel;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomHorizontalPanel;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomLayoutPanel;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomCssFormatter;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomDeckPanel;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomSplitLayoutPanel;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomStackLayoutPanel;

public class LayoutExamples implements EntryPoint {
    public VerticalPanel getVerticalPanel() {
	VerticalPanel p = new VerticalPanel();
	for (int i = 0; i < 9; i++) {
	    Widget w = new HTML("<h2>" + i + "</h2>");
	    w.setStyleName("border border-primary rounded");
	    p.add(w);
	}
	// Fügt vor 9. Element folgendes Element hinzu
	Widget w_a = new HTML("<h2>a</h2>");
	w_a.setStyleName("border border-primary rounded");
	p.insert(w_a, 8);
	return p;
    }

    public Panel getGrid() {
	// Create a grid
	Grid grid = new Grid(2, 2);

	// Add images to the grid
	int numRows = grid.getRowCount();
	int numColumns = grid.getColumnCount();
	for (int row = 0; row < numRows; row++) {
	    for (int col = 0; col < numColumns; col++) {
		grid.setWidget(row, col, new Image("http://www.tutorialspoint.com/images/gwt-mini.png"));
	    }
	}

	DecoratorPanel decoratorPanel = new DecoratorPanel();
	decoratorPanel.add(grid);
	return decoratorPanel;
    }

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
	p.add(getVerticalPanel(), "VerticalPanel");
	p.add(new CustomFlexTable(), "FlexTable");
	p.add(getGrid(), "Grid inside DecoratorPanel");
	p.add(new CustomDeckPanel(), "DeckPanel inside VerticalPanel");

	outer.add(p);
	CustomCssFormatter.addGWTStyles(outer);
	RootLayoutPanel.get().add(outer);
    }
}
