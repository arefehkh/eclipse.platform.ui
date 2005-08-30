/*******************************************************************************
 * Copyright (c) 2000, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.ui.tests.api;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * This perspective is used for testing api. It defines an initial layout with
 * placeholders for some views, to be used to test closing fast views. The
 * placeholders are added at top level (not in any folder).
 * 
 * @since 3.1.1
 */
public class PerspectiveViewsBug88345 implements IPerspectiveFactory {

	public static final String NORMAL_VIEW_ID = "org.eclipse.ui.views.ContentOutline";
	public static final String PERSP_ID = "org.eclipse.ui.tests.api.PerspectiveViewsBug88345";

	public PerspectiveViewsBug88345() {
		// do nothing
	}

	public void createInitialLayout(IPageLayout layout) {
		layout.addView(MockViewPart.IDMULT, IPageLayout.LEFT, 0.33f,
				IPageLayout.ID_EDITOR_AREA);
		layout.addView(NORMAL_VIEW_ID,
				IPageLayout.RIGHT, 0.25f, IPageLayout.ID_EDITOR_AREA);
		layout.getViewLayout(MockViewPart.IDMULT).setCloseable(false);
	}
}
