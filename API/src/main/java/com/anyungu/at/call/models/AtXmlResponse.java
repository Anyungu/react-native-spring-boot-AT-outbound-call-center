package com.anyungu.at.call.models;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Dial")
public class AtXmlResponse {

    @XmlAttribute
    protected String phoneNumbers;

    @XmlAttribute
    protected String gender;

}
