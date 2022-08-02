package com.tutrit.quickstartwebhook;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenericController {

    @PostMapping("/webhook")
    public Object webhook(@RequestBody Object data, @RequestHeader(required = false) MultiValueMap<String, String> headers) {
        return new Dto(data, headers);
    }

    @ExceptionHandler(Throwable.class)
    public String  handleException(Throwable cause) {
        return cause.getMessage();
    }
}
