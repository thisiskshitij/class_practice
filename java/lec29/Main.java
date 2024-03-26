// import java.util.Scanner;

// public class Main {
//     class even{
//         boolean checkEven(int num){
//             if
//             return true;
//         }
//     }
//     class odd{
//          boolean checkOdd(int num){
//             return true;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//     }
// }


class outer{
    private int a;
    outer(int a){
        this.a=a;
    }
    void message(){
        System.out.println("Local class invocation started: ");
        if(a%2==0){
            System.out.println("Number is even number: ");
        }
    }
}