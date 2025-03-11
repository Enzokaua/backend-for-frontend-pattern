package com.bff.backforfront.model;

import com.bff.backforfront.contract.IResponsed;
import org.springframework.stereotype.Component;

@Component
public class WebappResponsed implements IResponsed {
    private static final String MESSAGE = "IT IS WEBAPPING INTERFACE";

    @Override
    public String method(){
        return MESSAGE;
    }
}