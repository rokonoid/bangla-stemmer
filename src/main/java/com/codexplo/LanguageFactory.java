package com.codexplo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rokonoid on 4/19/14.
 */
public class LanguageFactory {
    private static Map<String, String> languages = new HashMap<String, String>();

    static {
        languages.put("English", "Hello world");
        languages.put("Spanish", "¡Hola, mundo");
        languages.put("Chaines", "你好世界");
        languages.put("Arabic", "مرحبا العالم");
        languages.put("Greek", "Γεια σας κόσμο");
    }

    public static String get(String key) {
        return languages.get(key);
    }

}
