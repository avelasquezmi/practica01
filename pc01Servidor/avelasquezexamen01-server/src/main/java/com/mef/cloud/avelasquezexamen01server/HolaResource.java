package com.mef.cloud.avelasquezexamen01server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/hola/server")
public class HolaResource {
	
	
	@GetMapping
	@RequestMapping ("/{id}")
	public String hola(@PathVariable("id") String id) {

		 if(id.equals("1")){
			    id="JUAN";
			}
			 if(id.equals("2")){
				 id="CARLOS";
		
			}
		return "Hola "+id;
	}
}
