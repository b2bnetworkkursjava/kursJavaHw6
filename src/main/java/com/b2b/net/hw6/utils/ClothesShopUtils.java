package com.b2b.net.hw6.utils;

import com.b2b.net.hw6.domains.ClothesShop;

public class ClothesShopUtils {


    //1
    //Napisz metode, która stwierdzi czy w sklepie jest ubranie marki Puma, skorzystaj z equals
    public boolean checkBrand(ClothesShop clothesShop){
        String brand="Puma";
        return brand.equals(clothesShop.getClient().getCloth().getBrand());
    }

    //2
    //Napisz metode, która stwierdzi czy w sklepie jest ubranie tansze niz 220zl

    public boolean isCheaperThan220(ClothesShop clothesShop){
        boolean result;
        result = clothesShop.getClient().getCloth().getPrice()<220?true:false;
        return result;
    }


    //3
    //Napisz metode, ktora stwierdzi czy sklep mieści się w Krakowie, skorzystaj z equals

    public boolean isFromCracow(ClothesShop clothesShop){
        String city="Kraków";
        return city.equals(clothesShop.getCity());
    }

    //4
    //Napisz metodę, która stwierdzi czy sklep miesci się w Warszawie na ulicy Grochowskiej, skorzystaj z equals
    public boolean checkCityAndStreet(ClothesShop clothesShop){
        String city="Warszawa";
        String street = "Grochowska";
        if (city.equals(clothesShop.getCity()) && street.equals(clothesShop.getStreet())) return true;
        else return false;
    }

    //5
    //Napisz program czy ubranie w sklepie jest marki Puma i posiada rozmiar S, skorzystaj z equals i metody znajdujacej sie w tej klasie

    public boolean checkBrandAndSize(ClothesShop clothesShop){
        String brand="Puma";
        String size = "S";
        if (brand.equals(clothesShop.getClient().getCloth().getBrand()) && size.equals(clothesShop.getClient().getCloth().getSize())) return true;
        else return false;
    }


}
