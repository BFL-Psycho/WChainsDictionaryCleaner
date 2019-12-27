import java.util.Collections;
import java.util.HashSet;

public class DictionaryCleaner {

    public DictionaryCleaner() {

    }

    public void startCleaning() {
        mergeDictionarySets(null);
        removeNLengthWords(null, 0);
        excludeWordsContainingDigitsAndSymbols(null);
        excludeWholeWordsFromSet(null);
        excludePartialWordsFromSet(null);
        excludeCapitalizedWords(null); //cut down the task by removing cities list or ...
        excludeInvalidWords(null);
        excludeGramaticallyIncorrect(null);
        sortDictionarySet(null);
    }

    // universal merge function
    public HashSet<String> mergeDictionarySets(HashSet<String>[] sets) {

        HashSet<String> result = new HashSet<>();
        //write code here...

        return result;
    }

    // alphabetic sort

    public HashSet<String> sortDictionarySet(HashSet<String> set) {
        return null;
    }

    // remove n-letter words

    public HashSet<String> removeNLengthWords(HashSet<String> set, int wordLength) {
        return null;
    }

    // convert all words to lower case
    public HashSet<String> convertWordsToLowerCase(HashSet<String> set) {
        return null;
    }

    // MANUAL CHECK! universal remove 1 set from another
    public HashSet<String> excludeWholeWordsFromSet(HashSet<String> wordsToExclude) {
        return null;
    }

    public HashSet<String> excludePartialWordsFromSet(HashSet<String> wordsToExclude) {
        return null;
    }

    // Exclude words containing digits, special symbols
    public HashSet<String> excludeWordsContainingDigitsAndSymbols(HashSet<String> wordsToExclude) {
        return null;
    }


    // Exclude non-existent (invalid) words
    public HashSet<String> excludeInvalidWords(HashSet<String> set) {
        return null;
    }

    // MANUAL CHECK! Exclude Capitalized Words Somehow..
    public HashSet<String> excludeCapitalizedWords(HashSet<String> set) {
        return null;
    }

    // Exclude grammatically incorrect words (optional)
    public HashSet<String> excludeGramaticallyIncorrect(HashSet<String> set) {
        return null;
    }


    // universal function load sets from files

    // universal function load set from file

    // universal function save file from set

}
