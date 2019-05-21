import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem {

    private static final int ASCII_SIZE = 256;

    /**
     *
     **Problem-1:** maximum occurring character in an input string.
     **Solution:**

     > we will use a technique called ‘Hashing’.
     In this, when we traverse through the string,
     we would hash each character into an array of ASCII characters.

     Typically, ASCII characters are 256, so we use our Hash array size as 256.
     But if we know that our input string will have characters with value from 0 to 127 only,
     we can limit Hash array size as 128. Similarly, based on extra info known about input string,
     the Hash array size can be limited to 26.
     */

    public static int findMaxOccuringCharacter(String word){
        // finding the length of the word
        int length = word.length();
        int max = 0;

        int count[] = new int[ASCII_SIZE];
        for (int i = 0; i < length; i++){
            count[word.charAt(i)]++;
            if (max < count[word.charAt(i)]){
                max = count[word.charAt(i)];
            }

        }

        return max;
    }


    /**
     *
     * @param word
     * @return
     */
    public static int findLowOccuraingCharacter(String word){
        int[] count = new int[ASCII_SIZE];
        int index = -1;

        for (int i = 0; i < word.length(); i++){
            count[word.charAt(i)]++;
        }
        // finding the length of the word
        for (int i = 0; i < word.length(); i++){

            if (count[word.charAt(i)] == 1){
                index = i;
                break;
            }

        }

        return index;

    }


    /**
     *
     **Problem-2:** check if two String are Anagram
     example: "slient" = "listen", "mary" = "army"
     **Solution:**

     > First check the length both word.
     > Compare both word.

     * @param word
     * @param anagram
     * @return
     */
    public static boolean isAnagram(String word, String anagram){
        // check the length of these two files
        if (word.length() != anagram.length())
            return false;


        char[] characters = word.toCharArray();
        for (char c: characters){
            // check every character and match
            int index = anagram.indexOf(c);
            if (index != -1){
                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
            }else{
                return false;
            }
        }

        return anagram.isEmpty();
    }


    /**
     * Problem-4:** Reverse a string
     * example: "geeksforgeeks" = "skeegrofskeeg"
     *
     *
     * 1. First, convert String to character array
     *    by using the built in Java String class
     *    method toCharArray().
     * 2. Then, scan the string from end  to start,
     *    and print the character one by one.
     *
     * @param word
     */
    public static void reverseString(String word) {
        char[] characters = word.toCharArray();

        for (int i = characters.length - 1; i >= 0; i--){
            System.out.print(characters[i]);
        }
    }
}
