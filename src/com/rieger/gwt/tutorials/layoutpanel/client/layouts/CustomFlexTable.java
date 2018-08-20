package com.rieger.gwt.tutorials.layoutpanel.client.layouts;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CustomFlexTable extends FlexTable {
    public CustomFlexTable() {
	FlexCellFormatter cellFormatter = getFlexCellFormatter();
	addStyleName("flexTable");
	setWidth("32em");
	setCellSpacing(5);
	setCellPadding(3);

	// Add some text
	cellFormatter.setHorizontalAlignment(0, 1, HasHorizontalAlignment.ALIGN_LEFT);
	setHTML(0, 0, "This is a FlexTable that supports" + " <b>colspans</b> and <b>rowspans</b>."
		+ " You can use it to format your page" + " or as a special purpose table.");
	cellFormatter.setColSpan(0, 0, 2);

	// Add a button that will add more rows to the table
	Button addRowButton = new Button("Add a Row");
	addRowButton.addClickHandler(new ClickHandler() {
	    @Override
	    public void onClick(ClickEvent event) {
		addRow();
	    }
	});

	addRowButton.addStyleName("fixedWidthButton");

	// Add a button that will add more rows to the table
	Button removeRowButton = new Button("Remove a Row");
	removeRowButton.addClickHandler(new ClickHandler() {
	    @Override
	    public void onClick(ClickEvent event) {
		removeRow();
	    }
	});

	removeRowButton.addStyleName("fixedWidthButton");

	VerticalPanel buttonPanel = new VerticalPanel();
	buttonPanel.setStyleName("flexTable-buttonPanel");
	buttonPanel.add(addRowButton);
	buttonPanel.add(removeRowButton);
	setWidget(0, 1, buttonPanel);
	cellFormatter.setVerticalAlignment(0, 1, HasVerticalAlignment.ALIGN_TOP);

	// Add two rows to start
	addRow();
	addRow();
    }

    /**
     * Add a row to the flex table.
     */
    private void addRow() {
	int numRows = getRowCount();
	setWidget(numRows, 0, new Image("http://www.tutorialspoint.com/images/gwt-mini.png"));
	setWidget(numRows, 1, new Image("http://www.tutorialspoint.com/images/gwt-mini.png"));
	getFlexCellFormatter().setRowSpan(0, 1, numRows + 1);
    }

    /**
     * Remove a row from the flex table.
     */
    private void removeRow() {
	int numRows = getRowCount();
	if (numRows > 1) {
	    removeRow(numRows - 1);
	    getFlexCellFormatter().setRowSpan(0, 1, numRows - 1);
	}
    }
}
