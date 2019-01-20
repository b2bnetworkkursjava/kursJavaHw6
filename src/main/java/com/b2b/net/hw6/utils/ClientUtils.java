package com.b2b.net.hw6.utils;

import com.b2b.net.hw6.domains.Client;
import com.b2b.net.hw6.domains.Cloth;

public class ClientUtils {
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
        if (client.getCity().equals("Warszawa")) {
            result=true;
        }
        else {
            result=false;}
        return result;
    }
    //3
    //Napisz metode, która stwierdzi czy klient ma na imie Adam, skorzystaj z equals

    public boolean isClientNameEqualAdam(Client client) {
String imie = "Adam";
        if (imie.equals(client.getName())) return true;
        else return false;

    }
    //4
    //Napisz metode, ktora stwierdzi czy klient jest kobieta czy mezczyzna, (stwierdzamy to na podstawie tego, czy imie konczy sie litera 'a'
    //skorzystaj ze zmiennej pomocniczej typu char
    //i metod length() i charAt

    public String checkSex(Client client) {
int dlugoscImienia=client.getName().length();
char litera = 'a';
String plec;
if (client.getName().charAt(dlugoscImienia-1)==litera){
        plec = "woman";
    }
else{
    plec = "probably man";
}
return plec;
    }

    //6
    //Napisz metode, która stwierdzi czy zakupione przez klienta ubranie jest tańsze niz 100zł

    public boolean isCheaperThan100(Client client) {
       /* boolean result;
        if (client.getCloth().getPrice()<100) {
            result = true;
        } else {
            result = false;
        }
        return result;
*/
        boolean result;
        result = client.getCloth().getPrice()<100?true:false;
     return  result;
    }

    //7
    //Napisz metode, która stwierdzi czy zakupiony przez klienta produkt jest rozmiaru S

    public boolean isSizeEqualS(Client client) {
        boolean result;
        result = client.getCloth().getSize()=="S"?true:false;
        return  result;
    }

}
