package com.java.KelimeUygulaması;
/*
 * Kelime Uygulaması
 */
import java.util.*;

public class KelimeDizisi{

    public static void main(String[] args) {

        String[] kelimeler = {"elma", "kalem", "deneme", "damat", "gelin", "gelir", "gider"};

        List<Character> charList = new ArrayList<>();
        int count = 0;

        for (String kelime : kelimeler) {
            if (hasRepeatedChars(kelime)) {
                System.out.println("Tekrarlı harf içeren kelime: " + kelime);
                for (char c : kelime.toCharArray()) {
                    charList.add(c);
                }
                count++;
                if (count == 2) {
                    break;
                }
            }
        }

        if (count < 2) {
            System.out.println("İki adet tekrarlı harf içeren kelime bulunamadı.");
            return;
        }

        String randomText = generateRandomText(charList);
        System.out.println("Oluşturulan rastgele metin: " + randomText);
    }

    private static boolean hasRepeatedChars(String word) {
        Set<Character> charSet = new HashSet<>();
        for (char c : word.toCharArray()) {
            if (!charSet.add(c)) {
                return true;
            }
        }
        return false;
    }

    private static String generateRandomText(List<Character> charList) {
        Collections.shuffle(charList);
        StringBuilder sb = new StringBuilder();
        for (char c : charList) {
            sb.append(c);
        }
        return sb.toString();
    }
}
