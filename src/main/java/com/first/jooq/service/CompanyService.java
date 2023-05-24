package com.first.jooq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Company;
import java.util.List;

@Service
public class CompanyService implements ServiceInterface<Company>{
    @Autowired
    private CompanyRepository compRep;
    
    public void insertObject(Company company){
        compRep.insert(company);
    }

    public List<Company> getAllObjects(){
        return compRep.getAll();
    }
    
}