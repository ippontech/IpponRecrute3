package fr.ippon.rh.permut.impl;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Component
@Named("encoder1")
public class EncodeService1 extends BaseEncodeService {

    static char[] originalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
    static char[] encodedChars = "NXHjTrtuhyepcYVWBSgofAGPKnvkQmLdqUlaRCzbIExFsZwJDiOM".toCharArray();

    public EncodeService1() {
        super(originalChars, encodedChars);
    }

}
