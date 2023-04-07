import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int n = input.nextInt();
        System.out.println(power(a,n));
    }
    public static int power(int a, int n){
        if(a==0 || a == 1 || n == 1 ){
            return a;
        } else if (n == 0) {
            return 1;
        }
        return a*power(a,n-1);
    }

}