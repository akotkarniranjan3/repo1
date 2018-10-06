package com.template.run;

import java.math.BigDecimal;
import java.util.Map;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;


@XmlRootElement(name = "product")
@ToString @NoArgsConstructor @AllArgsConstructor

public class Product {
    @XmlAttribute(name = "id")
    private String productId;
    @XmlElement(name = "description")
    private String description;
    @XmlElement(name = "price")
    private BigDecimal price;
    @XmlElement(name = "createdBy")
    private User createdBy;
    
    @XmlElement(name = "Price_History")
    private Map<String , Integer> mp;
    
    
 
  
}