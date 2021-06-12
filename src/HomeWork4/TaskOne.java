package HomeWork4;

import java.util.*;

public class TaskOne {

    public static void main(String[] args) {

        String[] wordArray = {"Холодильник", "Шкаф", "Тумбочка", "Кровать", "Одеяло", "Телевизор",
                "Сушилка", "Душ", "Раковина", "Кружка", "Душ", "Душ", "Душ", "Тумбочка", "Холодильник"};

        HashSet<String> hashSetWordArray = new HashSet<>(Arrays.asList(wordArray));
        System.out.println(hashSetWordArray);

        for (String word : hashSetWordArray) {
            int value = 0;
            for (String otherWord : wordArray) {
                if (word.equals(otherWord)) {
                    value++;
                }
            }
            System.out.println("Слово " + word + " повторяется " + value + " раз");
        }
    }
}







