package com.mitchell.ceica.document.unmarshal.jaxb;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import javax.xml.transform.Source;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamSource;

import com.mitchell.ceica.document.CeicaDocument;
import com.mitchell.ceica.document.unmarshal.Unmarshaller;

/**
 * The Class CiecaMarshaller.
 *
 * @param <T> the generic type
 */
public abstract class JaxbUnmarshaller<T> implements Unmarshaller<T> {

    private JAXBContext jaxbContext;
    
    private javax.xml.bind.Unmarshaller jaxbUnmarshaller;
    private Class<T> classToBeBound;

    /**
     * Instantiates a new JAXB marshaller.
     *
     * @param classToBeBound the class to be bound
     */
    protected JaxbUnmarshaller(Class<T> classToBeBound) {

        try {
            this.classToBeBound = classToBeBound;
            this.jaxbContext = JAXBContext.newInstance(classToBeBound);

            this.jaxbUnmarshaller = initUnMarshaler(jaxbContext);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* (non-Javadoc)
     * @see com.mitchell.estimate.service.marshallers.jaxb.Mashaller#unmarshal(java.lang.String)
     */
    @Override
    public T unmarshal(String input) {
        StreamSource ss = new StreamSource(new StringReader(input));
        return unmarshal(ss);
    };
    
    
    /* (non-Javadoc)
     * @see com.mitchell.ceica.document.unmarshal.Unmarshaller#unmarshal(javax.xml.transform.Source)
     */
    @Override
    public T unmarshal(Source source) {
        JAXBElement<T> object = null;
        try {
            object = jaxbUnmarshaller.unmarshal(source, classToBeBound);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return object.getValue();
    };
       
    /* (non-Javadoc)
     * @see com.mitchell.ceica.document.unmarshal.Unmarshaller#unmarshal(com.mitchell.ceica.document.CeicaDocument)
     */
    @Override
    public T unmarshal(CeicaDocument cDocument) {
        SAXSource source = cDocument.asSAXSource();
        return unmarshal(source);
    }

    private javax.xml.bind.Unmarshaller initUnMarshaler(JAXBContext jaxbContext) throws JAXBException {
        return jaxbContext.createUnmarshaller();
    }
}
