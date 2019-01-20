package com.b2b.net.hw6.utils;

import com.b2b.net.hw6.domains.Cloth;

public class ClothUtils {
    //1. Napisz program, który stwierdzi czy cena ubrania się w przedziale cenowym(0,100)zł

    public boolean isPriceInTheRange(Cloth cloth) {
        boolean bool;
        if (cloth.getPrice() > 0 && cloth.getPrice() < 100) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }


    //2.Napisz program, stwierdzi czy ubranie jest marki Nike, skorzystaj z equals

    public boolean isBrandEqualNike(Cloth cloth) {
        boolean bool;
        if (cloth.getBrand().equals("Nike")) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }

    //3.Napisz program, który stwierdzi czy ubranie posiada rozmiar S lub rozmiar M, skorzystaj z equals

    public boolean checkSize(Cloth cloth) {
        boolean bool;
        if (cloth.getSize().equals("S") || cloth.getSize().equals("M")) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }

    //4.Napisz program, który stwierdzi czy ubranie jest marki Adidas lub marki Nike, skorzystaj z equals
    public boolean checkBrand(Cloth cloth) {
        boolean bool;
        if (cloth.getBrand().equals("Adidas") || cloth.getBrand().equals("Nike")) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }


    //5.Napisz program, który stwierdzi ubranie jest marki Adidas i kosztuje mniej niz 200 zl, skorzystaj z equals
    public boolean checkBrandAndPrice(Cloth cloth) {
        boolean bool;
        if (cloth.getBrand().equals("Adidas") && cloth.getPrice() < 200) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }


}
