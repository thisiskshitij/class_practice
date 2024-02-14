// public class Arr {
//     public static void main(String[] a) {
//         int myList []= new int[5];
//         myList[0] = 1;
//         System.out.println(myList);

//     }

// }

// //Math.random is used to generate random numbers

// 2-D array
// by def 1st is row 2nd is col
// int [][] matrix = new int [3][3];

// int [][] matrix = new int({1,2,3},{1,2,3},{1,2,3});

// for (int i =0;i<matrix.length;i++)
// {
//     for (j=0;j<arr[0].length;j++)
//     {
//         System.out.println(matrix[i][j]+" ");
//     }
//     System.out.println();
// }

// }}

//take 2d input from user , transpose that matrix and find sum of all elements

// import java.util.Scanner;

// public class Arrays {
//     public static void main(String a[]) {
//         Scanner sc = new Scanner(System.in);
//         int arr[][] = new int[3][5];
//         int sum = 0;

//         for (int i = 0; i < arr.length; i++) {

//             for (int j = 0; j < arr[0].length; j++) {

//                 arr[i][j] = sc.nextInt();
//                 sum += arr[i][j];
//             }
//         }
//         for (int i = 0; i < 3; i++) {

//             for (int j = 0; j < 3; j++) {

//                 System.out.print(arr[j][i] + " ");
//             }
//             System.out.println();
//         }
//         System.out.println("The sum of transopose of matrix is:"+sum);
//     }
// }

//JAGGED ARRAY - IMPORTANT

// import java.util.Scanner;

// public class Arrays {
//     public static void main(String a[]) {
//         Scanner sc = new Scanner(System.in);
//         int arr[][] = new int[3][];
//         arr[0] = new int[3];
//         arr[1] = new int[1];
//         arr[2] = new int[2];

//         int sum = 0;

//         for (int i = 0; i < arr.length; i++) {

//             for (int j = 0; j < arr[i].length; j++) {

//                 arr[i][j] = sc.nextInt();
//                 sum += arr[i][j];
//             }
//         }
//         System.out.println("Jagged Array is: ");
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {

//                 System.out.print(arr[j][i] + " ");
//             }
//             System.out.println();
//         }
//         System.out.println("The sum of matrix is:" + sum);
//     }
// }



//Arrays is a container class which contains some pre defined methods
//arr Array.sort(); etc..



 