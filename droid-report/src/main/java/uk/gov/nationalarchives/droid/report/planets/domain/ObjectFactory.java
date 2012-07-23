/**
 * Copyright (c) 2012, The National Archives <pronom@nationalarchives.gsi.gov.uk>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following
 * conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 *  * Neither the name of the The National Archives nor the
 *    names of its contributors may be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.22 at 11:40:59 AM GMT 
//


package uk.gov.nationalarchives.droid.report.planets.domain;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.gov.nationalarchives.droid.report.planets.domain package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 * @deprecated PLANETS XML is now generated using XSLT over normal report xml files. 
 */
@XmlRegistry
@Deprecated
public class ObjectFactory {

    private final static QName _FileProfile_QNAME = new QName("http://www.nationalarchives.gov.uk/CollectionProfile", "FileProfile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.gov.nationalarchives.droid.report.planets.domain
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ByFormatType }
     * 
     */
    public ByFormatType createByFormatType() {
        return new ByFormatType();
    }

    /**
     * Create an instance of {@link PathsProcessedType }
     * 
     */
    public PathsProcessedType createPathsProcessedType() {
        return new PathsProcessedType();
    }

    /**
     * Create an instance of {@link FileProfileType }
     * 
     */
    public FileProfileType createFileProfileType() {
        return new FileProfileType();
    }

    /**
     * Create an instance of {@link FormatItemType }
     * 
     */
    public FormatItemType createFormatItemType() {
        return new FormatItemType();
    }

    /**
     * Create an instance of {@link ByYearType }
     * 
     */
    public ByYearType createByYearType() {
        return new ByYearType();
    }

    /**
     * Create an instance of {@link YearItemType }
     * 
     */
    public YearItemType createYearItemType() {
        return new YearItemType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileProfileType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nationalarchives.gov.uk/CollectionProfile", name = "FileProfile")
    public JAXBElement<FileProfileType> createFileProfile(FileProfileType value) {
        return new JAXBElement<FileProfileType>(_FileProfile_QNAME, FileProfileType.class, null, value);
    }

}
