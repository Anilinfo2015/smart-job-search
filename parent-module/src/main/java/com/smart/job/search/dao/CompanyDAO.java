package com.smart.job.search.dao;

import com.smart.job.search.beans.Company;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CompanyDAO extends AbstractDAO{


    public void create(Company company) throws SQLException {

        Connection connection = DBConnection.getConnection();
        String sql = "insert into company(id,name,type) values();";
        Statement stm = connection.createStatement();

        stm.executeUpdate(sql);

    }

    public void update(Company company) {

    }

    public void delete(int companyId) {

    }

    public Company getByPK(int companyId) {

        return null;
    }

    public List<Company> getAll() {
        return null;
    }


    public void search() {

    }
}
