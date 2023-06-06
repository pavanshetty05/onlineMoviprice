package com.example.online.movipricing.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.online.movipricing.module.MovePriceModule;

@RestController
@RequestMapping(value = "/movi")
public class MovepriceController {
	
	Logger log = 
	        LoggerFactory.getLogger(MovepriceController.class);
	
	@RequestMapping(value = "/price", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody MovePriceModule addMoveDetails(@RequestBody MovePriceModule ouser) {
		log.info("Came inside the add");
		return ouser;
	}

	@RequestMapping(value = "/price", method = RequestMethod.GET)
	public @ResponseBody MovePriceModule getMoveDetails() {
		log.info("Came inside the get");
		MovePriceModule ouserMapping = new MovePriceModule( );
		ouserMapping.setMoveID("pavan");
		ouserMapping.setMoveprice("3000");
		return ouserMapping;
	}

	@RequestMapping(value = "/price", method = RequestMethod.DELETE, consumes = "application/json")
	public @ResponseBody MovePriceModule removeDetails(@RequestBody MovePriceModule ouser) {
		log.info("Came inside the remove");
		return ouser;
	}

	@RequestMapping(value = "/price", method = RequestMethod.PUT, consumes = "application/json")
	public @ResponseBody MovePriceModule updateMoveDetails(@RequestBody MovePriceModule ouser) {
		log.info("Came inside the Update");
		return ouser;
	}
}
