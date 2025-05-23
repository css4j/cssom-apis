/*
 * This software extends interfaces defined by CSS Conditional Rules Module Level 5
 *  (https://drafts.csswg.org/css-conditional-5/).
 * Copyright © 2013 W3C® (MIT, ERCIM, Keio, Beihang).
 * https://www.w3.org/Consortium/Legal/2015/copyright-software-and-document
 */
/* 
 * SPDX-License-Identifier: W3C-20150513
 */

package org.w3c.css.om;

/**
 * Represents a ‘{@literal @}container’ rule.
 */
public interface CSSContainerRule extends CSSConditionRule {

	String getContainerName();

	String getContainerQuery();

}
