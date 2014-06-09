package org.eclipse.rcptt.launching.multiaut.ui;

import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class MultiAutContentProvider implements IStructuredContentProvider {

	@Override
	public void dispose() {
		// Nothing to do
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// Nothing to do
	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (!(inputElement instanceof List<?>)) {
			MultiAutUIPlugin.logWarn("Unexpected input type");
			return new Object[0];
		}
		return ((List<?>) inputElement).toArray();
	}

}
