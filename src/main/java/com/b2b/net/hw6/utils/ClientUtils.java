package com.b2b.net.hw6.utils;

import com.b2b.net.hw6.domains.Client;

public class ClientUtils {

    //1
    //Napisz metode, ktora stwierdzi czy klient jest pelnoletni

    public boolean isClientAdult(Client client) {
        boolean wiek;
        if (client.getAge()>=18){
            wiek=true;
        }else{
            wiek=false;
        }
        return wiek;
    }
    //2
    //Napisz metode, ktora stwierdzi czy klient pochodzi z Warszawy, skorzystaj z equals

    public boolean isClientFromWarsaw(Client client) {
        boolean miasto;
        if (client.getCity().equals("Warsaw")) {
            miasto = true;
        }else{
            miasto=false;

            }
        return miasto;
    }
    //3
    //Napisz metode, która stwierdzi czy klient ma na imie Adam, skorzystaj z equals

    public boolean isClientNameEqualAdam(Client client) {
        boolean imie;
        if (client.getName().equals("Adam")) {
            imie = true;
        }else{
            imie=false;
        }
        return imie;
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
            sex = "men";
        } else {
            sex = "woman";
        }
        return sex;
    }

    //6
    //Napisz metode, która stwierdzi czy zakupione przez klienta ubranie jest tańsze niz 100zł

    public boolean isCheaperThan100(Client client) {
        boolean cena;
        if (client.getCloth().getPrice()<100) {
            cena = true;
        }else{
            cena=false;
        }
        return cena;
    }

    //7
    //Napisz metode, która stwierdzi czy zakupiony przez klienta produkt jest rozmiaru S

    public boolean isSizeEqualS(Client client) {
        boolean rozmiar;
        if (client.getCloth().getSize().equals("S")) {
            rozmiar = true;
        }else{
            rozmiar=false;
        }
        return rozmiar;
    }

}
