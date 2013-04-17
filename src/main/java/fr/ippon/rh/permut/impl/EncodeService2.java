package fr.ippon.rh.permut.impl;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Component
@Named("encoder2")
public class EncodeService2 extends BaseEncodeService {

    static char[] originalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
    static char[] encodedChars = "zNsvfxPXoLnKHSyegbWacjqVQtJGIMphFAuTlBOdYrwRkmDCEUiZ".toCharArray();

    public EncodeService2() {
        super(originalChars, encodedChars);
    }
}
