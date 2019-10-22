package com.yutsyk.lb3.service;


import com.yutsyk.lb3.repo.EnterpriseRepo;
import lab3.enterprise_yutsyk.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.Collection;

import static com.yutsyk.lb3.EnterpriseConverter.*;


@Service
public class EnterpriseService {

    @Autowired
    private EnterpriseRepo repo;

    public Enterprise addEnterprise(Enterprise enterprise){
        repo.save(convertToDAO(enterprise));
        return enterprise;
    }

    public Enterprise getEnterprise(String name){
        return convertToXML(repo.findByName(name));
    }

    public Enterprise deleteEnterprise(String name){
        return convertToXML(repo.deleteByName(name));
    }

    public Enterprise updateEnterprise(String name,com.yutsyk.lb3.dao.Enterprise update){
        com.yutsyk.lb3.dao.Enterprise  enterprise = repo.findByName(name);
        if(update.getName()!=null && !update.getName().equals(enterprise.getName())){
            enterprise.setName(name);
        }
        if(update.getCeo()!=null && !update.getCeo().equals(enterprise.getCeo())){
            enterprise.setCeo(update.getCeo());
        }
        if(update.getActivity()!=null && !update.getActivity().equals(enterprise.getActivity())){
            enterprise.setActivity(update.getActivity());
        }
        if(update.getStaff()!=0&&enterprise.getStaff()!=update.getStaff()){
            enterprise.setStaff(update.getStaff());
        }
        return convertToXML(enterprise);
    }

    public Collection<Enterprise> getEnterprises(Pageable pageable){
        return convertCollectionToXML(repo.findAll(pageable));
    }

    public Collection<Enterprise> getEnterpisesByFounder(String founder,Pageable pageable){
        return convertCollectionToXML(repo.findByFounder(founder,pageable));
    }

    public Collection<Enterprise> getEnterprises(String startWith, Pageable pageable){
        return convertCollectionToXML(repo.findByNameStartsWith(startWith,pageable));
    }
}
