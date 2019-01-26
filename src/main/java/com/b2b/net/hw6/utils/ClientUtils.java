package com.b2b.net.hw6.utils;

import com.b2b.net.hw6.domains.Client;
import com.sun.org.apache.xpath.internal.operations.Equals;

public class ClientUtils {

//1
    //Napisz metode, ktora stwierdzi czy klient jest pelnoletni

    public boolean isClientAdult(Client client) {
        boolean result;
        result = client.getAge()>=18?true:false;
        return result;
    }
    //2
    //Napisz metode, ktora stwierdzi czy klient pochodzi z Warszawy, skorzystaj z equals

    public boolean isClientFromWarsaw(Client client) {
        boolean result;
        result = client.getCity().equals("Warszawa")?true:false;
        return result;
    }
    //3
    //Napisz metode, która stwierdzi czy klient ma na imie Adam, skorzystaj z equals

    public boolean isClientNameEqualAdam(Client client) {
        boolean result;
        result = client.getName().equals("Adam")?true:false;
        return result;
    }
    //4
    //Napisz metode, ktora stwierdzi czy klient jest kobieta czy mezczyzna, (stwierdzamy to na podstawie tego, czy imie konczy sie litera 'a'
    //skorzystaj ze zmiennej pomocniczej typu char
    //i metod length() i charAt

    public String checkSex(Client client) {
//        String name= client.getName();
//       int liczba = client.getName().length()-1;
//       char litera = name.charAt(liczba);
//
//       String clientSex = litera == 'a'?"woman":"man";
//        return clientSex;
//
        String name = client.getName();
        name.endsWith("a");
       return name.substring(name.length()-1,name.length()).equals("a")
               ?"woman":"man";

    }


    //6
    //Napisz metode, która stwierdzi czy zakupione przez klienta ubranie jest tańsze niz 100zł

    public boolean isCheaperThan100(Client client) {
        boolean isCheaper;
        isCheaper = client.getCloth().getPrice()<100.0?true:false;
        return isCheaper;
    }

    //7
    //Napisz metode, która stwierdzi czy zakupiony przez klienta produkt jest rozmiaru S

    public boolean isSizeEqualS(Client client) {
        boolean isSizeEqualS;
        isSizeEqualS = client.getCloth().getSize().equals("s")?true:false;
        return isSizeEqualS;
    }

}
