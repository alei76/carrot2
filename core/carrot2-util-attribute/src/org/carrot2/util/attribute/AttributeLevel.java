
/*
 * Carrot2 project.
 *
 * Copyright (C) 2002-2008, Dawid Weiss, Stanisław Osiński.
 * Portions (C) Contributors listed in "carrot2.CONTRIBUTORS" file.
 * All rights reserved.
 *
 * Refer to the full license file "carrot2.LICENSE"
 * in the root folder of the repository checkout or at:
 * http://www.carrot2.org/carrot2.LICENSE
 */

package org.carrot2.util.attribute;

import org.apache.commons.lang.StringUtils;

public enum AttributeLevel
{
    BASIC,

    MEDIUM,

    ADVANCED;

    @Override
    public String toString()
    {
        return StringUtils.capitalize(name().toLowerCase());
    }
}