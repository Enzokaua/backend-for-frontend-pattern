package com.bff.backforfront.controller;
import com.bff.backforfront.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.net.URI;
import java.util.Map;

@Controller
public class BffController {

    private final Map<String, String> responsed;
    private BffController(MobileResponsed mobileResponsed, DesktopResponsed desktopResponsed, TabletResponsed tabletResponsed, WebappResponsed webappResponsed) {
        this.responsed = Map.of(
                "mobile", mobileResponsed.method(),
                "webapp", webappResponsed.method(),
                "tablet", tabletResponsed.method(),
                "desktop", desktopResponsed.method());
    }

    @PostMapping("/handlerPoint")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> mobileHandler(@RequestBody PersonModel personModel) {
        return ResponseEntity.created(URI.create("http://localhost:8080")).body(responsed.get(personModel.getApplication()));
    }
}
