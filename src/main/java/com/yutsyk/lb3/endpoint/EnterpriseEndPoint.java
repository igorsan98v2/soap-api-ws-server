package com.yutsyk.lb3.endpoint;

import com.yutsyk.lb3.service.EnterpriseService;
import lab3.enterprise_yutsyk.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EnterpriseEndPoint {
    @Autowired
    EnterpriseService enterpriseService;
    @PayloadRoot(namespace = "http://enterprise-yutsyk.lab3",
            localPart = "getEnterpriseRequest")
    @ResponsePayload
    public GetEnterpriseRespond getEnterpriseRequest(@RequestPayload GetEnterpriseRequest request) {
        GetEnterpriseRespond response = new GetEnterpriseRespond();
        response.setEnterprise(enterpriseService.getEnterprise(request.getName()));
        return response;
    }
    @PayloadRoot(namespace = "http://enterprise-yutsyk.lab3",
            localPart = "deleteEnterpriseRequest")
    @ResponsePayload
    public GetEnterpriseRespond deleteEnterpriseRequest(@RequestPayload GetEnterpriseRequest request) {
        GetEnterpriseRespond response = new GetEnterpriseRespond();
        response.setEnterprise(enterpriseService.deleteEnterprise(request.getName()));
        return response;
    }

    @PayloadRoot(namespace = "http://enterprise-yutsyk.lab3",
            localPart = "createEnterpriseRequest")
    @ResponsePayload
    public GetEnterpriseRespond createEnterpriseRequest(@RequestPayload CreateEnterpriseRequest request) {
        GetEnterpriseRespond response = new GetEnterpriseRespond();
        response.setEnterprise(enterpriseService.addEnterprise(request.getEnterpise()));
        return response;
    }

    @PayloadRoot(namespace = "http://enterprise-yutsyk.lab3",
            localPart = "getEnterprisesRequest")
    @ResponsePayload
    public GetEnterprisesRespond getEnterprisesByRequest(@RequestPayload GetEnterprisesRequest request) {
        GetEnterprisesRespond enterprisesRespond = new GetEnterprisesRespond();
        Pageable page = PageRequest.of(request.getPage(),request.getPageSize());
        enterprisesRespond.getEnterprises().addAll(enterpriseService.getEnterprises(page));
        return  enterprisesRespond;
    }

    @PayloadRoot(namespace = "http://enterprise-yutsyk.lab3",
            localPart = "getEnterprisesByNameStartedWithRequest")
    @ResponsePayload
    public GetEnterprisesRespond getEnterprisesByRequestNameStartWith(@RequestPayload GetEnterprisesByNameStartedWithRequest request) {
        GetEnterprisesRespond enterprisesRespond = new GetEnterprisesRespond();
        Pageable page = PageRequest.of(request.getPage(),request.getPageSize());
        enterprisesRespond.getEnterprises().addAll(enterpriseService.getEnterprises(request.getStartedWith(),page));
        return  enterprisesRespond;
    }


    @PayloadRoot(namespace = "http://enterprise-yutsyk.lab3",
            localPart = "getEnterprisesByFounderRequest")
    @ResponsePayload
    public GetEnterprisesRespond getEnterprisesByFounderRequest(@RequestPayload GetEnterprisesByFounderRequest request) {
        GetEnterprisesRespond enterprisesRespond = new GetEnterprisesRespond();
        Pageable page = PageRequest.of(request.getPage(),request.getPageSize());
        enterprisesRespond.getEnterprises().addAll(enterpriseService.getEnterpisesByFounder(request.getFounder(),page));
        return  enterprisesRespond;
    }



}
