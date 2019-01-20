package com.b2b.net.hw6;

import com.b2b.net.hw6.domains.Cloth;
import com.b2b.net.hw6.utils.ClothUtils;
import org.junit.Assert;
import org.junit.Test;

public class ClothTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */
    Cloth cloth = new Cloth("koszula", 99, "S", "Adidas");
    Cloth cloth2 = new Cloth("koszula", 99, "S", "Nike");
     ClothUtils clothUtils = new ClothUtils();



    @Test
    public void checkPriceIsInTheRange()
    {
        boolean b = clothUtils.isPriceInTheRange(cloth);
        Assert.assertTrue(b);
    }

    @Test
    public void checkBrandEqualNike()
    {
        boolean b = clothUtils.isBrandEqualNike(cloth2);
        Assert.assertTrue(b);
    }

    @Test
    public void checkSizeEqualSmallOrMedium()
    {
        boolean b = clothUtils.checkSize(cloth);
        Assert.assertTrue(b);
    }
    @Test
    public void checkBrandEqualNikeOrAdidas()
    {
        boolean b = clothUtils.checkBrand(cloth);
        Assert.assertTrue(b);
    }

    @Test
    public void checkBrandAndPriceCloth()
    {
        boolean b = clothUtils.checkBrandAndPrice(cloth);
        Assert.assertTrue(b);
    }



}
