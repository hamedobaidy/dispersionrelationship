package com.hamedapps.dispersionrelationship.components;

import org.eclipse.swt.widgets.Composite;

public class DispersionChart extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public DispersionChart(Composite parent, int style) {
		super(parent, style);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
