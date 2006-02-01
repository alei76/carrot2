
/*
 * Carrot2 project.
 *
 * Copyright (C) 2002-2006, Dawid Weiss, Stanisław Osiński.
 * Portions (C) Contributors listed in "carrot2.CONTRIBUTORS" file.
 * All rights reserved.
 *
 * Refer to the full license file "carrot2.LICENSE"
 * in the root folder of the repository checkout or at:
 * http://www.carrot2.org/carrot2.LICENSE
 */

package com.dawidweiss.carrot.filter.stc.algorithm;


import java.util.List;


/**
 * Class representing a single document reference.
 */
public final class DocReference
{
    /** Document url */
    private String url;

    /** Document title */
    private String title;

    /** List of sentences (List) consisting of words (Strings) */
    private List snippet;

    /** Stemmed snippet */
    private ArrayStemmedSnippet stemmedSnippet = null;

    /** Original snippet string. Needed for later presentation */
    private String originalSnippet;

    /**
     * You can't instantiate empty doc reference outside of this
     * package.
     */
    protected DocReference()
    {
    }

    /**
     * The url of this document
     */
    public String getURLAsString()
    {
        return url;
    }


    /**
     * The title of this document as determined by datasource
     */
    public String getTitle()
    {
        return title;
    }


    /**
     * The url of this document
     */
    public List getSnippet()
    {
        return snippet;
    }


    /**
     * Returns original snippet text
     */
    public String getUnprocessedSnippet()
    {
        return this.originalSnippet;
    }


    /**
     * Returns StemmedSnippet object, if any, or null. This DocReference object must be processed
     * with some other class in order to contain StemmedSnippet object.
     */
    public ArrayStemmedSnippet getStemmedSnippet()
    {
        return this.stemmedSnippet;
    }


    /**
     * Sets the value of StemmedSnippet for this object.
     */
    public void setStemmedSnippet(ArrayStemmedSnippet s)
    {
        stemmedSnippet = s;
    }

    /**
     * Legal constructor
     */
    public DocReference(String url, String title, List snippet, String originalSnippet)
    {
        this.url = url;
        this.title = title;
        this.snippet = snippet;
        this.originalSnippet = originalSnippet;
    }

    public String toString()
    {
        return "(" + url + " : \"" + this.title + "\" : \"" + this.snippet + "\")";
    }
}
