package com.b2b.net.hw6;

import com.b2b.net.hw6.domains.Cloth;
import com.b2b.net.hw6.utils.ClothUtils;
import org.junit.Assert;
import org.junit.Test;

public class ClothTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */
    private Cloth cloth;
    private ClothUtils clothUtils;


    @Test
    public void checkPriceIsInTheRange()
    {
        boolean b = clothUtils.isPriceInTheRange(cloth);
        Assert.assertTrue(b);
    }

    @Test
    public void checkBrandEqualNike()
    {
        boolean b = clothUtils.isBrandEqualNike(cloth);
        Assert.assertFalse(b);
    }

    @Test
    public void checkSizeEqualSmallOrMedium()
    {
        boolean b = clothUtils.checkSize(cloth);
        Assert.assertFalse(b);
    }
    @Test
    public void checkBrandEqualNikeOrAdidas()
    {
        boolean b = clothUtils.checkSize(cloth);
        Assert.assertFalse(b);
    }

    @Test
    public void checkBrandAndPriceCloth()
    {
        boolean b = clothUtils.checkBrandAndPrice(cloth);
        Assert.assertTrue(b);
    }



}
