package com.rieger.gwt.tutorials.layoutpanel.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.rieger.gwt.tutorials.layoutpanel.client.layouts.CustomTabLayoutPanel;

public class LayoutExamples implements EntryPoint {
    public void onModuleLoad() {
	RootLayoutPanel.get().add(new CustomTabLayoutPanel());
    }
}
