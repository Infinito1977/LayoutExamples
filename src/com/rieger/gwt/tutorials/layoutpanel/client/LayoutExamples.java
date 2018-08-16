package com.rieger.gwt.tutorials.layoutpanel.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class LayoutExamples implements EntryPoint {
    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
	TabLayoutPanel p = new TabLayoutPanel(2.5, Unit.EM);
	p.add(new HTML("this content"), "this");
	p.add(new HTML("that content"), "that");
	p.add(new HTML("the other content"), "the other");
	RootLayoutPanel.get().add(p);
    }
}
