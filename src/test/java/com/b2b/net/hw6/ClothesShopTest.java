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
    Cloth cloth = new Cloth("koszula", 219, "S", "Puma");
    Client client= new Client("Adam","Gałązka",30, "665777809", "Prosta", "Warszawa", "00-699", cloth  );
    ClothesShopUtils clothesShopUtils = new ClothesShopUtils();
    ClothesShop clothesShop= new ClothesShop("bazar Pażdziocha", "666777888", "Grochowska", "02-588", "Warszawa", client);
    ClothesShop clothesShop2= new ClothesShop("bazar Pażdziocha", "666777888", "Grochowska", "02-588", "Kraków", client);

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
        boolean b = clothesShopUtils.isFromCracow(clothesShop2);
        Assert.assertTrue(b);
    }

    @Test
    public void checkShopCityAndStreet()
    {
        boolean b = clothesShopUtils.checkCityAndStreet(clothesShop);
        Assert.assertTrue(b);
    }

    @Test
    public void checkBrandAndSizeClothInShop()
    {
        boolean b = clothesShopUtils.checkBrandAndSize(clothesShop);
        Assert.assertTrue(b);
    }


}
