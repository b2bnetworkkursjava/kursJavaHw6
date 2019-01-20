package com.b2b.net.hw6.utils;

import com.b2b.net.hw6.domains.Client;
import com.b2b.net.hw6.domains.Cloth;
import com.b2b.net.hw6.domains.ClothesShop;

public class ClothesShopUtils {
    //1
    //Napisz metode, która stwierdzi czy w sklepie jest ubranie marki Puma, skorzystaj z equals
    public boolean checkBrand(ClothesShop clothesShop) {
            String brandInShop = clothesShop.getClient().getCloth().getBrand();
            boolean bool;
            if (brandInShop.equals("Puma")){
                bool = true;
            }else {
                bool = false;
            }
        return bool;
    }

    //2
    //Napisz metode, która stwierdzi czy w sklepie jest ubranie tansze niz 220zl

    public boolean isCheaperThan220(ClothesShop clothesShop) {
        double priceInShop = clothesShop.getClient().getCloth().getPrice();
        boolean bool;
        if (priceInShop < 220){
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }


    //3
    //Napisz metode, ktora stwierdzi czy sklep mieści się w Krakowie, skorzystaj z equals

    public boolean isFromCracow(ClothesShop clothesShop) {
        boolean bool;
        if (clothesShop.getCity().equals("Kraków")){
            bool = true;
        }else {
            bool = false;
        }
        return bool;
    }

    //4
    //Napisz metodę, która stwierdzi czy sklep miesci się w Warszawie na ulicy Grochowskiej, skorzystaj z equals
    public boolean checkCityAndStreet(ClothesShop clothesShop) {
        boolean bool;
        if (clothesShop.getCity().equals("Warszawa") && clothesShop.getStreet().equals("Grochowska")){
            bool = true;
        }else {
            bool = false;
        }
        return bool;
    }

    //5
    //Napisz program czy ubranie w sklepie jest marki Puma i posiada rozmiar S, skorzystaj z equals i metody znajdujacej sie w tej klasie

    public boolean checkBrandAndSize(ClothesShop clothesShop) {
        boolean clothBrand = checkBrand(clothesShop);
        String clothSize = clothesShop.getClient().getCloth().getSize();
        boolean bool;
        if (clothBrand == true && clothSize.equals("S")){
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }


}
