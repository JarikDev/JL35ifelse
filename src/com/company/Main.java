package com.company;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Object o = new Object();
        Object o2 = new Object();
        System.out.println(o == o2); // sravnivaet adresa v pamiati
        Main main = new Main();
        System.out.println(main instanceof Main);
        System.out.println(main instanceof List);
        String s = "bla"; //dlia string pereopred plus
        System.out.println(s + " Yohohoho");
        System.out.println("" + 6 + 5);
        System.out.println(6 + 5 + "");
        int a = 5;
        a++;

        System.out.println(a++ + ++a);
        System.out.println(a);
        System.out.println(a++);
        System.out.println(++a);
        int aa = (5 > 6) ? 1 : 2;
        System.out.println(aa);
        int aaa = false ? 2 + 4 : 3 + 6;
        System.out.println(aaa);
        System.out.println(5 > 4 && 6 > 3);
        System.out.println(5 > 4 & 6 > 3);
        System.out.println(5 > 7 && 6 > 3);
        System.out.println(5 > 7 || 6 > 3);
        System.out.println(5 > 7 || 6 > 9);
        System.out.println(5 > 7 || returnBool()); //unary checking both sides
        System.out.println(!(5 > 7));
        System.out.println(returnGalochka());

    }
    private static boolean returnBool(){
        System.out.println("return Boolean");
        return true;
    }
    private static boolean returnGalochka(){ //proveraet 4to oba operatora raznie
        System.out.println("return Boolean");
        return(true^false) ;
    }
}
