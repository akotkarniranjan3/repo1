package com.template.run;

import java.io.File;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;

public class XmlToProd {
    private Products product;
    @Test
    public void testXmlToObject() throws JAXBException, FileNotFoundException {
        File file = new File("producty.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Products.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        product = (Products) unmarshaller.unmarshal(file);
        System.out.println(product);
    }
}