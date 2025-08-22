package lesson5.multidimensional_array;

public class Tests {
    public static void main(String[] args) {
        String word = "hello";
        String hiddenWordMasked = "*".repeat(word.length());
        String[] hiddenArray = hiddenWordMasked.split("");

        String letter = "l";

        if (word.contains(letter)) {
            System.out.println("Letter is presented in the array!");
            for (int i = 0; i < word.length(); i++) {
                if (word.split("")[i].equals(letter)) {
                    hiddenArray[i] = letter;
                }
            }
            hiddenWordMasked = String.join("", hiddenArray);
            System.out.println(hiddenWordMasked);
        } else {
            System.out.println("Letter is NOT presented in the word");
            System.out.println(hiddenWordMasked);
        }
    }
}
