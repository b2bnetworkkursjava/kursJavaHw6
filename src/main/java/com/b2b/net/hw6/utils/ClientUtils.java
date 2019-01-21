package com.b2b.net.hw6.utils;

import com.b2b.net.hw6.domains.Client;
import com.b2b.net.hw6.domains.Cloth;

public class ClientUtils {


    //1
    //Napisz metode, ktora stwierdzi czy klient jest pelnoletni

    public boolean isClientAdult(Client client ) {
        int age = client.getAge();
        boolean bool;
        if (age >18 ) bool = true;
        else bool = false;
        return bool;}
    //2
    //Napisz metode, ktora stwierdzi czy klient pochodzi z Warszawy, skorzystaj z equals

    public boolean isClientFromWarsaw(Client client) {
        String city = client.getCity();
        boolean bool;
        if (city.equals("Warszawa")) bool = true;
        else bool = false;
        return bool;
    }
    //3
    //Napisz metode, która stwierdzi czy klient ma na imie Adam, skorzystaj z equals

    public boolean isClientNameEqualAdam(Client client) {
        String name = client.getName();
       boolean bool;
        if (name.equals("Adam")) bool = true;
        else bool = false;
        return bool;
    }
    //4
    //Napisz metode, ktora stwierdzi czy klient jest kobieta czy mezczyzna, (stwierdzamy to na podstawie tego, czy imie konczy sie litera 'a'
    //skorzystaj ze zmiennej pomocniczej typu char
    //i metod length() i charAt

    public String checkSex(Client client) {
        String name = client.getName();
        char letter = 'a';
        int length = name.length();
        char charAt = name.charAt(length-1);
        String sex;
        if (letter == charAt) sex = "woman";
        else sex = "man";
        return sex;


    }
    //6
    //Napisz metode, która stwierdzi czy zakupione przez klienta ubranie jest tańsze niz 100zł

    public boolean isCheaperThan100(Client client) {
        Cloth cloth = client.getCloth();
        double price = cloth.getPrice();
        boolean bool;
        if (price < 100) bool = true;
        else bool = false;
        return bool;
    }

    //7
    //Napisz metode, która stwierdzi czy zakupiony przez klienta produkt jest rozmiaru S

    public boolean isSizeEqualS(Client client) {
        Cloth cloth = client.getCloth();
        String size = cloth.getSize();
        String size1 = "S";
        boolean bool;
        if (size.equals(size1)) bool = true;
        else bool = false;
        return bool;
    }

}
