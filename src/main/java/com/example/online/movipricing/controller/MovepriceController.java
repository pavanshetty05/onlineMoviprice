package com.example.online.movipricing.controller;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
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
	
	//Logger  ologger=(Logger) LogFactory.getLog(MovepriceController.class);
	
	@RequestMapping(value = "/price", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody MovePriceModule addMoveDetails(@RequestBody MovePriceModule ouser) {
		//ologger.info("Came inside the add");
		return ouser;
	}

	@RequestMapping(value = "/price", method = RequestMethod.GET, consumes = "application/json")
	public @ResponseBody MovePriceModule getMoveDetails(@PathVariable String moveID) {
		//ologger.info("Came inside the get");
		MovePriceModule ouserMapping = new MovePriceModule(moveID, null);
		return ouserMapping;
	}

	@RequestMapping(value = "/price", method = RequestMethod.DELETE, consumes = "application/json")
	public @ResponseBody MovePriceModule removeDetails(@RequestBody MovePriceModule ouser) {
		//ologger.info("Came inside the remove");
		return ouser;
	}

	@RequestMapping(value = "/price", method = RequestMethod.PUT, consumes = "application/json")
	public @ResponseBody MovePriceModule updateMoveDetails(@RequestBody MovePriceModule ouser) {
		//ologger.info("Came inside the Update");
		return ouser;
	}
}
