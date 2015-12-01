package com.mitchell.ceica.document;

import java.io.StringReader;

import javax.xml.transform.sax.SAXSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.xml.sax.InputSource;

/**
 * The Class CeicaDocument.
 */
public class CeicaDocument {
    
    protected String sDocument;
    
    protected InputSource source;
    
    protected XPath xpath;

    /**
     * Instantiates a new CEICA document.
     *
     * @param sDocument - the source document
     */
    public CeicaDocument(String sDocument) {
        this.sDocument = sDocument;
        this.source = asInputSource(sDocument);
        this.xpath = XPathFactory.newInstance().newXPath();
    }
    
    /**
     * Gets the document version.
     *
     * @return the document version
     */
    public String getDocumentVersion() {
        String version = null;
        try {
            version = xpath.evaluate("/*/DocumentInfo/BMSVer", source);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        
        return version;
    }

    /**
     * As SAX source.
     *
     * @return the SAX source
     */
    public SAXSource asSAXSource() {
        return asSAXSource(sDocument);
    }
    
    private InputSource asInputSource(String sDocument) {
        return new InputSource(new StringReader(sDocument));
    }
    
    private SAXSource asSAXSource(String sDocument) {
        return new SAXSource(asInputSource(sDocument));
    }
}
