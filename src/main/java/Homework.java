public class Homework {
    public static void main(String[] args) {
        System.out.println("Hello");
        check(35);
    }

    public static void check(int n) {
        boolean mod3 = n % 3 == 0;
        boolean mod5 = n % 5 == 0;
        if (mod3 && mod5) {
            System.out.println("FizzBuzz");
        } else if (mod3) {
            System.out.println("Fizz");
        } else if (mod5) {
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }
    }
}
