package com.b2b.net.hw6;

import com.b2b.net.hw6.domains.Client;
import com.b2b.net.hw6.domains.Cloth;
import com.b2b.net.hw6.utils.ClientUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple Client.
 */
public class ClientTest
{
    private Cloth cloth = new Cloth("Spodnie",23.50,"S","Puma");
    private Client client = new Client("Ania","Nowacka",32,"123456789","Grochowska",
            "Warszawa","05-022",cloth);
    private ClientUtils clientUtils = new ClientUtils();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void checkIsClientAdult()
    {
        boolean b = clientUtils.isClientAdult(client);
        Assert.assertTrue(b);
    }
    @Test
    public void checkIsClientFromWarsaw()
    {
        boolean b = clientUtils.isClientFromWarsaw(client);
        Assert.assertTrue(b);
    }
    @Test
    public void checkClientNameEqualAdam()
    {
        boolean b = clientUtils.equals(client);
        Assert.assertFalse(b);
    }
    @Test
    public void checkClientSex()
    {
        Assert.assertEquals("woman",clientUtils.checkSex(client));

    }
    @Test
    public void checkClothIsCheaperThan100()
    {
        boolean b = clientUtils.isCheaperThan100(client);
        Assert.assertTrue(b);
    }

    @Test
    public void checkSizeEqualS()
    {
        boolean b = clientUtils.isSizeEqualS(client);
        Assert.assertTrue(b);
    }

}
