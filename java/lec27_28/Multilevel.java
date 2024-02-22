// INHERITANCE 

import java.util.Scanner;

class Student {
    int id;
    String name;

    public void setData(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void displayData() {
        System.out.println("Students ID: "+id);
        System.out.println("Students name: "+name);
    }
}

class Marks extends Student {
    int id;
    float javaMarks, cMarks, cppMarks;

    void setMarks(float b, float c, float d) {
        this.javaMarks = b;
        this.cMarks = c;
        this.cppMarks = d;
    }

    void displayMarks() {
        System.out.println("Java marks: " + javaMarks);
        System.out.println("C marks: " + cMarks);
        System.out.println("CPP marks: " + cppMarks);

    }
}

class Result extends Marks {
    float total;
    float average;

    void compute() {
        total = javaMarks + cMarks + cppMarks;
        average = (javaMarks + cMarks + cppMarks) / 3;
    }

    void showResult() {

        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + average);
    }

}

// public class Main {
// public static void main(String str[]) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter java marks: ");
// float b = sc.nextFloat();
// System.out.println("Enter C marks: ");
// float c = sc.nextFloat();
// System.out.println("Enter CPP marks: ");
// float d = sc.nextFloat();

// Result f = new Result();
// f.setMarks(b, c, d);
// f.displayMarks();
// f.compute();
// f.showResult();

// }

public class Multilevel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student id: ");
        int a = sc.nextInt();

        System.out.println("Enter student name: ");
        String e = sc.nextLine();

        System.out.println("Enter java marks: ");
        float b = sc.nextFloat();

        System.out.println("Enter C marks: ");
        float c = sc.nextFloat();

        System.out.println("Enter CPP marks: ");
        float d = sc.nextFloat();

        Result f = new Result();
        f.setData(a, e);
        f.displayData();
        f.setMarks(b, c, d);
        f.displayMarks();
        f.compute();
        f.showResult();

    }

}
