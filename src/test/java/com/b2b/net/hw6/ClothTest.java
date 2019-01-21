package com.b2b.net.hw6;

import com.b2b.net.hw6.domains.Cloth;
import com.b2b.net.hw6.utils.ClothUtils;
import org.junit.Assert;
import org.junit.Test;

public class ClothTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */
    private Cloth cloth1 = new Cloth("Majtki", 20, "L","Adidas");
    private ClothUtils clothUtils= new ClothUtils();


    @Test
    public void checkPriceIsInTheRange()
    {
        boolean b = clothUtils.isPriceInTheRange(cloth1);
        Assert.assertTrue(b);
    }

    @Test
    public void checkBrandEqualNike()
    {
        boolean b = clothUtils.isBrandEqualNike(cloth1);
        Assert.assertFalse(b);
    }

    @Test
    public void checkSizeEqualSmallOrMedium()
    {
        boolean b = clothUtils.checkSize(cloth1);
        Assert.assertFalse(b);
    }
    @Test
    public void checkBrandEqualNikeOrAdidas()
    {
        boolean b = clothUtils.checkBrand(cloth1);
        Assert.assertFalse(b);
    }

    @Test
    public void checkBrandAndPriceCloth()
    {
        boolean b = clothUtils.checkBrandAndPrice(cloth1);
        Assert.assertTrue(b);
    }



}
