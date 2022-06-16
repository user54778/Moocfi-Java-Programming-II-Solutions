import java.util.ArrayList;
import java.util.HashMap;

/**
 * Class used to store one or more translations for each word in a dictionary.
 */
public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> translations;
    public DictionaryOfManyTranslations() {
        this.translations = new HashMap<>();
    }

    /**
     * Adds the translation for the word and preserves the old translations.
     * @param word original word
     * @param translation translated word
     */
    public void add(String word, String translation) {
        this.translations.putIfAbsent(word, new ArrayList<>());
        this.translations.get(word).add(translation);
    }


    /**
     * Returns a list of the translations added for the word. If the word has no translations,
     * the method returns an empty list.
     * @param word key
     * @return list of translations via getOrDefault method
     */
    public ArrayList<String> translate(String word) {
        // getOrDefault returns the value to which the specified key is mapped, or defaultValue
        // if the map contains NO mapping for the key
        return translations.getOrDefault(word, new ArrayList<>());
    }

    /**
     * Removes the word and all its translations from the dictionary.
     * @param word word
     */
    public void remove(String word) {
        translations.remove(word);
    }
}
