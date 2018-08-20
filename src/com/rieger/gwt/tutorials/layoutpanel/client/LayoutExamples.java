package com.rieger.gwt.tutorials.layoutpanel.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.DeckPanel;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.StackLayoutPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomFlexTable;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomLayout;

public class LayoutExamples implements EntryPoint {
    public DockLayoutPanel getDockLayoutPanel() {
	DockLayoutPanel p = new DockLayoutPanel(Unit.EM);
	Widget header = new HTML("header");
	header.setStyleName("border border-primary rounded gwt-border-2px");
	Widget footer = new HTML("footer");
	footer.setStyleName("border border-primary rounded gwt-border-2px");
	Widget navigation = new HTML("navigation");
	navigation.setStyleName("border border-primary rounded gwt-border-2px");
	Widget details = new HTML("<h1>Layout with Bootstrap</h1>");
	details.setStyleName("border border-primary rounded gwt-border-2px");

	p.addNorth(header, 2);
	p.addSouth(footer, 2);
	p.addWest(navigation, 10);
	p.add(details);

	return p;
    }

    public LayoutPanel getLayoutPanel() {
	Widget leftPanel = new HTML("Left Panel"), rightPanel = new HTML("Right Panel"),
		centerPanel = new HTML("<h1>Center Panel</h1>");
	LayoutPanel p = new LayoutPanel();
	// old form for setting css class name
	leftPanel.getElement().setClassName("panelWithBorder");
	// new form for setting css class name
	rightPanel.setStyleName("panelWithBorder");
	// add 2nd css class
	rightPanel.addStyleName("gwt-Red-Text");
	// set css id
	centerPanel.getElement().setId("centerPanel");
	centerPanel.addStyleName("gwt-center");
	p.add(leftPanel);
	p.add(rightPanel);
	p.add(centerPanel);

	p.setWidgetLeftWidth(leftPanel, 0, Unit.PCT, 50, Unit.PCT); // Left panel 50% (PCT) from left
	p.setWidgetRightWidth(rightPanel, 0, Unit.PCT, 50, Unit.PCT); // Right panel 50% (PCT) from right

	// Center Panel
	p.setWidgetLeftRight(centerPanel, 5, Unit.EM, 5, Unit.EM); // 5em left and right border
	p.setWidgetTopBottom(centerPanel, 5, Unit.EM, 15, Unit.EM); // 5em top and bottom border

	Anchor anchor = new Anchor("TutorialsPoint", false, "http://www.tutorialspoint.com", "_blank");
	anchor.setStyleName("panelWithBorder");
	anchor.addStyleName("gwt-center");
	p.add(anchor);
	p.setWidgetLeftRight(anchor, 5, Unit.EM, 5, Unit.EM);
	p.setWidgetBottomHeight(anchor, 5, Unit.EM, 5, Unit.EM);

	return p;
    }

    public SplitLayoutPanel getSplitLayoutPanel() {
	SplitLayoutPanel p = new SplitLayoutPanel();
	Widget header = new HTML("header");
	header.setStyleName("gwt-round-border");
	Widget footer = new HTML("footer");
	footer.setStyleName("gwt-round-border");
	Widget navigation = new HTML("navigation");
	navigation.setStyleName("gwt-round-border");
	Widget details = new HTML(
		"Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.   \r\n"
			+ "\r\n"
			+ "Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.   \r\n"
			+ "\r\n"
			+ "Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.   \r\n"
			+ "\r\n"
			+ "Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.   \r\n"
			+ "\r\n"
			+ "Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis.   \r\n"
			+ "\r\n"
			+ "At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, At accusam aliquyam diam diam dolore dolores duo eirmod eos erat, et nonumy sed tempor et et invidunt justo labore Stet clita ea et gubergren, kasd magna no rebum. sanctus sea sed takimata ut vero voluptua. est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur");
	details.setStyleName("gwt-round-border");

	p.addNorth(header, 150);
	p.addWest(navigation, 128);
	p.addSouth(footer, 150);
	p.add(details);

	return p;
    }

    public StackLayoutPanel getStackLayoutPanel() {
	StackLayoutPanel p = new StackLayoutPanel(Unit.EM);
	p.add(new HTML("this content"), new HTML("this"), 4);
	p.add(new HTML("that content"), new HTML("that"), 4);
	p.add(new HTML("the other content"), new HTML("the other"), 4);
	return p;
    }

    public DockLayoutPanel getFlowPanel() {
	DockLayoutPanel outer = new DockLayoutPanel(Unit.EM);
	Widget north = new HTML(
		"<h1>Elemente sind auf 10% Breite begrenzt, sonst füllen sie die komplette Spalte</h1>");
	outer.addNorth(north, 4);
	FlowPanel p = new FlowPanel();
	for (int i = 0; i < 9; i++) {
	    Widget w = new HTML("<h2>" + i + "</h2>");
	    w.setStyleName("border border-primary rounded gwt-width-10pc");
	    p.add(w);
	}
	// Fügt vor 9. Element folgendes Element hinzu
	Widget w_a = new HTML("<h2>a</h2>");
	w_a.setStyleName("border border-primary rounded gwt-width-10pc");
	p.insert(w_a, 8);
	outer.add(p);
	return outer;
    }

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
	Label label1 = new Label("This is first Page");
	Label label2 = new Label("This is second Page");
	Label label3 = new Label("This is third Page");

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

	p.add(getDockLayoutPanel(), "DockLayoutPanel");
	p.add(getLayoutPanel(), "LayoutPanel");
	p.add(getSplitLayoutPanel(), "SplitLayoutPanel");
	p.add(getStackLayoutPanel(), "StackLayoutPanel");
	p.add(getFlowPanel(), "FlowPanel");
	p.add(getHorizontalPanel(), "HorizontalPanel");
	p.add(getVerticalPanel(), "VerticalPanel");
	p.add(new CustomFlexTable(), "FlexTable");
	p.add(getGrid(), "Grid inside DecoratorPanel");
	p.add(getDeckPanel(), "DeckPanel inside VerticalPanel");

	outer.add(p);
	CustomLayout.addGWTStyles(outer);
	RootLayoutPanel.get().add(outer);
    }
}
