package cw5;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex6 {
    public static void main (String[] args) {
        ex1();
        ex2();
        ex3();
    }
    public static void ex3 (){

        String[] array1 = {"qwe", "asd", "qwe", "x"};
        String[] array2 = {"qwe", "v"};

        Map<String, Integer> mapArray1 = getCountWords(array1);
        Map<String, Integer> mapArray2 = getCountWords(array2);

        Map<String, Integer> mapResult = new HashMap<>();
        for (Map.Entry<String, Integer> entry : mapArray1.entrySet()){
            String key = entry.getKey();
            int countMap1 = entry.getValue();
            int countMap2 = mapArray2.getOrDefault(key, 0);
            if (countMap2 > 0){
                mapResult.put(key, countMap1 + countMap2);
            }
        }

        for(Map.Entry<String, Integer> entry : mapResult.entrySet()){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
    public static void ex2(){
    
        String text = "Хранение и обработка данных ч2: множество коллекций Map.";
        text = text.replaceAll("[-|–|—]|\\p{Punct}", " ");
        while (text.contains("  ")){
            text = text.replace("  ", " ");
        }

        String findWord = "Хранение";

        String[] arrayText = text.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String currentWord : arrayText){
            if (!findWord.toLowerCase().equals(currentWord.toLowerCase())){
                continue;
            }

            int count = map.getOrDefault(findWord.toLowerCase(), 0);
            map.put(currentWord.toLowerCase(), ++count);
        }

        System.out.println("Количество искомого слова: " + map.getOrDefault(findWord.toLowerCase(), 0));

    }
    public static void ex1(){
        String text = "Хранение и обработка данных ч2: множество коллекций Map.";
        text = text.replaceAll("[-|–|—]|\\p{Punct}", " ");
        while (text.contains("  ")){
            text = text.replace("  ", " ");
        }
        String[] arrayText = text.split(" ");

        Map<String, Integer> map = getCountWords(arrayText);

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
    public static Map<String, Integer> getCountWords(String[] array){
        Map<String, Integer> map = new HashMap<>();

        for (String current : array){
            int count = map.getOrDefault(current.toLowerCase(), 0);
            map.put(current.toLowerCase(), ++count);
        }

        return map;
    }
}


