

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String kit, String word) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < kit.length(); i++) {
            list.add(kit.substring(i, i + 1));
        }

        for (int i = 0; i < word.length(); i++) {
            if (list.contains(word.substring(i, i + 1).toLowerCase())) {
                list.remove(word.substring(i, i + 1));
            } else {
                return false;
            }
        }

        return true;
    }
}
//END
