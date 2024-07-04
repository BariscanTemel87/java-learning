package com.java.StreamApiKullanimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/*
 * Stream API Kullanımı
 */
public class FinderWithScanner {
    public static <T> Object findElement(List<T> collection, T element) {
        Optional<T> foundElement = collection.stream()
                .filter(e -> e.equals(element))
                .findFirst();
        return foundElement.isPresent() ? foundElement.get() : -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        list.add("ios");
        list.add("android");
        list.add("hms");

        System.out.print("Enter element to search: ");
        String element = scanner.nextLine();

        Object result = findElement(list, element);
        if (result instanceof String) {
            System.out.println("Element Bulundu: " + result);
        } else {
            System.out.println("Element Bulunamadı, Sonuç -1");
        }

        scanner.close();
    }
}

