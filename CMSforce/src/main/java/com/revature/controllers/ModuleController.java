package com.revature.controllers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.revature.entities.Module;
import com.revature.services.ModuleService;

public class ModuleController {

	@Autowired
	ModuleService moduleService;
	
	@RequestMapping(value = "/module", method = RequestMethod.GET)
	public Set<Module> getAllModules() {
		return moduleService.getAllModules();
	}
	
	@RequestMapping(value = "module/{id}", method = RequestMethod.GET)
	public Module getModuleById(@PathVariable int id) {
		return moduleService.getModuleById(id);
	}
}
