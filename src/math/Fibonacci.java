package math;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
        int previous = 0;
        int next = 1;
        int i;
        for (i = 0;i<40; i++){
        previous = previous + next;
        next = previous - next;
        }
    }
}
