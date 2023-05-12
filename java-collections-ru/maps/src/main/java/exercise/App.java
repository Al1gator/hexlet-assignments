package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {

    public static Map<String, Integer> getWordCount(String text) {
        String[] words = text.split(" ");
        Map<String, Integer> cWords = new HashMap<String, Integer>();

        if (text.length() == 0) {
            return cWords;
        }

        for (String word : words) {

            if (cWords.containsKey(word)) {
                int i = cWords.get(word) + 1;
                cWords.put(word, i);
            } else {
                cWords.put(word, 1);
            }
        }

        return cWords;
    }

    public static String toString(Map<String, Integer> cWords) {
        if (cWords.size() > 0) {
            String result;
            result = "{\n";

            for (Map.Entry<String, Integer> word : cWords.entrySet()) {
                result = result + "  " + word.getKey() + ": " + word.getValue() + "\n";
            }

            result = result + "}";
            return result;
        }

        return "{}";
    }
}
//END
