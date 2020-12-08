package com.anyungu.at.call.services;

import com.anyungu.at.call.models.AtHandleRequest;
import com.anyungu.at.call.models.AtXmlResponse;

import org.springframework.stereotype.Service;

@Service
public class AtCallerService {

    public AtXmlResponse PassCallRequestToResponseService(AtHandleRequest atHandleRequest) {

        String direction = atHandleRequest.getDirection();
        String isActive = atHandleRequest.getIsActive();

        if (direction.contentEquals("outbound") && !isActive.contentEquals("0")) {

            AtXmlResponse atXmlResponse = new AtXmlResponse();
            atXmlResponse.setMaxDuration("10");
            atXmlResponse.setPhoneNumbers(atHandleRequest.getClientDialedNumber());
            atXmlResponse.setRecord("false");

            return atXmlResponse;
        }
        return null;

    }

}
