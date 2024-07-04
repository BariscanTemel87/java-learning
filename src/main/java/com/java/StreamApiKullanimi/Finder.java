package com.java.StreamApiKullanimi;

import java.util.List;
import java.util.Optional;

/*
 * Stream API Kullanımı
 */
import java.util.List;
import java.util.Optional;

public class Finder {
    public static <T> Object findElement(List<T> collection, T element) {
        Optional<T> foundElement = collection.stream()
                .filter(e -> e.equals(element))
                .findFirst();
        return foundElement.isPresent() ? foundElement.get() : -1;
    }

    public static void main(String[] args) {

        GenericClass<String> stringInstance = new GenericClass<>("Merhaba");
        stringInstance.printGenericField();

        GenericClass<Integer> integerInstance = new GenericClass<>(100);
        integerInstance.printGenericField();

        List<String> list = List.of("java", "python", "c++", "C#");
        String element = "java";

        Object result = findElement(list, element);
        if (result instanceof String) {
            System.out.println("Element Bulundu: " + result);
        } else {
            System.out.println("Element Bulunamadı, sonuç -1");
        }
    }
}


