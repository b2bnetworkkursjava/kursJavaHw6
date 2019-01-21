package com.b2b.net.hw6.utils;

import com.b2b.net.hw6.domains.Client;
import com.b2b.net.hw6.domains.Cloth;
import com.b2b.net.hw6.domains.ClothesShop;

public class ClothesShopUtils {


    //1
    //Napisz metode, która stwierdzi czy w sklepie jest ubranie marki Puma, skorzystaj z equals
    public boolean checkBrand(ClothesShop clothesShop){
        boolean firma;
        if (clothesShop.getClient().getCloth().getBrand().equals("Puma")) {
            firma = true;
        }else{
            firma=false;
        }

        return firma;
    }

    //2
    //Napisz metode, która stwierdzi czy w sklepie jest ubranie tansze niz 220zl

    public boolean isCheaperThan220(ClothesShop clothesShop){
        boolean cheaper;
        if (clothesShop.getClient().getCloth().getPrice()<220) {
            cheaper = true;
        }else{
            cheaper=false;
        }
        return cheaper;
    }


    //3
    //Napisz metode, ktora stwierdzi czy sklep mieści się w Krakowie, skorzystaj z equals

    public boolean isFromCracow(ClothesShop clothesShop){
        boolean cracow;
        if (clothesShop.getClient().getCity().equals("Cracow")){
            cracow=true;
        }else{
            cracow=false;
        }
        return cracow;
    }

    //4
    //Napisz metodę, która stwierdzi czy sklep miesci się w Warszawie na ulicy Grochowskiej, skorzystaj z equals
    public boolean checkCityAndStreet(ClothesShop clothesShop){
        boolean miasto;
        if (clothesShop.getClient().getStreet().equals("Grochowska")
        && clothesShop.getClient().getCity().equals("Warszawa")) {
            miasto = true;
        }else{
            miasto=false;
        }

        return miasto;
    }

    //5
    //Napisz program czy ubranie w sklepie jest marki Puma i posiada rozmiar S, skorzystaj z equals i metody znajdujacej sie w tej klasie

    public boolean checkBrandAndSize(ClothesShop clothesShop){
        boolean firmaIrozmiar;
        if (clothesShop.getClient().getCloth().getBrand().equals("Puma")
        && clothesShop.getClient().getCloth().getSize().equals("S")) {
            firmaIrozmiar = true;
        }else{
            firmaIrozmiar=false;
        }
        return firmaIrozmiar;
    }


}
