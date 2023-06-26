public class fizzbuzz {
    //for each number from 1-100, print the number
    //if the number is divisible by 3, print fizz
    //if the number is divisible by 5, print buzz
    //if the number is divisible by 3 and 5, print fizzbuzz
    //use a method to determine what to print
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    public static String fizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "fizzbuzz";
        } else if (num % 3 == 0) {
            return "fizz";
        } else if (num % 5 == 0) {
            return "buzz";
        } else {
            return Integer.toString(num);
        }
    }    
}