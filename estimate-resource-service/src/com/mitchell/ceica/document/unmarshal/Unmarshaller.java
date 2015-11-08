package com.mitchell.ceica.document.unmarshal;

import javax.xml.transform.Source;

import com.mitchell.ceica.document.CeicaDocument;

public interface Unmarshaller<T> {

    /**
     * Unmarshal.
     *
     * @param input the input
     * 
     * @return the unmarshalled object
     */
    public T unmarshal(String input);
    
    /**
     * Unmarshal.
     *
     * @param cDocument the c document
     * 
     * @return the unmarshelled object
     */
    public T unmarshal(CeicaDocument cDocument);
    
    /**
     * Unmarshal.
     *
     * @param source the source
     * 
     * @return the unmarshelled object
     */
    public T unmarshal(Source source);

}