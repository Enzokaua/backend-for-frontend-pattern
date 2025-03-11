package com.bff.backforfront.model;

import com.bff.backforfront.contract.IResponsed;
import org.springframework.stereotype.Component;

@Component
public class DesktopResponsed implements IResponsed {
    private static final String MESSAGE = "IT IS DESKTOP INTERFACE";

    @Override
    public String method(){
        return MESSAGE;
    }

}
