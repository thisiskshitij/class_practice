import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            int fib=0;
            int a=0;
            int b=1;
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            for (int i=1;i<=num;i++){
                System.out.print(a+" ");
                fib = a+b;
                a=b;
                b=fib;
            }

        }
}
