package com.first.jooq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Company;
import java.util.List;
import com.first.jooq.service.CompanyService;

@SpringBootApplication
@RestController
@RequestMapping("/companies")
public class SpringBootJooqApplication {
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

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJooqApplication.class, args);
	}

}