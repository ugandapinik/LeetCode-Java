public class ReverseNumber {

    // given number: 321
    public int reverse(int number){
        int reverse = 0;
        while(number != 0){
            // mod of the number
            int digit = number % 10;    // 1
            reverse = reverse * 10 + digit; // 1
            if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
                return 0;
            }
            number = number / 10; // 32.1 == 32
        }


        return reverse;
    }
}
