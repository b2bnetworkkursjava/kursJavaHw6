package com.b2b.net.hw6.utils;

import com.b2b.net.hw6.domains.Client;


public class ClientUtils {

    //1
    //Napisz metode, ktora stwierdzi czy klient jest pelnoletni

    public boolean isClientAdult(Client client) {
        boolean result;
        if (client.getAge() >= 18) {
            return true;
        } else {
            return false;
        }

    }

    //2
    //Napisz metode, ktora stwierdzi czy klient pochodzi z Warszawy, skorzystaj z equals

    public boolean isClientFromWarsaw(Client client) {
        if (client.getCity().equals("Warszawa")) {
            return true;
        } else
            return false;
    }
    //3
    //Napisz metode, która stwierdzi czy klient ma na imie Adam, skorzystaj z equals

    public boolean isClientNameEqualAdam(Client client) {
        if (client.getName().equals("Adam")) {
            return true;
        } else
            return false;
    }
    //4
    //Napisz metode, ktora stwierdzi czy klient jest kobieta czy mezczyzna, (stwierdzamy to na podstawie tego, czy imie konczy sie litera 'a'
    //skorzystaj ze zmiennej pomocniczej typu char
    //i metod length() i charAt

    public String checkSex(Client client) {
        char last = client.getName().charAt(client.getName().length()-1);
        String result = "";
        if (last== 'a'){
            result = "woman";
        }
        else {
            result = "man";
        }
        return result;
    }
    //6
    //Napisz metode, która stwierdzi czy zakupione przez klienta ubranie jest tańsze niz 100zł

    public boolean isCheaperThan100(Client client) {
        if (client.getCloth().getPrice() < 100.00) {
            return true;
        } else
            return false;
    }

    //7
    //Napisz metode, która stwierdzi czy zakupiony przez klienta produkt jest rozmiaru S

    public boolean isSizeEqualS(Client client) {
        if (client.getCloth().getSize() == "S") {
            return true;
        } else
            return false;
    }
}


