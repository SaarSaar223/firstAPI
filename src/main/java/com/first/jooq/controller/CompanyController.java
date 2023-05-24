package com.first.jooq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Company;
import java.util.List;
import com.first.jooq.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/companies")
public class CompanyController {
    @Autowired
	private CompanyService service;

	@PostMapping
	public String addCompany(@RequestBody Company company){
		service.insertObject(company);
		return "company added...";
	}

	@GetMapping
	public List<Company> getCompanies(){
		return service.getAllObjects();
	}
}
