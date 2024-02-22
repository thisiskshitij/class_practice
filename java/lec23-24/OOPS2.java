class Student{
    String name;
    int age;

    void printName(){
        System.out.println(this.name);
    }
    void printAge(){
        System.out.println(this.age);
    }
    // creating constructor
    // if we dont create a constructor by ourself then java creates itself a construtor
    
    Student(String name,int age){
        System.out.println("Constructor called!");
        this.name = name;
        this.age = age;
    }

}

public class OOPS2 {
    public static void main(String a[]){
        Student s1 =new Student("Kshitij",23);
        // s1.name ="Shraddha";
        // s1.age = 22;
       System.out.println(s1.name);
       System.out.println(s1.age);
    }
}
