package Homework5;

import java.io.FileNotFoundException;
import java.util.*;

public class UniqueWordsMain {
    public static void main(String[] args) throws FileNotFoundException {
        UniqueWords text = new UniqueWords();
        String words = text.scanFile("C:\\Users\\Admin\\Desktop\\Java\\Домашки\\Война и мир_книга.txt");
        List<String> list = Arrays.asList(words.split(" "));
        words.replaceAll("[^a-zA-Z ]", "");
        Set<String> uniqueWords = new HashSet<>(list);

        for (String word : uniqueWords) {
            uniqueWords.add(word);
        }
        System.out.println("Кол-во уникальных слов: " + uniqueWords.size());

        Map<String, Integer> topOfUniqueWords = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            if (!topOfUniqueWords.containsKey(temp)){
                topOfUniqueWords.put(temp, 1);
            }else {
                topOfUniqueWords.put(temp, topOfUniqueWords.get(temp) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : topOfUniqueWords.entrySet()){
            System.out.println("Слово = " + "\"" + entry.getKey() + " Количество повторений = " + entry.getValue());
        }
    }
}
