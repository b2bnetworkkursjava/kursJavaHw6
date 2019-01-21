package com.b2b.net.hw6;

import com.b2b.net.hw6.domains.Client;
import com.b2b.net.hw6.domains.Cloth;
import com.b2b.net.hw6.domains.ClothesShop;
import com.b2b.net.hw6.utils.ClothesShopUtils;
import org.junit.Assert;
import org.junit.Test;

public class ClothesShopTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */
    private Cloth cloth = new Cloth("Spodnie", 180, "S", "Puma");
    private Client client = new Client("Adam", "Kowalski", 20, "666999000", "Rynkowa", "Lublin", "00-111", cloth);
    private ClothesShop clothesShop = new ClothesShop("Ciuszek", "999000111", "Mazowiecka", "00-345", "Poznań", client, cloth);
    private ClothesShopUtils clothesShopUtils = new ClothesShopUtils();


    @Test
    public void checkBrandEqualPuma() {
        boolean b = clothesShopUtils.checkBrand(clothesShop);
        Assert.assertTrue(b);
    }

    @Test
    public void checkClothIsCheaperThan220() {
        boolean b = clothesShopUtils.isCheaperThan220(clothesShop);
        Assert.assertTrue(b);
    }

    @Test
    public void checkShopIsFromCracow() {
        boolean b = clothesShopUtils.isFromCracow(clothesShop);
        Assert.assertFalse(b);
    }

    @Test
    public void checkShopCityAndStreet() {
        boolean b = clothesShopUtils.checkCityAndStreet(clothesShop);
        Assert.assertFalse(b);
    }

    @Test
    public void checkBrandAndSizeClothInShop() {
        boolean b = clothesShopUtils.checkBrandAndSize(clothesShop);
        Assert.assertTrue(b);
    }


}
