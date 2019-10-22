package com.yutsyk.lb3.repo;

import com.yutsyk.lb3.dao.Enterprise;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EnterpriseRepo extends CrudRepository<Enterprise,Long> {
    Enterprise findByName(String name);
    Enterprise deleteByName(String name);
    List<Enterprise> findAll(Pageable page);
    List<Enterprise> findByNameStartsWith(String startWith,Pageable page);
    List<Enterprise> findByFounder(String founder,Pageable page);

}
