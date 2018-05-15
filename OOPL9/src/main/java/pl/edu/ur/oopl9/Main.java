/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author xszel
 */
public class Main {

    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        HashMap<String,String> slownik;
        slownik = new HashMap<>();
        slownik.put("yes ", "tak");
        slownik.put("no", "nie");
        slownik.put("perhaps", "może ");
        slownik.put("please", "proszę");
        slownik.put("thanks", "dzięki");
        slownik.put("hi", "hej");
        slownik.put("hello", "cześć");
        slownik.put("goodbye", "do widzenia");
        slownik.put("goodnight", "dobranoc");
        slownik.put("excuse me", "przepraszam ");
        slownik.put("no problem", "nie ma problemu");
        slownik.put("I understand", "	rozumiem");
        slownik.put("I don't understand", "nie rozumiem");
        slownik.put("I know", "wiem");
        slownik.put(" don't know", "nie wiem");
        slownik.put("Entrance", "Wejście");
        slownik.put("Exit", "Wyjście");
        slownik.put("Push", "Pchać");
        slownik.put("No entry", "Wstęp wzbroniony");
        slownik.put("Private", "Prywatne");
        String xd;
        while(true){
            xd=skan.next();
            if(xd.equals("koniec!")){
                break;
            }
            System.out.println(slownik.get(xd));
        }


    }

}
