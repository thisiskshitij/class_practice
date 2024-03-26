// interface I{
//     void message();
// }

// public class Main {
//     public static void main(String[] args) {

//         // Using lambda expressions

//         I obj = ()->System.out.println("Hello Java !");
//         obj.message();

//     }
// }
// interface I{
//     int addition(int a ,int b);
// }

// public class Main {
//     public static void main(String[] args) {
//         I obj = (int a,int b)->(return a+b;);
//         // Using lambda expressions
//         int a=5;
//         int b=5;

//         obj.addition(a,b);
//     }
// }
// 1st type is no arguement
// 2nd type is one arguement
// 3rd type is more than one arguement
// block lambda / body

//optional -> type declaration, paranthesis, curly braces these parts can be omitted in the lambda expression

//write a program to implement functional interface using lambda expressions to find the factorial of given number.


interface I {
    int factorial(int n);
}

public class Main {
    public static void main(String[] args) {
        int a=5;
        // Using lambda expressions

        I obj = (n) -> {
            int res = 1, i;
            for (i = 2; i <= n; i++)
                res *= i;
                
            return res;

        };
        System.out.println(obj.factorial(a));

    }
}

//String methods -
    //