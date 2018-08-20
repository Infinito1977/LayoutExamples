package com.rieger.gwt.tutorials.layoutpanel.client.layouts;

import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Image;

public class CustomGrid extends DecoratorPanel {
    public CustomGrid() {
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

	add(grid);
    }
}
