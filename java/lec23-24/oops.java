class Pen {
    // color and type are data
    String color;
    String type; 
    // functions are members
    public void write() {
        System.out.println("Writing Something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}



class Student {
    String name;
    int age;

    public void printName() {
        System.out.println(this.name);
    }

    public void printAge() {
        System.out.println(this.age);
    }
}



public class oops {
    public static void main(String a[]) {
        Pen ocean = new Pen();
        ocean.color = "Sky Blue";
        ocean.type = "Gel";

        ocean.write();

        Pen pentonic = new Pen();
        pentonic.color = "Blue";
        pentonic.type = "Ballpoint";

        ocean.printColor();
        pentonic.printColor();

    }
}
