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
    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */
   // private Cloth cloth;
    //private Client client;
    //private ClientUtils clientUtils;
    Cloth spodnie = new Cloth("spodnie", 99.0, "s", "gap");
    Client client1 = new Client("Marysia", "Kowalska", 18, "325435134", "fasfsd", "Warszawa", "00-713",spodnie);
    /**
     * Rigorous Test :-)
     */
    ClientUtils clientUtils = new ClientUtils();
    @Test
    public void checkIsClientAdult()
    {
        boolean b = clientUtils.isClientAdult(client1);
        Assert.assertTrue(b);
    }
    @Test
    public void checkIsClientFromWarsaw()
    {
        boolean b = clientUtils.isClientFromWarsaw(client1);
        Assert.assertTrue(b);
    }
    @Test
    public void checkClientNameEqualAdam() //to trzeba zmienić - dodać odpowiednią metodę
    {
        boolean b = clientUtils.isClientNameEqualAdam(client1);
        Assert.assertFalse(b);
    }
    @Test
    public void checkClientSex()
    {
        Assert.assertEquals("woman",clientUtils.checkSex(client1));

    }
    @Test
    public void checkClothIsCheaperThan100()
    {
        boolean b = clientUtils.isCheaperThan100(client1);
        Assert.assertTrue(b);
    }

    @Test
    public void checkSizeEqualS()
    {
        boolean b = clientUtils.isSizeEqualS(client1);
        Assert.assertTrue(b);
    }

}
