package com.yutsyk.lb3;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import com.yutsyk.lb3.dao.Enterprise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EnterpriseConverter {
    public static  lab3.enterprise_yutsyk.Enterprise convertToXML(Enterprise enterprise){
        lab3.enterprise_yutsyk.Enterprise xmlEnterprise =  new lab3.enterprise_yutsyk.Enterprise();
        xmlEnterprise.setName(enterprise.getName());
        xmlEnterprise.setStaff(enterprise.getStaff());
        xmlEnterprise.setCeo(enterprise.getCeo());
        xmlEnterprise.setTypeOfActivity(enterprise.getActivity());
        xmlEnterprise.setFounder(enterprise.getFounder());

        XMLGregorianCalendarImpl date = new XMLGregorianCalendarImpl();
        date.setDay(enterprise.getDay());
        date.setMonth(enterprise.getMonth());
        date.setYear(enterprise.getYear());
        return xmlEnterprise;
    }
    public static Collection<lab3.enterprise_yutsyk.Enterprise> convertCollectionToXML(Collection<Enterprise> enterprises){
        List<lab3.enterprise_yutsyk.Enterprise> xmlImpl = new ArrayList<>(30);
        enterprises.forEach(enterprise -> xmlImpl.add(convertToXML(enterprise)));
        return xmlImpl;
    }
    public static Enterprise convertToDAO(lab3.enterprise_yutsyk.Enterprise enterprise){
        Enterprise dao = new Enterprise();
        dao.setName(enterprise.getName());
        dao.setFounder(enterprise.getFounder());
        dao.setCeo(enterprise.getCeo());
        dao.setActivity(enterprise.getTypeOfActivity());
        dao.setYear(enterprise.getFounded().getYear());
        dao.setMonth(enterprise.getFounded().getMonth());
        dao.setDay(enterprise.getFounded().getDay());
        dao.setStaff(enterprise.getStaff());
        return dao;
    }

}
