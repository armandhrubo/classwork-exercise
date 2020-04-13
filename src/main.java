public class main {

    public static void main(String[] args) {

        int num = 100;

        for (int i = 1; i <= num; i++) {

            if (i % 15 == 0) {
                System.out.print("FizzBuzz" + " ");
            }
            else if (i % 5 == 0) {
                System.out.print("Buzz" + " ");
            }
            else if (i % 3 == 0) {
                System.out.print("Fizz" + " ");
            }
            else {
                System.out.print(i + " ");
            }
        }
    }
}