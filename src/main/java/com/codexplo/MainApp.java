package com.codexplo;

/**
 * Created by rokonoid on 4/19/14.
 */
public class MainApp {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(LanguageFactory.get("English"));
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(LanguageFactory.get("Bangla"));
        }
        
        for (int i = 0; i < 100; i++) {
            System.out.println(LanguageFactory.get("Chaines"));
        }
    }
}
