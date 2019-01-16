package com.b2b.net.hw6.utils;

import com.b2b.net.hw6.domains.Cloth;

public class ClothUtils {

    //1. Napisz program, który stwierdzi czy cena ubrania się w przedziale cenowym(0,100)zł

    public boolean isPriceInTheRange(Cloth cloth){
        boolean result = false;
        if(cloth.getPrice() < 100 && cloth.getPrice() > 0){
            result = true;
        }
        return result;
    }


    //2.Napisz program, stwierdzi czy ubranie jest marki Nike

    public boolean isBrandEqualNike(Cloth cloth){
        boolean result = false;
        if(cloth.getBrand().equals("Nike")){
            result = true;
        }
        return result;
    }



    //3.Napisz program, który stwierdzi czy ubranie posiada rozmiar S lub rozmiar M

    public boolean checkSize(Cloth cloth){
        boolean result = false;
        if(cloth.getSize().equals("S") || cloth.getSize().equals("M")){
            result = true;
        }
        return result;
    }

    //4.Napisz program, który stwierdzi czy ubranie jest marki Adidas lub marki Nike
    public boolean checkBrand(Cloth cloth){
        boolean result = false;
        if(cloth.getBrand().equals("Adidas")|| cloth.getBrand().equals("Nike")){
            result = true;
        }
        return result;
    }


    //5.Napisz program, który stwierdzi ubranie jest marki Puma i kosztuje mniej niz 200 zl
    public boolean checkBrandAndPrice(Cloth cloth){
        boolean result = false;
        if(cloth.getBrand().equals("Adidas") && cloth.getPrice() < 200){
            result = true;
        }
        return result;
    }


}
