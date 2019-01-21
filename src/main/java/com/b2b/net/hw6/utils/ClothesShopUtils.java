package com.b2b.net.hw6.utils;

import com.b2b.net.hw6.domains.Client;
import com.b2b.net.hw6.domains.Cloth;
import com.b2b.net.hw6.domains.ClothesShop;

public class ClothesShopUtils {


    //1
    //Napisz metode, która stwierdzi czy w sklepie jest ubranie marki Puma, skorzystaj z equals
    public boolean checkBrand(ClothesShop clothesShop){
        Client client = clothesShop.getClient();
        Cloth cloth = client.getCloth();
        String brand = cloth.getBrand();
        boolean bool;
        if (brand.equals("Puma")) bool = true;
        else bool = false;
        return bool;
    }

    //2
    //Napisz metode, która stwierdzi czy w sklepie jest ubranie tansze niz 220zl

    public boolean isCheaperThan220(ClothesShop clothesShop){
        Client client = clothesShop.getClient();
        Cloth cloth = client.getCloth();
        double price = cloth.getPrice();
        boolean bool;
        if (price < 200) bool = true;
        else bool = false;
        return bool;
    }


    //3
    //Napisz metode, ktora stwierdzi czy sklep mieści się w Krakowie, skorzystaj z equals

    public boolean isFromCracow(ClothesShop clothesShop){
        String city = clothesShop.getCity();
        boolean bool;
        if (city.equals("Kraków")) bool = true;
        else bool = false;
        return bool;
    }

    //4
    //Napisz metodę, która stwierdzi czy sklep miesci się w Warszawie na ulicy Grochowskiej, skorzystaj z equals

    public boolean checkCityAndStreet(ClothesShop clothesShop){
        String city = clothesShop.getCity();
        String street = clothesShop.getStreet();
        boolean bool;
        if (city.equals("Warszawa") && street.equals("Grochowska")) bool = true;
        else bool = false;
        return bool;
    }

    //5
    //Napisz program czy ubranie w sklepie jest marki Puma i posiada rozmiar S, skorzystaj z equals i metody znajdujacej sie w tej klasie

    public boolean checkBrandAndSize(ClothesShop clothesShop){
        Client client = clothesShop.getClient();
        Cloth cloth = client.getCloth();
        String size = cloth.getSize();
        boolean brand = checkBrand(clothesShop);
        boolean bool;
        if (size.equals("S") && brand) {
            bool = true;
        } else {bool = false;}
        return bool;
    }


}
