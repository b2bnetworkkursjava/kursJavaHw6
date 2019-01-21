package com.b2b.net.hw6;

import com.b2b.net.hw6.domains.Client;
import com.b2b.net.hw6.domains.Cloth;
import com.b2b.net.hw6.utils.ClientUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple Client.
 */
public class ClientTest {
    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */
    private Cloth cloth = new Cloth("Spodnie", 50, "S", "Puma");
    private Client client = new Client("Ewa", "Kowalski", 20, "666999000", "Grochowska", "Warsaw", "00-111", cloth);
    //błąd w teście - przechodzi zarówno dla Adama i nie dla Adama
    private ClientUtils clientUtils = new ClientUtils();

    /**
     * Rigorous Test :-)
     */
    @Test
    public void checkIsClientAdult() {
        boolean b = clientUtils.isClientAdult(client);
        Assert.assertTrue(b);
    }

    @Test
    public void checkIsClientFromWarsaw() {
        boolean b = clientUtils.isClientFromWarsaw(client);
        Assert.assertTrue(b);
    }

    @Test
    public void checkIsClientNameEqualAdam() {
        boolean b = clientUtils.equals(client); //nie używa właściwej metody - przechodzi dla Adama i nie dla Adama. Niżej poprawione.
        Assert.assertFalse(b);
    }

    @Test
    public void checkIsClientNameEqualAdam1() {
        boolean b = clientUtils.isClientNameEqualAdam(client);
        Assert.assertFalse(b);
    }

    @Test
    public void checkClientSex() {
        Assert.assertEquals("woman", clientUtils.checkSex(client));

    }

    @Test
    public void checkClothIsCheaperThan100() {
        boolean b = clientUtils.isCheaperThan100(client);
        Assert.assertTrue(b);
    }

    @Test
    public void checkSizeEqualS() {
        boolean b = clientUtils.isSizeEqualS(client);
        Assert.assertTrue(b);
    }

}
