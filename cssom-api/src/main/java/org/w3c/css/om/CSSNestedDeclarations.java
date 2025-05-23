/*
 * This software extends interfaces defined by CSS Object Model
 *  (https://www.w3.org/TR/cssom-1/).
 * Copyright © 2016 W3C® (MIT, ERCIM, Keio, Beihang).
 * https://www.w3.org/Consortium/Legal/2015/copyright-software-and-document
 */
/*
 * SPDX-License-Identifier: W3C-20150513
 */

package org.w3c.css.om;

/**
 * A CSS rule that contains declarations in a nested rule context.
 */
public interface CSSNestedDeclarations extends CSSRule {

	/**
	 * Get the style that represents the nested declarations.
	 *
	 * @return the nested style declaration.
	 */
	CSSStyleDeclaration getStyle();

}
