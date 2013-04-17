package fr.ippon.rh.permut.impl;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Component
@Named("encoder3")
public class EncodeService3 extends BaseEncodeService {

    static char[] originalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
    static char[] encodedChars = "juPqzWVBfpCwLmyZtYJonicKGbsAXNdFUMaOHDgxvESrQIRehkTl".toCharArray();

    public EncodeService3() {
        super(originalChars, encodedChars);
    }

}
