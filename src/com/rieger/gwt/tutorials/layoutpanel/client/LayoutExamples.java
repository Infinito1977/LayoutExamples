package com.rieger.gwt.tutorials.layoutpanel.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

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
	header.setStyleName("gwt-border");
	Widget footer = new HTML("footer");
	footer.setStyleName("gwt-border");
	Widget navigation = new HTML("navigation");
	navigation.setStyleName("gwt-border");
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
	details.setStyleName("gwt-border");

	p.addNorth(header, 150);
	p.addWest(navigation, 128);
	p.addSouth(footer, 150);
	p.add(details);

	return p;
    }
    
    public void onModuleLoad() {
	TabLayoutPanel p = new TabLayoutPanel(2.5, Unit.EM);
	
	p.add(getDockLayoutPanel(), "DockLayoutPanel");
	p.add(getLayoutPanel(), "LayoutPanel");
	p.add(getSplitLayoutPanel(), "SplitLayoutPanel");
	RootLayoutPanel.get().add(p);
    }
}
