package fr.ippon.rh.permut.impl;

import javax.inject.Named;

import org.springframework.stereotype.Component;

import fr.ippon.rh.permut.EncodeService;

@Component
@Named("encoderX")
public class EncodeServiceIdempotent implements EncodeService {

    @Override
    public String encode(String str) {
        return str;
    }

    @Override
    public String decode(String str) {
        return str;
    }

}
