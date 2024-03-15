// THIS CODE DOESN'T WORK
// fix -  take variable input either 1 2 or 3 (Write code for this cuz cmd args does not work);

import java.util.Scanner;

class Box {
    double width, height, depth;

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double L) {
        width = L;
        height = L;
        depth = L;
    }

    Box(double a, double b, double c) {
        width = a;
        height = b;
        depth = c;
    }

    public double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 0) {
            for (int i = 0; i <= 3; i++)
                System.out.println("Enter value (To stop press enter 0): ");
            sc.nextDouble();
            return;
        }

        if (args.length == 0) {
            double a1 = Double.parseDouble(args[0]);
            Box b = new Box();
            System.out.println("Volume of Box(): " + b.volume());
        }
        if (args.length == 1) {
            double a1 = Double.parseDouble(args[0]);
            double a2 = Double.parseDouble(args[1]);
            Box b1 = new Box();
            System.out.println("Volume of Box(): " + b1.volume());
        }
        if (args.length == 2) {
            double a1 = Double.parseDouble(args[0]);
            double a2 = Double.parseDouble(args[1]);
            double a3 = Double.parseDouble(args[2]);

            Box b2 = new Box(a1, a2, a3);
            System.out.println("Volume of Box(): " + b2.volume());
        }

    }
}
