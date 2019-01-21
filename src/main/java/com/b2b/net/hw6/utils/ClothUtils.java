package com.b2b.net.hw6.utils;

import com.b2b.net.hw6.domains.Cloth;

public class ClothUtils {

    //1. Napisz program, który stwierdzi czy cena ubrania się w przedziale cenowym(0,100)zł

    public boolean isPriceInTheRange(Cloth cloth) {
        boolean result;
        if (cloth.getPrice() > 0 && cloth.getPrice() < 100) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }


    //2.Napisz program, stwierdzi czy ubranie jest marki Nike, skorzystaj z equals

    public boolean isBrandEqualNike(Cloth cloth) {
        boolean result;
        if (cloth.getBrand().equals("Nike")) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }


    //3.Napisz program, który stwierdzi czy ubranie posiada rozmiar S lub rozmiar M, skorzystaj z equals

    public boolean checkSize(Cloth cloth) {
        boolean result;
        if (cloth.getSize().equals("S")) {
            result = true;
        } else if (cloth.getSize().equals("M")) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    //4.Napisz program, który stwierdzi czy ubranie jest marki Adidas lub marki Nike, skorzystaj z equals
    public boolean checkBrand(Cloth cloth) {
        boolean result;
        if (cloth.getBrand().equals("Adidas") || (cloth.getBrand().equals("Nike"))) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }


    //5.Napisz program, który stwierdzi ubranie jest marki Adidas i kosztuje mniej niz 200 zl, skorzystaj z equals
    public boolean checkBrandAndPrice(Cloth cloth) {
        boolean result;
        if (cloth.getBrand().equals("Adidas") && cloth.getPrice() < 200) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }


}
