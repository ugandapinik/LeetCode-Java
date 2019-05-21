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
}
