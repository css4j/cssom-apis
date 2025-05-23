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
 * Import rule. @see
 * <a href="https://drafts.csswg.org/cssom-1/#the-cssimportrule-interface">The
 * <code>CSSImportRule</code> Interface</a>.
 */
public interface CSSImportRule extends CSSRule, org.w3c.dom.css.CSSImportRule {

	/**
	 * The layer name declared in the {@literal @}-rule.
	 * 
	 * @return the layer name, or the empty string if the layer is anonymous, or
	 *         {@code null} if the at-rule does not declare a layer.
	 */
	String getLayerName();

	/**
	 * The serialization of the <code>&lt;supports-condition&gt;</code> declared in
	 * the {@literal @}-rule.
	 * 
	 * @return the supports condition declared in the rule, or {@code null} if the
	 *         rule does not declare a supports condition.
	 */
	String getSupportsText();

}
