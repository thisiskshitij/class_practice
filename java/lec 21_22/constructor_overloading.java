public class constructor_overloading {
    int id; String name; double marks;

    constructor_overloading(){
        System.out.println("this a default constructor !!");
    }

    constructor_overloading(int i,String f){
        id = i;
        name = f;
    }
    constructor_overloading(int i,String f,double g){
        id = i;
        name = f;
        marks = g;
    }

    

    public static void main(String a[]){
        constructor_overloading S = new constructor_overloading();
        System.out.println("\n Default constructor");
        System.out.println("Student ID: "+S.id+"\n Student name: "+S.name);
        System.out.println();


        System.out.println("\n Paramterized constructor");
        System.out.println();

        constructor_overloading student = new constructor_overloading(12215359,"Kshitij Singh");
        System.out.println("Student ID: "+student.id+"\n Student name: "+student.name);
        System.out.println();

        constructor_overloading s_tudent = new constructor_overloading(12215359,"Kshitij Singh",98.0f);
        System.out.println("Student ID: "+s_tudent.id+"\n Student name: "+s_tudent.name+"\n Student marks "+s_tudent.marks);
    
    }
    }
