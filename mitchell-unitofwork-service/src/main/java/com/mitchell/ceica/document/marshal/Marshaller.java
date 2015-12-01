package com.mitchell.ceica.document.marshal;

import java.io.Writer;

public interface Marshaller<T> {

    /**
     * Marshal.
     *
     * @param object the object
     * @return the string
     */
    public abstract void marshal(Object object, Writer writer);
}