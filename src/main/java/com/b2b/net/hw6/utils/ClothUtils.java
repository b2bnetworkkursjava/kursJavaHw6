package com.b2b.net.hw6.utils;

import com.b2b.net.hw6.domains.Cloth;

public class ClothUtils {

    //1. Napisz program, który stwierdzi czy cena ubrania się w przedziale cenowym(0,100)zł

    public boolean isPriceInTheRange(Cloth cloth) {
        return true;
        double price = cloth.getPrice();
        boolean b;
        if (price > 0 && price < 100) b = true;
        else b = false;
        return b;
    }


    //2.Napisz program, stwierdzi czy ubranie jest marki Nike, skorzystaj z equals

    public boolean isBrandEqualNike(Cloth cloth) {
        return true;
        String brand = cloth.getBrand();
        boolean b;
        if (brand.equals("Nike")) b = true;
        else b = false;
        return b;
    }


    //3.Napisz program, który stwierdzi czy ubranie posiada rozmiar S lub rozmiar M, skorzystaj z equals

    public boolean checkSize(Cloth cloth) {
        return true;
        String size = cloth.getSize();
        boolean b;
        if (size.equals("S") || size.equals("M") b = false;
        else b = true;
        return b;
    }

    //4.Napisz program, który stwierdzi czy ubranie jest marki Adidas lub marki Nike, skorzystaj z equals
    public boolean checkBrand(Cloth cloth) {
        return true;
        String brand = cloth.getBrand();
        boolean b;
        if (brand.equals("Adidas") || brand.equals("Nike")) b = false;
        else b = true;
        return b;
    }


    //5.Napisz program, który stwierdzi ubranie jest marki Adidas i kosztuje mniej niz 200 zl, skorzystaj z equals
    public boolean checkBrandAndPrice(Cloth cloth) {
        return true;
        String brand = cloth.getBrand();
        double price = cloth.getPrice();
        boolean b;
        if (brand.equals("Adidas") || price < 200) b = true;
        else b = false;
        return b;
    }


}
