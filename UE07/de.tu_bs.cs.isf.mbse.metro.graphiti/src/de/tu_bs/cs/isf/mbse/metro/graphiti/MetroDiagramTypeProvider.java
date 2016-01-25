package de.tu_bs.cs.isf.mbse.metro.graphiti;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;

public class MetroDiagramTypeProvider extends AbstractDiagramTypeProvider implements IDiagramTypeProvider {

	public MetroDiagramTypeProvider() {
		super();
		setFeatureProvider(new MetroFeatureProvider(this));
	}
	//sjkdfhslkhfjskdf

}
