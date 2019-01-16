package com.b2b.net.hw6.utils;

import com.b2b.net.hw6.domains.ClothesShop;

public class ClothesShopUtils {


    //1
    //Napisz metode, która stwierdzi czy w sklepie jest ubranie marki Puma
    public boolean checkBrand(ClothesShop clothesShop){
        boolean result = false;
        if(clothesShop.getClient().getCloth().getBrand().equals("Puma")){
            result = true;
        }
        return result;
    }

    //2
    //Napisz metode, która stwierdzi czy w sklepie jest ubranie tansze niz 220zl

    public boolean isCheaperThan220(ClothesShop clothesShop){
        boolean result = false;
        if(clothesShop.getClient().getCloth().getPrice() < 220){
            result = true;
        }
        return result;
    }


    //3
    //Napisz metode, ktora stwierdzi czy sklep mieści się w Krakowie

    public boolean isFromCracow(ClothesShop clothesShop){
        boolean result = false;
        if(clothesShop.getCity().equals("Kraków")){
            result = true;
        }
        return result;
    }

    //4
    //Napisz metodę, która stwierdzi czy sklep miesci się w Warszawie na ulicy Grochowskiej
    public boolean checkCityAndStreet(ClothesShop clothesShop){
        boolean result = false;
        if(clothesShop.getCity().equals("Kraków") && clothesShop.getStreet().equals("Grochowska")){
            result = true;
        }
        return result;
    }

    //5
    //Napisz program czy ubranie w sklepie jest marki Puma i posiada rozmiar S

    public boolean checkBrandAndSize(ClothesShop clothesShop){
        boolean result = false;
        if(checkBrand(clothesShop)){
            if(clothesShop.getClient().getCloth().getSize().equals("S")){
                result = true;
            }
        }
        return result;
    }


}
