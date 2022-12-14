public class Main {

    static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {

        WordsChecker wordsChecker = new WordsChecker(text);

        String word1 = "eiusmod";
        if (wordsChecker.hasWord(word1)) {
            System.out.println("Слово \"" + word1 + "\" содержится в данном тексте");
        } else {
            System.out.println("Слово \"" + word1 + "\" не содержится в данном тексте");
        }

        String word2 = "fgfgfgfg";
        if (wordsChecker.hasWord(word2)) {
            System.out.println("Слово \"" + word2 + "\" содержится в данном тексте");
        } else {
            System.out.println("Слово \"" + word2 + "\" не содержится в данном тексте");
        }
    }
}
