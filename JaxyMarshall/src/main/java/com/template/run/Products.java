package com.template.run;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@XmlRootElement(name = "products")
@Data @NoArgsConstructor @ToString
public class Products {

	
	List<Product> product;
	
	
}
