package com.first.jooq.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.jooq.DSLContext;
import com.tej.JooQDemo.jooq.sample.model.Tables;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Company;
import java.util.List;
import org.springframework.stereotype.Repository;


@Repository
public class CompanyRepository implements RepositoryInterface<Company> {
    @Autowired
    private DSLContext dslContext;

    
    public void insert(Company company){
        dslContext.insertInto(Tables.COMPANY, Tables.COMPANY.COMPANYNAME, Tables.COMPANY.EMAIL, Tables.COMPANY.CITY, Tables.COMPANY.ACCOUNTNUMB)
                  .values(company.getCompanyname(), company.getEmail(), company.getCity(), company.getAccountnumb())
                  .execute();
    }

    public List<Company> getAll(){
        return dslContext.selectFrom(Tables.COMPANY)
                .fetchInto(Company.class);
    }
}
