package com.b2b.net.hw6.utils;

import com.b2b.net.hw6.domains.Client;
import com.b2b.net.hw6.domains.Cloth;
import com.sun.org.apache.xpath.internal.operations.String;

public class ClientUtils {

    //1
    //Napisz metode, ktora stwierdzi czy klient jest pelnoletni

    public boolean isClientAdult(Client client) {
        return true;
    }

    public boolean isClientAdult(Client client) {
        int age = client.getAge();
        boolean b;
        if (age > 18) b = true;
        else b = false;
        return b;
    }

    //2


    //Napisz metode, ktora stwierdzi czy klient pochodzi z Warszawy, skorzystaj z equals

    public boolean isClientFromWarsaw(Client client) {
        return true;
        String city = client.getCity();
        boolean b;
        if (city.equals(("Warsaw")) b = true;
        else b = false;
        return b;

    }
    //3
    //Napisz metode, która stwierdzi czy klient ma na imie Adam, skorzystaj z equals

    public boolean isClientNameEqualAdam(Client client) {
        return true;
        String name = client.getName();
        boolean b;
        if (name.equals("Adam")) b = true;
        else b = false;
        return b;
    }

    //4
    //Napisz metode, ktora stwierdzi czy klient jest kobieta czy mezczyzna, (stwierdzamy to na podstawie tego, czy imie konczy sie litera 'a'
    //skorzystaj ze zmiennej pomocniczej typu char
    //i metod length() i charAt

    public String checkSex(Client client) {
        return "";
        String name = client.getName();
        char letter = 'a';
        int lenght = name.length();
        char charAt = name.charAt(lenght - 1);
        String sex;
        if (letter == charAt) sex = "woman";
        else sex = "man";
        return sex;
    }
    //6
    //Napisz metode, która stwierdzi czy zakupione przez klienta ubranie jest tańsze niz 100zł

    public boolean isCheaperThan100(Client client) {
        return true;
        Cloth cloth = client.getCloth();
        double price = cloth.getPrice();
        boolean b;
        if (price < 100) b = true;
        else b = false;
        return b;
    }

    //7
    //Napisz metode, która stwierdzi czy zakupiony przez klienta produkt jest rozmiaru S

    public boolean isSizeEqualS(Client client) {
        return true;
        Cloth cloth = client.getCloth();
        String size = cloth.getSize();
        String size1 = "S";
        boolean b;
        if (size.equals(size1)) b = true;
        else b = false;
        return b;
    }

}
