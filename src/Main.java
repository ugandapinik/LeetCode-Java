public class Main {


    public static void main(String[] args){
        String word = "geeksforgeeks";


        //int index = Problem.findLowOccuraingCharacter(word);
        //char result = word.charAt(index);
        //System.out.println(result);


        //boolean result = Problem.isAnagram("silent", "listen");
        //System.out.println(result);


        // REVERSE THE STRING
        //Problem.reverseString(word);

        //Problem.duplicateCharacter("samples");

        //Problem.findVowels("hello");

        //Problem.occurrenceCharacter("hlellllo", 'l');

        //Problem.encodeBlankSpace("Welcome to the world", "%20");


        /**
         *  Permutation &  Combination
         *  ===================================================
         */

        String str = "ABC";
        int length = str.length();

        Problem.permute(str, 0, length - 1);



    }

}
