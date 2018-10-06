package com.template.run;



import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CookRepository extends CrudRepository<Cook , Integer> {

	

    @Query("Select c from Cook c where c.name =  :sear ")
   public List<Cook> findBySearchTerm(@Param("sear") String sear );
    
    public List<Cook> findByName(String name);
	
}
