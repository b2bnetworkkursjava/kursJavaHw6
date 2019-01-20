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
    Cloth cloth = new Cloth("koszula", 25, "S", "Vistula");
    Client client= new Client("Adam","Gałązka",30, "665777809", "Prosta", "Warszawa", "00-699", cloth  );
    Client client2= new Client("Ewa","Ładna",30, "665777809", "Prosta", "Warszawa", "00-699", cloth  );

    ClientUtils clientUtils = new ClientUtils();
   // private Cloth cloth;
   // private Client client;
     // private ClientUtils clientUtils;
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
        boolean b = clientUtils.isClientNameEqualAdam(client);
        Assert.assertTrue(b);
    }
    @Test
    public void checkClientSex()
    {
        Assert.assertEquals("woman",clientUtils.checkSex(client2));

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
