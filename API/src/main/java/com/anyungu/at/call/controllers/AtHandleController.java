package com.anyungu.at.call.controllers;

import javax.validation.Valid;

import com.anyungu.at.call.models.AtHandleRequest;
import com.anyungu.at.call.models.AtXmlResponse;
import com.anyungu.at.call.services.AtCallerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AtHandleController {

    @Autowired
    private AtCallerService atCallerService;

    @PostMapping(value = "/at/handle", produces = MediaType.APPLICATION_XML_VALUE)
    public AtXmlResponse requestFromAt(@Valid @RequestBody AtHandleRequest request) {

        AtXmlResponse passCallRequestToResponseService = atCallerService.PassCallRequestToResponseService(request);

        return passCallRequestToResponseService;

    }

    @GetMapping(value = "/path")
    public String getMethodName() {
        return "new SomeData()";
    }

}
