package fr.ippon.rh.permut.impl;

import fr.ippon.rh.permut.EncodeService;

public abstract class BaseEncodeService implements EncodeService {

    private char[] _originalChars;
    private char[] _encodedChars;

    public BaseEncodeService(char[] originalChars, char[] encodedChars) {
        this._originalChars = originalChars;
        this._encodedChars = encodedChars;
    }

    @Override
    public String encode(String str) {
        return transpose(str, _originalChars, _encodedChars);
    }

    @Override
    public String decode(String str) {
        return transpose(str, _encodedChars, _originalChars);
    }

    public String transpose(String str, char[] fromChars, char[] toChars) {
        StringBuilder sb = new StringBuilder(str.length());
        for (char c : str.toCharArray()) {
            sb.append(transpose(c, fromChars, toChars));
        }
        return sb.toString();
    }

    public char transpose(char c, char[] fromChars, char[] toChars) {
        char result = c;
        for (int i = 0; i < fromChars.length; ++i) {
            if (fromChars[i] == c) {
                result = toChars[i];
                break;
            }
        }
        return result;
    }

    public char encodeLight(char c) {
        return transpose(c, _originalChars, _encodedChars);
    }

    public char decodeLight(char c) {
        return transpose(c, _encodedChars, _originalChars);
    }

}