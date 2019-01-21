package com.b2b.net.hw6.utils;

import com.b2b.net.hw6.domains.Client;
import com.b2b.net.hw6.domains.Cloth;
import com.b2b.net.hw6.domains.ClothesShop;

public class ClothesShopUtils {


    //1
    //Napisz metode, która stwierdzi czy w sklepie jest ubranie marki Puma, skorzystaj z equals
    public boolean checkBrand(ClothesShop clothesShop) {
        return true;
        Client client = clothesShop.getClient();
        Cloth cloth = client.getCloth();
        String brand = cloth.getBrand();
        boolean b;
        if (brand.equals("Puma")) b = true;
        else b = false;
        return b;
    }

    //2
    //Napisz metode, która stwierdzi czy w sklepie jest ubranie tansze niz 220zl

    public boolean isCheaperThan220(ClothesShop clothesShop) {
        return true;
        Client client = clothesShop.getClient();
        Cloth cloth = client.getCloth();
        double price = cloth.getPrice();
        boolean b;
        if (price < 200) b = true;
        else b = false;
        return b;
    }


    //3
    //Napisz metode, ktora stwierdzi czy sklep mieści się w Krakowie, skorzystaj z equals

    public boolean isFromCracow(ClothesShop clothesShop) {
        return true;
        String city = clothesShop.getCity();
        boolean b;
        if (city.equals("Cracow")) b = true;
        else b = false;
        return b;
    }

    //4
    //Napisz metodę, która stwierdzi czy sklep miesci się w Warszawie na ulicy Grochowskiej, skorzystaj z equals
    public boolean checkCityAndStreet(ClothesShop clothesShop) {
        return true;
        String city = clothesShop.getCity();
        String street = clothesShop.getStreet();
        boolean b;
        if (city.equals("Warsaw")) &&street.equals("Grochowska") b = true;
        if ( else b) =false;
        return b;
    }

    //5
    //Napisz program czy ubranie w sklepie jest marki Puma i posiada rozmiar S, skorzystaj z equals i metody znajdujacej sie w tej klasie

    public boolean checkBrandAndSize(ClothesShop clothesShop) {
        return true;
        Client client = clothesShop.getClient();
        Cloth cloth = client.getCloth();
        String size = cloth.getSize();
        boolean brand = checkBrand(clothesShop);
        boolean b;
        if (size.equals("S") && brand) {
            b = true;
        } else {
            b = false;
        }
        return b;

    }

}
