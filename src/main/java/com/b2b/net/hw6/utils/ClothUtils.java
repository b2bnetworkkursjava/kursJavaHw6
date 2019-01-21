package com.b2b.net.hw6.utils;

import com.b2b.net.hw6.domains.Cloth;

public class ClothUtils {

    //1. Napisz program, który stwierdzi czy cena ubrania się w przedziale cenowym(0,100)zł

    public boolean isPriceInTheRange(Cloth cloth){
        double price = cloth.getPrice();
        boolean bool;
        if (price > 0 && price < 100) bool = true;
        else bool = false;
        return bool;
    }


    //2.Napisz program, stwierdzi czy ubranie jest marki Nike, skorzystaj z equals

    public boolean isBrandEqualNike(Cloth cloth){
        String brand = cloth.getBrand();
        boolean bool;
        if (brand.equals("Nike")) bool = true;
        else bool = false;
        return bool;
    }



    //3.Napisz program, który stwierdzi czy ubranie posiada rozmiar S lub rozmiar M, skorzystaj z equals

    public boolean checkSize(Cloth cloth){
        String size = cloth.getSize();
        boolean bool;
        if (size.equals("S") || size.equals("M")) bool = false;
        else bool = true;
        return bool;
    }

    //4.Napisz program, który stwierdzi czy ubranie jest marki Adidas lub marki Nike, skorzystaj z equals
    public boolean checkBrand(Cloth cloth){
        String brand = cloth.getBrand();
        boolean bool;
        if (brand.equals("Adidas") || brand.equals("Nike")) bool = false;
        else bool = true;
        return bool;
    }


    //5.Napisz program, który stwierdzi ubranie jest marki Adidas i kosztuje mniej niz 200 zl, skorzystaj z equals
    public boolean checkBrandAndPrice(Cloth cloth){
        String brand = cloth.getBrand();
        double price = cloth.getPrice();
        boolean bool;
        if (brand.equals("Adidas") || price < 200) bool = true;
        else bool = false;
        return bool;
    }


}
