package com.b2b.net.hw6.utils;

import com.b2b.net.hw6.domains.Client;

public class ClientUtils {

    //1
    //Napisz metode, ktora stwierdzi czy klient jest pelnoletni

    public boolean isClientAdult(Client client) {
        boolean result;

        if (client.getAge() >= 18) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
    //2
    //Napisz metode, ktora stwierdzi czy klient pochodzi z Warszawy, skorzystaj z equals

    public boolean isClientFromWarsaw(Client client) {
        boolean result;

        result = client.getCity().equals("Warsaw");
        return result;
    }
    //3
    //Napisz metode, która stwierdzi czy klient ma na imie Adam, skorzystaj z equals

    public boolean isClientNameEqualAdam(Client client) {
        boolean result;

        result = client.getName().equals("Adam");
        return result;
    }
    //4
    //Napisz metode, ktora stwierdzi czy klient jest kobieta czy mezczyzna, (stwierdzamy to na podstawie tego, czy imie konczy sie litera 'a'
    //skorzystaj ze zmiennej pomocniczej typu char
    //i metod length() i charAt

    public String checkSex(Client client) {
        String result;
        int nameLength;
        char lastChar;

        nameLength = client.getName().length();
        lastChar = client.getName().charAt(nameLength - 1);

        if (lastChar == 'a') {
            result = "woman";
        } else {
            result = "man";
        }
        return result;
    }
    //6
    //Napisz metode, która stwierdzi czy zakupione przez klienta ubranie jest tańsze niz 100zł

    public boolean isCheaperThan100(Client client) {
        boolean result;

        result = client.getCloth().getPrice() < 100;

        return result;
    }

    //7
    //Napisz metode, która stwierdzi czy zakupiony przez klienta produkt jest rozmiaru S

    public boolean isSizeEqualS(Client client) {
        boolean result;

        result = client.getCloth().getSize() == "S";

        return result;
    }

}
