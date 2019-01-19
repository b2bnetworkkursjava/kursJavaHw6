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
    private Cloth cloth = new Cloth("dres", 99, "s", "Puma");
    private Client client = new Client("Aneta", "Pasik", 29, "Nokia", "Kinowa", "Warsaw", "12345",cloth );
    private ClothesShop clothesShop = new ClothesShop("Sklep","123456","Mloda","123456","Warsaw", client,cloth);
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
