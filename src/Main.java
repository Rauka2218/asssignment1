import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(Fibonacci(n));
    }
    public static int Fibonacci(int n) {
        if(n==1 || n==0) return n;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }


}