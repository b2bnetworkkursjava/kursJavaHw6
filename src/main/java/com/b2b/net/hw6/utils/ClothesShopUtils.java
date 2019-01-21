package com.b2b.net.hw6.utils;

import com.b2b.net.hw6.domains.ClothesShop;

public class ClothesShopUtils {


    //1
    //Napisz metode, która stwierdzi czy w sklepie jest ubranie marki Puma, skorzystaj z equals
    public boolean checkBrand(ClothesShop clothesShop) {
        boolean result;
        if (clothesShop.getClient().getCloth().getBrand().equals("Puma")) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    //2
    //Napisz metode, która stwierdzi czy w sklepie jest ubranie tansze niz 220zl

    public boolean isCheaperThan220(ClothesShop clothesShop) {
        boolean result;
        if (clothesShop.getClient().getCloth().getPrice() < 220) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }


    //3
    //Napisz metode, ktora stwierdzi czy sklep mieści się w Krakowie, skorzystaj z equals

    public boolean isFromCracow(ClothesShop clothesShop) {
        boolean result;
        if (clothesShop.getCity().equals("Kraków")) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    //4
    //Napisz metodę, która stwierdzi czy sklep miesci się w Warszawie na ulicy Grochowskiej, skorzystaj z equals
    public boolean checkCityAndStreet(ClothesShop clothesShop) {
        boolean result;
        if (clothesShop.getCity().equals("Warszawa") && clothesShop.getStreet().equals("Grochowska")) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    //5
    //Napisz program czy ubranie w sklepie jest marki Puma i posiada rozmiar S, skorzystaj z equals i metody znajdujacej sie w tej klasie

    public boolean checkBrandAndSize(ClothesShop clothesShop) {
        boolean result;
        if (clothesShop.getClient().getCloth().getBrand().equals("Puma") && clothesShop.getClient().getCloth().getSize().equals("S")) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }


}
