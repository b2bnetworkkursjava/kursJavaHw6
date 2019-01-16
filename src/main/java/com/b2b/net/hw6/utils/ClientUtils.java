package com.b2b.net.hw6.utils;

import com.b2b.net.hw6.domains.Client;

public class ClientUtils {

    //1
    //Napisz metode, ktora stwierdzi czy klient jest pelnoletni

    public boolean isClientAdult(Client client) {
        boolean result = false;
        if (client.getAge() >= 18) {
            result = true;
        }
        return result;
    }
    //2
    //Napisz metode, ktora stwierdzi czy klient pochodzi z Warszawy

    public boolean isClientFromWarsaw(Client client) {
        boolean result = false;
        if (client.getCity().equals("Warszawa")) {
            result = true;
        }
        return result;
    }
    //3
    //Napisz metode, która stwierdzi czy klient ma na imie Adam

    public boolean isClientNameEqualAdam(Client client) {
        boolean result = false;
        if (client.getName().equals("Adam")) {
            result = true;
        }
        return result;
    }
    //4
    //Napisz metode, ktora stwierdzi czy klient jest kobieta czy mezczyzna

    public String checkSex(Client client) {
        String result = "man";
        int lengthName = client.getName().length();
        char letterA = 'a';
        if (client.getName().charAt(lengthName - 1) == letterA) {
            result = "woman";
        }
        return result;
    }
    //6
    //Napisz metode, która stwierdzi czy zakupione przez klienta ubranie jest tańsze niz 100zł

    public boolean isCheaperThan100(Client client) {
        boolean result = false;
        if (client.getCloth().getPrice() < 100) {
            result = true;
        }
        return result;
    }

    //7
    //Napisz metode, która stwierdzi czy zakupiony przez klienta produkt jest rozmiaru S

    public boolean isSizeEqualS(Client client) {
        boolean result = false;
        if (client.getCloth().getSize().equals("S")) {
            result = true;
        }
        return result;
    }

}
