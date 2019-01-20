package com.b2b.net.hw6.utils;

import com.b2b.net.hw6.domains.Cloth;

public class ClothUtils {

    //1. Napisz program, który stwierdzi czy cena ubrania się w przedziale cenowym(0,100)zł

    public boolean isPriceInTheRange(Cloth cloth) {
        if (cloth.getPrice() >= 0 && cloth.getPrice()<=100) {
            return true;
        }else {
            return false;
        }
    }


    //2.Napisz program, stwierdzi czy ubranie jest marki Nike, skorzystaj z equals

    public boolean isBrandEqualNike(Cloth cloth){
        if (cloth.getBrand().equals("NIke")) {
            return true;
        }else {
            return false;
        }
    }



    //3.Napisz program, który stwierdzi czy ubranie posiada rozmiar S lub rozmiar M, skorzystaj z equals

    public boolean checkSize(Cloth cloth){
        if (cloth.getSize().equals("S") && cloth.getSize().equals("M")) {
            return true;
        }else {
            return false;
        }
    }

    //4.Napisz program, który stwierdzi czy ubranie jest marki Adidas lub marki Nike, skorzystaj z equals
    public boolean checkBrand(Cloth cloth){
        if (cloth.getBrand().equals("Adidas") && cloth.getBrand().equals("Nike")) {
            return true;
        }else {
            return false;
        }
    }


    //5.Napisz program, który stwierdzi ubranie jest marki Adidas i kosztuje mniej niz 200 zl, skorzystaj z equals
    public boolean checkBrandAndPrice(Cloth cloth){
        if (cloth.getBrand().equals("Adidas") && cloth.getPrice() < 200) {
            return true;
        }else {
            return false;
        }
    }


}
