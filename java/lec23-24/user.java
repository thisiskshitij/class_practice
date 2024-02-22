import java.util.Scanner;

public class user {
    public enum Season {
        SUMMER, WINTER, SPRING
    }

    public static void main(String a[]) {

        for (Season s : Season.values())
            System.out.println(s);

        // System.out.println("Enter id: ");
        // int name = Integer.parseInt(System.console().readLine());

        // System.out.println(name);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name: ");
        // String lastname = sc.nextLine();
        // System.out.println(lastname);

        // System.out.println("Enter num 1: ");
        // int NUM1= Integer.parseInt(System.console().readLine());

        // System.out.println("Enter num 2: ");
        // Scanner sc = new Scanner(System.in);
        // int NUM2 = sc.nextInt();

        // System.out.println(NUM1>>NUM2);

        // int[]arr = new int[7];

        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter 7 numbers (separated by spaces): ");
        // for(int i=0;i<arr.length;i++){
        // arr[i]= input.nextInt();
        // }

        // for (int i=0;i<(arr.length);i++){
        // System.out.print(arr[i]);
        // System.out.print(" ");

        // }

        // System.out.println("Your array is: ");

        // int[]myList = {1,2,3,4,5,6,7,8,9};
        // // System.out.println(myList);

        // for (int i=0;i<(myList.length);i++){
        // System.out.print(myList[i]);
        // System.out.print(" ");

        // }

        // 2D ARRAY --
        // int[][] matrix = {{1,2,3},
        // {4,5,6}};
        // System.out.println(matrix[1][0]);

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        // // 2X4 matrix 
        int[][] matrix = new int[rows][columns];

        // // for rows
        for (int i = 0; i < rows; i++) {
            // for columns
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // // output
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < columns; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }

        // Scanner sc = new Scanner(System.in);
        // int rows = sc.nextInt();
        // int cols = sc.nextInt();

        // int matrix[][] = new int[rows][cols];

        // // input
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // matrix[i][j] = sc.nextInt();
        // }
        // }
        // // output
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // System.out.print(matrix[i][j]+" ");
        // }
        // System.out.println();
        // }

    }
}
