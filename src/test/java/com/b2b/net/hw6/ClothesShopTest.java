package com.b2b.net.hw6;

import com.b2b.net.hw6.domains.Client;
import com.b2b.net.hw6.domains.Cloth;
import com.b2b.net.hw6.domains.ClothesShop;
import com.b2b.net.hw6.utils.ClothesShopUtils;
import org.junit.Assert;
import org.junit.Test;

public class ClothesShopTest {
    private Cloth cloth = new Cloth("Bluza", 199.99, "S", "Puma");
    private Client client = new Client("Bartosz","Nowak",27,"123456789","Złota",
            "Warszawa","05-022",cloth);
    private ClothesShop clothesShop = new ClothesShop("ClothesShop", "123456789", "Anielewicza",
            "00-012", "Warszawa",client);


    private ClothesShopUtils clothesShopUtils = new ClothesShopUtils();


    @Test
    public void checkBrandEqualPuma()
    {
        boolean b = clothesShopUtils.checkBrand(clothesShop);
        Assert.assertTrue(b);
    }

    @Test
    public void checkClothIsCheaperThan220()
    {
        boolean b = clothesShopUtils.isCheaperThan220(clothesShop);
        Assert.assertTrue(b);
    }

    @Test
    public void checkShopIsFromCracow()
    {
        boolean b = clothesShopUtils.isFromCracow(clothesShop);
        Assert.assertFalse(b);
    }

    @Test
    public void checkShopCityAndStreet()
    {
        boolean b = clothesShopUtils.checkCityAndStreet(clothesShop);
        Assert.assertFalse(b);
    }

    @Test
    public void checkBrandAndSizeClothInShop()
    {
        boolean b = clothesShopUtils.checkBrandAndSize(clothesShop);
        Assert.assertTrue(b);
    }


}
