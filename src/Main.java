import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i =(int)Math.sqrt(n);
        if(isPrime(n,i)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }






    }
    public static boolean isPrime(int n, int i){
        if(i <= 1 ){
            return true;

        } else if (n%i==0) {
            return false;
        }
        return isPrime(n,i-1);
    }

}
