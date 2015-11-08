package com.mitchell.ceica.document.marshal.jaxb;

import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import com.mitchell.ceica.document.marshal.Marshaller;

/**
 * The Class CiecaMarshaller.
 *
 * @param <T> the generic type
 */
public abstract class JaxbMarshaller<T> implements Marshaller<T> {

    private JAXBContext jaxbContext;
    
    private javax.xml.bind.Marshaller jaxbMarshaller;
    

    /**
     * Instantiates a new JAXB marshaller.
     *
     * @param classToBeBound the class to be bound
     */
    protected JaxbMarshaller(Class<T> classToBeBound) {

        try {
            this.jaxbContext = JAXBContext.newInstance(classToBeBound);

            this.jaxbMarshaller = initMarshaler(jaxbContext);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* (non-Javadoc)
     * @see com.mitchell.estimate.service.marshallers.jaxb.Mashaller#marshal(java.lang.Object, java.io.Writer)
     */
    @Override
    public void marshal(Object object, Writer writer) {
        try {
            jaxbMarshaller.marshal(object, writer);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
   }

    private javax.xml.bind.Marshaller initMarshaler(JAXBContext jaxbContext) throws JAXBException {
        javax.xml.bind.Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        return jaxbMarshaller;
    }
}
