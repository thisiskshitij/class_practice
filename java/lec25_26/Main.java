//Implement heirarchial inheritance structure for given user's input value -
//num1 ,num2
// Super class contain method for rem calc
// Frist subclass calc multiplication operation
// Second sublclass calc division operation

import java.util.Scanner;

class A {

    int num1;
    int num2;

    int rem(int num1, int num2) {
        return num1 % num2;
    }

}

class B extends A {
    int mul(int num1, int num2) {
        return num1 * num2;
    }

}

class C extends A {
    int div(int num1, int num2) {
        return num1 / num2;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num ");
        int num1 = sc.nextInt();
        System.out.println("Enter second num ");
        int num2 = sc.nextInt();

        A a = new A();
        System.out.println("Remainder is: "+ a.rem(num1, num2));
        B b = new B();
        System.out.println("Product is: "+b.mul(num1, num2));
        C c = new C();
        System.out.println("Quotient is: "+c.div(num1, num2));

    }
}