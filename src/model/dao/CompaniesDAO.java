package model.dao;

import model.entities.Company;

import java.util.Collection;
import java.util.List;

/**
 * Created by asevruk on 12/7/2016.
 */
public interface CompaniesDAO<Company> extends DAO<Company>{
    public String findByName(String name);
    public List<Company> getAll();
}
