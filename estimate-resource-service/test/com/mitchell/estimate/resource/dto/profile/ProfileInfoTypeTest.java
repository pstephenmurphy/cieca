package com.mitchell.estimate.resource.dto.profile;

import java.io.IOException;
import java.util.List;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mitchell.estimate.resource.dto.rate.RateInfoType;

public class ProfileInfoTypeTest {
    
    private ProfileInfoType profile;
    private List<RateInfoType> rates;
    
    private JAXBContext jaxbContext;
    
    @Before
    public void setUp() throws Exception {
        profile = new ProfileInfoType();
        rates = profile.getRateInfo();
        
        jaxbContext = JAXBContext.newInstance(ProfileInfoType.class);
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
                
                result.setSystemId("ProfileInfoType/RateInfoType");
                
                return result;
            }
        };
        
        jaxbContext.generateSchema(outputResolver);
        
    }
}
