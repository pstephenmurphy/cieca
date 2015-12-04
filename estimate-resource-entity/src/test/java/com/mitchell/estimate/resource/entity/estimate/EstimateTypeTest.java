package com.mitchell.estimate.resource.entity.estimate;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mitchell.estimate.resource.entity.estimate.EstimateType;

public class EstimateTypeTest {

    private JAXBContext jaxbContext;
    private File inout;

    @Before
    public void setUp() throws Exception {

        jaxbContext = JAXBContext.newInstance(EstimateType.class);
        
         inout = new File("sample");
    }

    @After
    public void tearDown() throws Exception {
        inout.delete();
    }

    @Test
    public void generateSchema() throws IOException {

        SchemaOutputResolver outputResolver = new SchemaOutputResolver() {
            @Override
            public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
                StreamResult result = new StreamResult(System.out);

                result.setSystemId("EstimateType/EstimateType");

                return result;
            }
        };

        jaxbContext.generateSchema(outputResolver);

    }
    
    @Test 
    public void marshal() throws JAXBException {
        Marshaller marshaller = jaxbContext.createMarshaller();
        
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        
        marshaller.marshal(new EstimateType(), inout);
    }

   
}
