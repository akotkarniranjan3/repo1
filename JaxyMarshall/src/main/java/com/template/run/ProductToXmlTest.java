package com.template.run;

import java.io.File; 
import java.io.FileNotFoundException;

import java.math.BigDecimal;
import java.util.HashMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ProductToXmlTest {
    private Product product;
    @Before
    public void setUp() {
        long l = 10;
        Long longId = new Long(l);
        User user = new User(longId, "John", "john@springframework.guru");
        
        
        HashMap<String , Integer> hm = new HashMap<String , Integer>();
        hm.put("2008", 19);
        hm.put("2009", 29);   
        product = new Product("PO1", "Spring Guru Mug", new BigDecimal(18.95), user,hm );
    }
    @After
    public void tearDown() {
        product = null;
    }
    @Test
    public void testObjectToXml() throws JAXBException, FileNotFoundException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Product.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(product, new File("product.xml"));
        marshaller.marshal(product, System.out);
    }
}
