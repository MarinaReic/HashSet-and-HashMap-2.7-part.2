import java.util.*;

public class WordsChecker {

    protected String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        String[] wordsArray = text.split("\\P{IsAlphabetic}+");
        Set<String> wordsSet = new HashSet<>(Arrays.asList(wordsArray));
        return wordsSet.contains(word);
    }
}
