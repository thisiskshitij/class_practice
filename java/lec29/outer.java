// // Create a java program to implement single inheritance using non static nested class.

// class outer {

//     int a = 10;
//     void m1() {
//         System.out.println("Outer class message: " + a);
//     }


//     class n1 {
//         int a1 = 11;

//         void n1() {
//             System.out.println("Nested base class: " + a + " " + a1);
//         }

//     }

//     class n2 extends n1 {
//         int a2 = 12;

//         void n2() {
//             n1();
//             System.out.println("Derived nested class with values: " + a + " " + a2);

//         }
//     }

//     public static void main(String[] args) {
//         outer obj = new outer();
//         outer.n2 obj1 = obj.new n2();
//         obj1.n2();
//     }

// }


class outer{

    int x=10; static int y=20;
    void demo(){
        int z=30; System.out.println("Local class is loading...");
        class Local{
            int a=10;
            void myLocal(){
                System.out.println("X="+x);
                System.out.println("Y="+y);
                System.out.println("Z="+z);
                System.out.println("A="+a);
            }
        }
        Local obj = new Local();
        obj.myLocal();
    }
    public static void main(String[] args) {
            outer o=new outer();
            o.demo();

    }
}


