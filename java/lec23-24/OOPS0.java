class Student {
    String name;
    int age;

    void printName() {
        System.out.println(this.name);
    }

    void printAge() {
        System.out.println(this.age);
    }

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }

}

class Sum{
    int sumof(int a,int b){
        return a+b;
    }
}

public class OOPS0 {
    public static void main(String a[]) {

        
        Student one = new Student();
        one.name = "Kshitij";
        one.age = 22;

        one.printInfo(one.name);
        one.printInfo(one.age);
        one.printInfo(one.name,one.age);
        
        Sum s = new Sum();
        System.out.println(s.sumof(4,5));

    }
}
