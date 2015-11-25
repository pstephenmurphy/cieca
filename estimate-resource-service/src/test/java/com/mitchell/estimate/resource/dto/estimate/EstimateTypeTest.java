package com.mitchell.estimate.resource.dto.estimate;

import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EstimateTypeTest {

    private JAXBContext jaxbContext;

    @Before
    public void setUp() throws Exception {

        jaxbContext = JAXBContext.newInstance(EstimateType.class);
    }

    @After
    public void tearDown() throws Exception {
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
}