package com.rieger.gwt.tutorials.layoutpanel.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.DeckPanel;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomDockLayoutPanel;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomFlexTable;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomFlowPanel;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomLayoutPanel;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomCssFormatter;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomSplitLayoutPanel;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomStackLayoutPanel;

public class LayoutExamples implements EntryPoint {
    public HorizontalPanel getHorizontalPanel() {
	HorizontalPanel p = new HorizontalPanel();
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

    public ComplexPanel getDeckPanel() {
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

	VerticalPanel vPanel = new VerticalPanel();
	vPanel.add(deckPanel);
	vPanel.add(buttonBar);
	return vPanel;
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
	p.add(getHorizontalPanel(), "HorizontalPanel");
	p.add(getVerticalPanel(), "VerticalPanel");
	p.add(new CustomFlexTable(), "FlexTable");
	p.add(getGrid(), "Grid inside DecoratorPanel");
	p.add(getDeckPanel(), "DeckPanel inside VerticalPanel");

	outer.add(p);
	CustomCssFormatter.addGWTStyles(outer);
	RootLayoutPanel.get().add(outer);
    }
}
