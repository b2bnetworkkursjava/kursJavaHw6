package com.b2b.net.hw6.utils;

import com.b2b.net.hw6.domains.Client;
import com.b2b.net.hw6.domains.Cloth;

public class ClientUtils {

    //1
    //Napisz metode, ktora stwierdzi czy klient jest pelnoletni

    public boolean isClientAdult(Client client) {
        boolean bool;
        if (client.getAge() > 18) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }
    //2
    //Napisz metode, ktora stwierdzi czy klient pochodzi z Warszawy, skorzystaj z equals

    public boolean isClientFromWarsaw(Client client) {
        boolean bool;
        if (client.getCity().equals("Warszawa")) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }
    //3
    //Napisz metode, która stwierdzi czy klient ma na imie Adam, skorzystaj z equals

    public boolean isClientNameEqualAdam(Client client) {
        boolean bool;
        if (client.getName().equals("Adam")) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }
    //4

    //Napisz metode, ktora stwierdzi czy klient jest kobieta czy mezczyzna, (stwierdzamy to na podstawie tego, czy imie konczy sie litera 'a'
    //skorzystaj ze zmiennej pomocniczej typu char
    //i metod length() i charAt

    public String checkSex(Client client) {
        int length = client.getName().length();
        char lastLetter = client.getName().charAt(length - 1);
        String sex;
        if (lastLetter == 'a') {
            sex = "woman";
        } else {
            sex = "man";
        }
        return sex;
    }
    //6
    //Napisz metode, która stwierdzi czy zakupione przez klienta ubranie jest tańsze niz 100zł

    public boolean isCheaperThan100(Client client) {
        double clientCloth = client.getCloth().getPrice();
        boolean bool;
        if (clientCloth < 100) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }

    //7
    //Napisz metode, która stwierdzi czy zakupiony przez klienta produkt jest rozmiaru S

    public boolean isSizeEqualS(Client client) {
        String clientCloth = client.getCloth().getSize();
        boolean bool;
        if (clientCloth.equals("S")){
            bool = true;
        }else {
            bool = false;
        }
        return bool;
    }

}
