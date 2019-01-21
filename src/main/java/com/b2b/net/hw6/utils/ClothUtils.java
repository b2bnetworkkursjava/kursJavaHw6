package com.b2b.net.hw6.utils;

import com.b2b.net.hw6.domains.Cloth;

public class ClothUtils {

    //1. Napisz program, który stwierdzi czy cena ubrania się w przedziale cenowym(0,100)zł

    public boolean isPriceInTheRange(Cloth cloth){
        boolean przedzial;
        if (cloth.getPrice()<100) {
            przedzial = true;
        }else{
            przedzial=false;
        }
        return przedzial;
    }


    //2.Napisz program, stwierdzi czy ubranie jest marki Nike, skorzystaj z equals

    public boolean isBrandEqualNike(Cloth cloth){
        boolean firma;
        if (cloth.getBrand().equals("Nike")) {
            firma = true;
        }else{
            firma=false;
        }
        return firma;
    }



    //3.Napisz program, który stwierdzi czy ubranie posiada rozmiar S lub rozmiar M, skorzystaj z equals

    public boolean checkSize(Cloth cloth){
        boolean rozmiarowka;
        if (cloth.getSize().equals("S")
        || cloth.getSize().equals("M")) {
            rozmiarowka = true;
        }else{
            rozmiarowka=false;
        }
        return rozmiarowka;
    }

    //4.Napisz program, który stwierdzi czy ubranie jest marki Adidas lub marki Nike, skorzystaj z equals
    public boolean checkBrand(Cloth cloth){
        boolean marka;
        if (cloth.getBrand().equals("Adidas")
        || cloth.getBrand().equals("Nike")) {
            marka = true;
        }else{
            marka=false;
        }
        return marka;
    }


    //5.Napisz program, który stwierdzi ubranie jest marki Adidas i kosztuje mniej niz 200 zl, skorzystaj z equals
    public boolean checkBrandAndPrice(Cloth cloth){
        boolean markaIcena;
        if (cloth.getPrice()<200
        && cloth.getBrand().equals("Adidas")) {
            markaIcena = true;
        }else{
            markaIcena=false;
        }
        return markaIcena;
    }


}
