package lesson10_excep_strings.homework;

import java.io.FileNotFoundException;
import static lesson10_excep_strings.homework.WorkWithStrings.*;

public class MyMain {
    public static void main(String[] args) throws FileNotFoundException {
        showFirstTwoBlocks(getDocNumber());
        hideLetters(getDocNumber());
        showOnlyLetters1(getDocNumber());
        showOnlyLetters2(getDocNumber());
        checkDocContainsSubstring(getDocNumber());
        checkDocStart(getDocNumber());
        checkDocEnd(getDocNumber());
        findShortestAndLongestWords("ab a abcde abc abcd b");
        checkWordWithMinSymbols("dc aaa aa a b aabbba");
        checkIsPalindrome("aboBa i mom Dad hello cc");
        duplicateLettersString("Hello");
        duplicateLettersStringBuilder("Hello");
    }
}