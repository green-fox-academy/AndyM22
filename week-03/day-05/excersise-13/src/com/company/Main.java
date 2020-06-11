package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

public class Main<ArrayList> {

    public static void main(String[] args) {

        HashMap<String, Integer> productDatabase = new HashMap<>();

        productDatabase.put("Eggs", 200);
        productDatabase.put("Milk", 200);
        productDatabase.put("Fish", 400);
        productDatabase.put("Apples", 150);
        productDatabase.put("Bread", 50);
        productDatabase.put("Chicken", 550);

        System.out.println("Fish costs " + productDatabase.get("Fish") + " Kč");

        System.out.println("The most expensive product is " + theMostExpansiveProduct(productDatabase));

        System.out.println("The average price is " + theAveragePrice(productDatabase));

        System.out.println("The number of products below price 300 is: " + priceBelow300((productDatabase), 300));

        if (productDatabase.containsValue(125)) {
            System.out.println("Yes, we can buy anything for 125 Kč");
        } else {
            System.out.println("No, we can't buy anything for 125 Kč");
        }



    }

    public static String theMostExpansiveProduct(HashMap<String, Integer> mapa) {//metoda, která vrátí výsledek v datovém typu Integer; jako parametery použije nově vytvořenou HashMapu, která pracuje s vnitřními parametry String a Integer; v metodě s ní pracuje pod názvem mapa
        int a = 0; //vytvoří inetegr s hodnotou 0, který bude představovat hodnotu, na které začneme
        String result = ""; //vytvoří prázdný String, do kterého pak můžeme přidat výslednou hodnotu
        for (String element : mapa.keySet()) { //pro každou dvojici key-value vytvoří nový String s názvem element (vypíše všechny klíče s příslušnými hodnotami; element představuje klíč (key))
            if ((mapa.get(element)) > a) { //vytvoří podmínku, pod kterou nám dá foreachloop požadovaný output = hodnota klíče z HashMapy musí být větší než počáteční hodnota a(0) - pokud je tato podmínka splněna, pokračuje dále (pokud ne, přistupuje k další dvojici key-value v seznamu HashMapy)
                a = mapa.get(element); //počáteční hodnota a(0) je přepsána na hodnotu klíče => v dalším kole už porovnává s touto hodnotou
                result = element; //původní hodnotu stringu přepisuje na klíč; jako poslední vyjde klíč s nejvyšší hodnotou
            }
        }
        return result; //vrací nám string s názvem klíče s njevyšší hodnotou
    }


    public static Integer theAveragePrice(HashMap<String, Integer> mapa) {
        int a = 0; //počáteční hodnota
        for (String element : mapa.keySet()) {
            a += mapa.get(element); //k hodnotě integeru a(0) přičte hodnotu klíče z HashMapy => v dalším kolem loopu bude počáteční hodnota a začínat na hodnotě předchozího klíče => proces se opakuje, dokud neprojde všechny dvojice z HashMapy => výsledkem je součet všech klíčových hodnot
        }
        return a / mapa.size(); //vrátí součet všech hodnot vydělený počtem dvojic v HashMapě

    }

    public static int priceBelow300(HashMap<String, Integer> mapa, int price) {
        int result = 0; //počáteční částka
        for (int value : mapa.values()) { //pro každou hodnotu vytvoří nový ineteger s názvem value (vypíše všechny hodnoty)
            if (value <= price) { //pokud je hodnota menší než stanovená částka
                result++; //tak chci, aby se počáteční částka zvýšila o 1 => dostaneme počet hodnot, které jsou vyšší než stanovená částka
            }
        }
        return result;
    }
}
