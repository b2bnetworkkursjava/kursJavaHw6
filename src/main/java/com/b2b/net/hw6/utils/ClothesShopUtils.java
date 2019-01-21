package com.b2b.net.hw6.utils;

import com.b2b.net.hw6.domains.ClothesShop;

public class ClothesShopUtils {


    //1
    //Napisz metode, która stwierdzi czy w sklepie jest ubranie marki Puma, skorzystaj z equals
    public boolean checkBrand(ClothesShop clothesShop){
        if (clothesShop.getClient().getCloth().getBrand().equals("Puma")){
            return true;
        }
        else {
            return false;
        }
    }

    //2
    //Napisz metode, która stwierdzi czy w sklepie jest ubranie tansze niz 220zl

    public boolean isCheaperThan220(ClothesShop clothesShop){
        if (clothesShop.getClient().getCloth().getPrice() < 220){
            return true;
        }
        else {
            return false;
        }
    }


    //3
    //Napisz metode, ktora stwierdzi czy sklep mieści się w Krakowie, skorzystaj z equals

    public boolean isFromCracow(ClothesShop clothesShop){
        if (clothesShop.getCity().equals("Cracow")){
            return true;
        }
        else{
            return false;
        }
    }

    //4
    //Napisz metodę, która stwierdzi czy sklep miesci się w Warszawie na ulicy Grochowskiej, skorzystaj z equals
    public boolean checkCityAndStreet(ClothesShop clothesShop){
        if (clothesShop.getCity().equals("Warsaw") && clothesShop.getStreet().equals("Grochowska")){
            return true;
        }
        else {
            return false;
        }
    }

    //5
    //Napisz program czy ubranie w sklepie jest marki Puma i posiada rozmiar S, skorzystaj z equals i metody znajdujacej sie w tej klasie

    public boolean checkBrandAndSize(ClothesShop clothesShop){
        if (checkBrand(clothesShop)==true && clothesShop.getClient().getCloth().getSize().equals("s")){
            return true;
        }
        else{
            return false;
        }
    }


}
