// class Object {
// }

// public class object_class {
//     public static void main(String[] args) {
//         String obj = new String("Hi");
//         Class c = obj.getClass();
//         System.out.println("Class of object obj is: " + c.getName());
//     }
// }

//WE ACHIEVE 100% ABSTRACTION USING INTERFACE

// class A {
//     String value = "";

//     A(String value) {
//         this.value = value;
//     }

//     boolean equals(String otherObject) {
//         if (value == otherObject){
//             return true;
//         }
    
//     }

// }

// IN MULTILPLE INHERITANCE , IF WE WANT TO DERIVE SUPERCLASS AND INTERFACE SIMULTANEOUSLY WE FIRST EXTEND THE SUPERCLASS
// THEN IMPLEMENT INTERFACE/INTERFACES

interface Bank{
    double principle= 2000;
    double time = 2;
    void calculateInterest();
}

interface loan{
    
}

class SBI implements Bank{
    private double interestRate = 10;

    public void calculateInterest(){
        System.out.println((principle*time*interestRate)/100);
    }
}
class ICICI implements Bank{
    private double interestRate = 12;

    public void calculateInterest(){
        System.out.println((principle*time*interestRate)/100);
    }
}
class Axis implements Bank{
    private double interestRate = 12;

    public void calculateInterest(){
        System.out.println((principle*time*interestRate)/100);
    }
    
}

public class Main{
    public static void main(String[] args) {
        Bank a = new SBI();
        Bank b = new ICICI();
        Bank c = new Axis();

        a.calculateInterest();
        b.calculateInterest();
        c.calculateInterest();
    }
}

