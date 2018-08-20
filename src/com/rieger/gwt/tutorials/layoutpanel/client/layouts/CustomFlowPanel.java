package com.rieger.gwt.tutorials.layoutpanel.client.layouts;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;

public class CustomFlowPanel extends DockLayoutPanel {
    public CustomFlowPanel() {
	super(Unit.EM);
	Widget north = new HTML(
		"<h1>Elemente sind auf 10% Breite begrenzt, sonst füllen sie die komplette Spalte</h1>");
	addNorth(north, 4);
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
	add(p);
    }
}
