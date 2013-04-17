package fr.ippon.rh.permut.impl;

import javax.inject.Named;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("ActivateMe")    // Le profil n'est pas actif par défaut...
@Named("encoder4")
public class EncodeService4 extends BaseEncodeService {

    static char[] originalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
    static char[] encodedChars = "vMNHwBRjPAQqpXfJUzDhWFLmuETnSVdorylsCbKckaGitZeOIYxg".toCharArray();

    public EncodeService4() {
        super(originalChars, encodedChars);
    }
}
