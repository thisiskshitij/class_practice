//Check if number is a palindrome number

public class palindrome {
    public static void main(String[] args) {
        int number = 987654, reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        int result = reverse;
        if (number == reverse)
        {
            System.out.println("Plaindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}


