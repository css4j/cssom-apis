/*
 * This software extends interfaces defined by CSS Conditional Rules Module Level 3
 *  (https://www.w3.org/TR/css3-conditional/).
 * Copyright © 2013 W3C® (MIT, ERCIM, Keio, Beihang).
 * https://www.w3.org/Consortium/Legal/2015/copyright-software-and-document
 */
/* 
 * SPDX-License-Identifier: W3C-20150513
 */

package org.w3c.css.om;

/**
 * Represents a ‘{@literal @}layer’ block rule.
 */
public interface CSSLayerBlockRule extends CSSGroupingRule {

	/**
	 * The layer name.
	 * 
	 * @return the layer name declared by the at-rule, or the empty string if the
	 *         layer is anonymous.
	 */
	String getName();

}
